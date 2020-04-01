package cn.wolfcode.ssm.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.wolfcode.ssm.domain.Employee;
import cn.wolfcode.ssm.mapper.EmployeeMapper;
import cn.wolfcode.ssm.query.MyQueryObject;
import cn.wolfcode.ssm.query.PageResult;
import cn.wolfcode.ssm.service.IEmployeeService;
import cn.wolfcode.ssm.util.UserContext;
@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	private EmployeeMapper mapper;
	
	@Override
	public void saveOrUpload(Employee employee) {
		if(employee.getId()==null){
			mapper.insert(employee);
		}
		mapper.updateByPrimaryKey(employee);
	}

	@Override
	public void delete(Long id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public Employee selectById(Long id) {
		Employee employee=mapper.selectByPrimaryKey(id);
		return employee;
	}

	@Override
	public PageResult query(MyQueryObject qo) {
		int totalCount=mapper.queryForCount(qo);
		if(totalCount==0){
			return PageResult.getEMPTY_PAGE();
		}
		List<Employee> listDate=mapper.queryForList(qo);
		return new PageResult(qo.getCurrentPage(),qo.getPageSize(),listDate,totalCount);
	}

	@Override
	public void login(String username, String password) {
		Employee employee=mapper.login(username, password);
		if(employee==null){
			throw new RuntimeException("用户名或密码错误");
		} 
		//登陆成功 将用户信息存入session
		UserContext.setCurrentUser(employee);
	}	
}
