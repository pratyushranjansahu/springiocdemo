package com.workshop.springiocdemo.beans;

import org.springframework.lang.Nullable;

public class PersonNullableBean {
	private String nickName;
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(@Nullable String nickName) {
		if (nickName != null && nickName.isEmpty()) {
            nickName = null;
        }
        this.nickName = nickName;
		this.nickName = nickName;
	}
	
	
}
