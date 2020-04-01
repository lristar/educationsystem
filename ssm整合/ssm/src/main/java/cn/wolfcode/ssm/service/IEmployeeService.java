package cn.wolfcode.ssm.service;

import cn.wolfcode.ssm.domain.Employee;
import cn.wolfcode.ssm.query.MyQueryObject;
import cn.wolfcode.ssm.query.PageResult;

public interface IEmployeeService {
	void saveOrUpload(Employee employee);
	void delete(Long id);
	Employee selectById(Long id);
	/*------------------分页 条件查询---------------------*/
	PageResult query(MyQueryObject qo);
	void login (String username,String password);
}
