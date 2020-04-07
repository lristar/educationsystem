package com.lzy.education_system.domain;

public class TProblem
{



	private int id;
	private String name;
	private String xuanxianga;
	private String xuanxiangb;

	private String xuanxiangc;
	private String xuanxiangd;
	private String daan;
	private int fenshu;
	private int type;
	private String del;

	// Constructors

	/** default constructor */
	public TProblem()
	{
	}

	public TProblem(String name, String xuanxianga, String xuanxiangb, String xuanxiangc, String xuanxiangd, String daan, int fenshu, int type, String del) {
		this.name = name;
		this.xuanxianga = xuanxianga;
		this.xuanxiangb = xuanxiangb;
		this.xuanxiangc = xuanxiangc;
		this.xuanxiangd = xuanxiangd;
		this.daan = daan;
		this.fenshu = fenshu;
		this.type = type;
		this.del = del;
	}

	public String getDaan()
	{
		return daan;
	}

	public void setDaan(String daan)
	{
		this.daan = daan;
	}

	public String getDel()
	{
		return del;
	}

	public void setDel(String del)
	{
		this.del = del;
	}

	


	public int getFenshu()
	{
		return fenshu;
	}

	public void setFenshu(int fenshu)
	{
		this.fenshu = fenshu;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getXuanxianga()
	{
		return xuanxianga;
	}

	public void setXuanxianga(String xuanxianga)
	{
		this.xuanxianga = xuanxianga;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getXuanxiangb()
	{
		return xuanxiangb;
	}

	public void setXuanxiangb(String xuanxiangb)
	{
		this.xuanxiangb = xuanxiangb;
	}

	public String getXuanxiangc()
	{
		return xuanxiangc;
	}

	public void setXuanxiangc(String xuanxiangc)
	{
		this.xuanxiangc = xuanxiangc;
	}

	public String getXuanxiangd()
	{
		return xuanxiangd;
	}

	public void setXuanxiangd(String xuanxiangd)
	{
		this.xuanxiangd = xuanxiangd;
	}

	@Override
	public String toString() {
		return "TProblem{" +
				"id=" + id +
				", name='" + name + '\'' +
				", xuanxianga='" + xuanxianga + '\'' +
				", xuanxiangb='" + xuanxiangb + '\'' +
				", xuanxiangc='" + xuanxiangc + '\'' +
				", xuanxiangd='" + xuanxiangd + '\'' +
				", daan='" + daan + '\'' +
				", fenshu=" + fenshu +
				", type=" + type +
				", del='" + del + '\'' +
				'}';
	}
}