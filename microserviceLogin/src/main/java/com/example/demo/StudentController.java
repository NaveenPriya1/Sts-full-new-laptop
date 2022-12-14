package com.example.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo srepo;
	
	RestTemplate rest = new RestTemplate();
	Logger log=Logger.getAnonymousLogger();
	
	@ResponseBody
	@RequestMapping("login")
	public String checkLogin(HttpServletRequest req,HttpServletResponse res) {
		log.info("Entered into login method");
		String user=req.getParameter("user");
		String pwd=req.getParameter("pwd");
		if(srepo.findByName(user)!=null) {
			log.info("verified the credentials matching");
			return "Login successfull"+"\n"+"welcome to "+user;
		}else {
			log.info("login failed");
			return "register first";
		}
	}
	
	@RequestMapping("register")
	public String microServiceOfRegister(HttpServletRequest req,HttpServletResponse res) {
		log.info("enter into register in login");
		String user=req.getParameter("user");
		String pwd=req.getParameter("pwd");
		String email=req.getParameter("email");
		String url= "http://localhost:8090/register-user/"+user+"/"+pwd+"/"+email;
		log.info(url);
		log.info("succesfull compl 88888888888888");
		rest.getForObject(url,String.class);
		log.info("succesfull completed url in loginm");
		log.info("succesfull compl999999999999");
		return "success";
		
	}

}
