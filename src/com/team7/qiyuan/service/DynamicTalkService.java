package com.team7.qiyuan.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.team7.qiyuan.entity.DynamicTalk;
import com.team7.qiyuan.mapper.TalkMapper;
import com.team7.qiyuan.util.DateUtil;

@Service
public class DynamicTalkService {
	
	@Autowired
	private TalkMapper talkMapper;
	
	public boolean add(DynamicTalk dynamicTalk) {
		//获取当前时间
		dynamicTalk.setTalkTime(DateUtil.getNow(DateUtil.DATE_YMDHMS3));
		return talkMapper.add(dynamicTalk);
	}

	public boolean deleteByTime(String time) {
		return talkMapper.deleteByTime(time);
/*		return tmp.deleteByTime(time);*/
	}
	
	public List<DynamicTalk> selectTalk(DynamicTalk dynamicTalk){
		return talkMapper.selectTalk(dynamicTalk);
	}

	public boolean deleteId(String dynamicId) {
		return talkMapper.deleteId(dynamicId);
	}
}
