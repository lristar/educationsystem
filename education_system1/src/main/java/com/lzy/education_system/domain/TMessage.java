package com.lzy.education_system.domain;


public class TMessage
{
	private int id;
	private String title;
	private String content;
	private String shijian;
	private int user_id;
	private int type;
	private String user_name;

	public TMessage(int id, String title, String content, String shijian, int user_id, int type) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.shijian = shijian;
		this.user_id = user_id;
		this.type = type;
	}

	public TMessage(String title, String content, String shijian, int user_id, int type) {
		this.title = title;
		this.content = content;
		this.shijian = shijian;
		this.user_id = user_id;
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getContent()
	{
		return content;
	}
	public void setContent(String content)
	{
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShijian()
	{
		return shijian;
	}
	public void setShijian(String shijian)
	{
		this.shijian = shijian;
	}
	
	public String getUser_name()
	{
		return user_name;
	}
	public void setUser_name(String user_name)
	{
		this.user_name = user_name;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "TMessage{" +
				"id='" + id + '\'' +
				", title='" + title + '\'' +
				", content='" + content + '\'' +
				", shijian='" + shijian + '\'' +
				", user_id=" + user_id +
				", type=" + type +
				", user_name='" + user_name + '\'' +
				'}';
	}
}
