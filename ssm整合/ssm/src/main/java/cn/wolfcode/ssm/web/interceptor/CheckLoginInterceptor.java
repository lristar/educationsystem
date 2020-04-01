package cn.wolfcode.ssm.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import cn.wolfcode.ssm.util.UserContext;

/**
 * 登陆拦截器
 * 
 * @author 红烛
 *
 */
public class CheckLoginInterceptor extends HandlerInterceptorAdapter {
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 判断当前用户是否登录,已登录则放行,没登录则不放行,并且回到登录界面
		if (UserContext.getCurrentUser() == null) {
			// 没有登录则不放行,并且回到登录界面
			response.sendRedirect("/login.jsp");
			return false;
		}
		return true; // 已登录则放行
	}
}
