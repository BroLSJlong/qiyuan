	document.querySelector("#phone").onblur = function(){
		phone = document.querySelector("#phone").value;
		var ret = /^1[0-9]{10}$/.test(phone);
		if(ret == false){
			document.getElementById("span1").innerHTML = "账号输入有误！"
		}else if(ret == true){
			document.getElementById("span1").innerHTML = "√"
		} 
	}
	document.querySelector("#myInputTwo").onblur = function(){
		pwd = document.querySelector("#myInputTwo").value;
		var ret = /^\d{0,}\w{0,}$/.test(pwd);
		if(ret == true){
			document.getElementById("span2").innerHTML = "√"
		}else if(ret == false){
			document.getElementById("span2").innerHTML = "密码输入有误！"
		}
	}