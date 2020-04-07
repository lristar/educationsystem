package com.lzy.education_system.domain;

public class TTea
{
	private int id;
	private String bianhao;
	private String name;
	private String sex;
	private int age;
	private int type;
	private String del;
	private String loginpw;

	public String getLoginpw() {
		return loginpw;
	}

	public void setLoginpw(String loginpw) {
		this.loginpw = loginpw;
	}

	public TTea() {
	}

	public TTea(String bianhao, String name, String sex, int age, int type, String del, String loginpw) {
		this.bianhao = bianhao;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.type = type;
		this.del = del;
		this.loginpw = loginpw;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getDel() {
		return del;
	}

	public void setDel(String del) {
		this.del = del;
	}

	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getBianhao()
	{
		return bianhao;
	}
	public void setBianhao(String bianhao)
	{
		this.bianhao = bianhao;
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
	public String getSex()
	{
		return sex;
	}
	public void setSex(String sex)
	{
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "TTea{" +
				"id=" + id +
				", bianhao='" + bianhao + '\'' +
				", name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", age=" + age +
				", del='" + del + '\'' +
				", loginpw='" + loginpw + '\'' +
				'}';
	}
}
