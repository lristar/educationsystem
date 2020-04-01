package cn.wolfcode.ssm.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.wolfcode.ssm.domain.Employee;
import cn.wolfcode.ssm.query.MyQueryObject;
import cn.wolfcode.ssm.query.PageResult;
import cn.wolfcode.ssm.service.IEmployeeService;

/**
 * 
 * @author 红烛
 *
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService service;
	
	@RequestMapping("/")
	public String Index(){
		return "redirect:/login.jsp";
	}
	
	@RequestMapping("/saveOrUpload")
	public String saveOrUpload(Employee employee){
		service.saveOrUpload(employee);
		return "redirect:/employee/findAll.do";
	}
	
	@RequestMapping("/save")
	public String save(){
		return "forward:/WEB-INF/view/input.jsp";
	}
	
	@RequestMapping("/update")
	public String update(Long id,Model model){
		Employee employee=service.selectById(id);
		model.addAttribute("employee", employee);
		return "forward:/WEB-INF/view/input.jsp";
	}
	
	
	
	@RequestMapping("/delete")
	public String delete(Long id){
		service.delete(id);
		return  "redirect:/employee/findAll.do";
	}
	
	@RequestMapping("/findAll")
	public String findAll(@ModelAttribute("qo") MyQueryObject qo,Model model){
		PageResult result=service.query(qo);
		model.addAttribute("result", result);
		return  "forward:/WEB-INF/view/list.jsp";
	}
	
	
	
	
}
