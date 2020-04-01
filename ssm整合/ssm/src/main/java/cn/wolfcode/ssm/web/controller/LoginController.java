package cn.wolfcode.ssm.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.wolfcode.ssm.service.IEmployeeService;

@Controller
public class LoginController {
	@Autowired
	private IEmployeeService service;
	
	@RequestMapping("/login")
	public String login(String username,String password,Model model){
		String viewName="redirect:/employee/findAll.do";
		try {
			service.login(username, password);
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			viewName="forward:/login.jsp";
		}
		return viewName;
	}
	
	@RequestMapping("/loginOut")
	public String loginOut(HttpSession session){
		//銷毀session
		session.invalidate();
		return "redirect:/login.jsp";
	}
}
