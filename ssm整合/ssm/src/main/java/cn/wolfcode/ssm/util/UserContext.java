package cn.wolfcode.ssm.util;

import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.wolfcode.ssm.domain.Employee;

public class UserContext {
	private UserContext(){};
	
	public static final String EMP_IN_SESSION="EMP_IN_SESSION";
	
	public static void setCurrentUser(Employee emp){
		getSession().setAttribute("EMP_IN_SESSION", emp);
	    
	}
	
	public static Employee getCurrentUser(){
		return (Employee) getSession().getAttribute(EMP_IN_SESSION);
	    
	}
	
	
	public static HttpSession getSession(){
		ServletRequestAttributes attrs=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		return attrs.getRequest().getSession();
	}
}
