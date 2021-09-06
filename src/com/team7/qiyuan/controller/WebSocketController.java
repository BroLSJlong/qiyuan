package com.team7.qiyuan.controller;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

import com.team7.qiyuan.util.StrUtil;

@ServerEndpoint("/WebSocketController/{idCard}")
@Component
public class WebSocketController {
	
	private static Map<String,Session> sessions = new ConcurrentHashMap<String,Session>();
	
	@OnOpen
	public void onOpen(Session session,@PathParam("idCard") String idCard) {
		sessions.put(idCard, session);
	}
	
	@OnClose
	public void onClose(Session session) {
		String sessionId = session.getId();
		for(String id : sessions.keySet()) {
			if(StrUtil.equals(sessions.get(id).getId(), sessionId)) {
				sessions.remove(id);
			}
		}
	}
	
	@OnMessage
	public void onMessage(String message) {
		boolean b = true;
		String id = message.substring(18,36);
		for(String targetIdCard : sessions.keySet()) {
			if(StrUtil.equals(targetIdCard, id)) {
				sessions.get(targetIdCard).getAsyncRemote().sendText(message);
				b = false;
				break;
			}
		}
		if(b) {
			sessions.get(message.substring(0,18)).getAsyncRemote().sendText(message);
		}
	}
	
	@OnError
	public void onError(Session session,Throwable error) {
		error.printStackTrace();
	}
}
