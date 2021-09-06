	/* 判断手机号码 */
	document.querySelector("#phone").onblur = function(){
		phone = document.querySelector("#phone").value;
		var ret = /^1[0-9]{10}$/.test(phone);
		if(ret == true){
			document.querySelector("#spanPhone").innerHTML = "<span>√</span>";
		}else if(ret == false){
			document.querySelector("#spanPhone").innerHTML = "手机号码输入有误！"
		}
	}
	
	/* 判断身份证 */
	document.getElementById("idCard").onblur = function(){
		idCard = document.getElementById("idCard").value;
		var ret = /^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|[X])$/.test(idCard);
		if(ret == true){
			document.querySelector("#spanIdCard").innerHTML = "√";
		}else if(ret == false){
			document.querySelector("#spanIdCard").innerHTML = "身份证错误！"
		}
	}
	
	/* 判断密码 */
	document.querySelector("#myInputTwo").onblur = function(){
		pwd = document.querySelector("#myInputTwo").value;
		var ret = /^\d{0,}\w{0,}$/.test(pwd);
		if(ret == true){
			document.querySelector("#spanPwd").innerHTML = "√";
		}else if( ret == false){
			document.querySelector("#spanPwd").innerHTML = "密码输入有误！"
		}
	}
	