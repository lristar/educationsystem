package com.lzy.education_system.domain;

public class TProfession
{
	private int id;
	private String name;
	private String jieshao;
	private String del;
	public String getDel()
	{
		return del;
	}
	public void setDel(String del)
	{
		this.del = del;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getJieshao()
	{
		return jieshao;
	}
	public void setJieshao(String jieshao)
	{
		this.jieshao = jieshao;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public TProfession(String name, String jieshao, String del) {
		this.name = name;
		this.jieshao = jieshao;
		this.del = del;
	}
}
