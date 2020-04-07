
package com.lzy.education_system.domain;

public class TStu {
	private int id;
	private String xuehao;
	private String name;
	private String sex;
	private int age;
	private int banji_id;
	private int type;
	private String ruxueshijian;
	private String del;
	private String loginpw;
	private String banji;

	public String getBanji() {
		return banji;
	}

	public void setBanji(String banji) {
		this.banji = banji;
	}

	public String getLoginpw() {
		return loginpw;
	}

	public void setLoginpw(String loginpw) {
		this.loginpw = loginpw;
	}

	//    private String banji_name;

	public TStu() {
	}

	public TStu(String xuehao, String name, String sex, int age, int banji_id, String ruxueshijian, String del) {
		this.xuehao = xuehao;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.banji_id = banji_id;
		this.ruxueshijian = ruxueshijian;
		this.del = del;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	//	public String getBanji_name()
//	{
//		return banji_name;
//	}
//	public void setBanji_name(String banji_name)
//	{
//		this.banji_name = banji_name;
//	}
	public String getDel() {
		return del;
	}

	public void setDel(String del) {
		this.del = del;
	}


	public int getBanji_id() {
		return banji_id;
	}

	public void setBanji_id(int banji_id) {
		this.banji_id = banji_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRuxueshijian() {
		return ruxueshijian;
	}

	public void setRuxueshijian(String ruxueshijian) {
		this.ruxueshijian = ruxueshijian;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getXuehao() {
		return xuehao;
	}

	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}

	@Override
	public String toString() {
		return "TStu{" +
				"id=" + id +
				", xuehao='" + xuehao + '\'' +
				", name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", age=" + age +
				", banji_id=" + banji_id +
				", ruxueshijian='" + ruxueshijian + '\'' +
				", del='" + del + '\'' +
				", loginpw='" + loginpw + '\'' +
				", banji='" + banji + '\'' +
				'}';
	}

	public TStu(String xuehao, String name, String sex, int age,int type, int banji_id, String ruxueshijian, String del, String loginpw) {
		this.xuehao = xuehao;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.type=type;
		this.banji_id = banji_id;
		this.ruxueshijian = ruxueshijian;
		this.del = del;
		this.loginpw = loginpw;
	}
}
