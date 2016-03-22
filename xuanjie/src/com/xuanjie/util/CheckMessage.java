package com.xuanjie.util;


public class CheckMessage {
	public static Boolean check(String parameters,String sign) {
		if(SySystem.MD5(parameters).equals(sign)){
			return true;
		}else{
			return false;
		}
	}
}
