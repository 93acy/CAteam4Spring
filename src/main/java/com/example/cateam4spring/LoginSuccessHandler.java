package com.example.cateam4spring;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.example.cateam4spring.service.MyUserDetails;

@Component
public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MyUserDetails userDetails = (MyUserDetails) authentication.getPrincipal();
				
		String redirectURL = request.getContextPath();
        
        if (userDetails.hasRole("ADMIN")) {
            redirectURL = "admin_home";
        } else if (userDetails.hasRole("STUDENT")) {
        	//HttpSession session = request.getSession(true);
    		//Integer s = userDetails.getId();
    		//session.setAttribute("studentSession", s);
            redirectURL = "student_home";
        } else if (userDetails.hasRole("LECTURER")) {
            redirectURL = "lecturer_home";
        }
         
        response.sendRedirect(redirectURL);
	}
	
	
	
	/*public void createSession(Authentication authentication) {
		HttpSession session = request.getSession(true);
		
		MyUserDetails userDetails = (MyUserDetails) authentication.getPrincipal();
		Integer s = userDetails.getId();
		session.setAttribute("studentSession", s);
	}*/
	
}
