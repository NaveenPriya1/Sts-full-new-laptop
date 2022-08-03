package com.example.demo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepo srepo;

	Logger log= Logger.getAnonymousLogger();
	
	@RequestMapping("/register-user/{user}/{pwd}/{email}")
	public ModelAndView register(@PathVariable("user") String user,@PathVariable("pwd") String pwd,@PathVariable("email") String email, HttpServletRequest req,HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Student s = new Student();
		log.info("data recied from loginms"+user+" "+pwd+" "+email);
		log.info("setter started");
		s.setSuser(user);
		s.setSpwd(pwd);
		s.setEmail(email);
		log.info("insertion started");
		Student ss=srepo.save(s);
		log.info("insertion started 44444444");
		mv.setViewName("display");
		mv.addObject("studentobj", ss);
		log.info("insertion started 55555555");
		
		log.info("insertion started 66666666");
		return mv;
	}

}
