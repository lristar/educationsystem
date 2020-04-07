package com.lzy.education_system.domain;

public class TAnnouncement
{
	private int id;
	private String title;
	private String content;
	private String shijian;
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
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}

	@Override
	public String toString() {
		return "TAnnouncement{" +
				"id=" + id +
				", title='" + title + '\'' +
				", content='" + content + '\'' +
				", shijian='" + shijian + '\'' +
				'}';
	}
}
