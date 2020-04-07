package com.lzy.education_system.domain;


public class TVideo
{

	// Fields

	private int id;

	private String title;
	
	private String content;

	private String fujian;

	private String fujianYuanshiming;
	
	private String shijian;
	
	private String del;

	// Constructors

	/** default constructor */
	public TVideo()
	{
	}

	public TVideo(int id, String title, String content, String fujian, String fujianYuanshiming, String shijian, String del) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.fujian = fujian;
		this.fujianYuanshiming = fujianYuanshiming;
		this.shijian = shijian;
		this.del = del;
	}

	public String getContent()
	{
		return content;
	}


	public void setContent(String content)
	{
		this.content = content;
	}


	public String getTitle()
	{
		return title;
	}


	public String getShijian()
	{
		return shijian;
	}


	public void setShijian(String shijian)
	{
		this.shijian = shijian;
	}


	public void setTitle(String title)
	{
		this.title = title;
	}


	public String getFujian()
	{
		return this.fujian;
	}

	public void setFujian(String fujian)
	{
		this.fujian = fujian;
	}

	public String getFujianYuanshiming()
	{
		return this.fujianYuanshiming;
	}

	public void setFujianYuanshiming(String fujianYuanshiming)
	{
		this.fujianYuanshiming = fujianYuanshiming;
	}

	public String getDel()
	{
		return this.del;
	}


	public void setDel(String del)
	{
		this.del = del;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}