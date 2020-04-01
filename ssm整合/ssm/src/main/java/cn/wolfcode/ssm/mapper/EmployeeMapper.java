package cn.wolfcode.ssm.mapper;

import cn.wolfcode.ssm.domain.Employee;
import cn.wolfcode.ssm.query.MyQueryObject;
import cn.wolfcode.ssm.query.PageResult;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface EmployeeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Employee record);

    Employee selectByPrimaryKey(Long id);

    List<Employee> selectAll();

    int updateByPrimaryKey(Employee record);
    
    List<Employee> queryForList(MyQueryObject qo);
    
	int queryForCount(MyQueryObject qo);
	
//	PageResult query(MyQueryObject qo);
	
	Employee login (@Param("username")String username,@Param("password")String password);
}