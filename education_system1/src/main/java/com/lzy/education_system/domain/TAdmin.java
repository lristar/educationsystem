package com.lzy.education_system.domain;



public class TAdmin
{

	private int userId;
	
	private String userName;

	private String userPw;

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getUserPw()
	{
		return userPw;
	}

	public void setUserPw(String userPw)
	{
		this.userPw = userPw;
	}

	public int getUserId()
	{
		return userId;
	}

	public void setUserId(int userId)
	{
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "TAdmin{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				", userPw='" + userPw + '\'' +
				'}';
	}
}
