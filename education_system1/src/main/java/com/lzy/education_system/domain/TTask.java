package com.lzy.education_system.domain;


public class TTask
{

	// Fields

	private int id;

	private String mingcheng;
	
	private String fujian;

	private String fujianYuanshiming;
	
	private String shijian;
	
	private String del;

	// Constructors

	/** default constructor */
	public TTask()
	{
	}

	public TTask(int id, String mingcheng, String fujian, String fujianYuanshiming, String shijian, String del) {
		this.id = id;
		this.mingcheng = mingcheng;
		this.fujian = fujian;
		this.fujianYuanshiming = fujianYuanshiming;
		this.shijian = shijian;
		this.del = del;
	}

	public String getShijian()
	{
		return shijian;
	}


	public void setShijian(String shijian)
	{
		this.shijian = shijian;
	}


	public String getMingcheng()
	{
		return mingcheng;
	}



	public void setMingcheng(String mingcheng)
	{
		this.mingcheng = mingcheng;
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

	@Override
	public String toString() {
		return "TTask{" +
				"mingcheng='" + mingcheng + '\'' +
				", fujian='" + fujian + '\'' +
				", fujianYuanshiming='" + fujianYuanshiming + '\'' +
				", shijian='" + shijian + '\'' +
				'}';
	}
}