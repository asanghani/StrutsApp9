package org.delta.action;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	private String userId;
	private String password;
	
	public void validate() {
		if(StringUtils.isEmpty(getUserId())){
			addFieldError("userId","UserID can't be blank");
			
		}
		if(StringUtils.isEmpty(getPassword())){
			addFieldError("password","password can't be blank");
		}
    
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute(){
		System.out.println("IN Loging Action ");
		if(getUserId().equals("userId")&& getPassword().equals("password")){
			return "success";
		}
		return "failure";
	}

}
