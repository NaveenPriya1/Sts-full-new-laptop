package springmodelview;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	
	@RequestMapping("/first")
	public ModelAndView displayId(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView mv = new ModelAndView();
		Student s =new Student();
		String Id = req.getParameter("id");
		s.setId(Id);
		mv.setViewName("display.jsp");
		mv.addObject("objectname", s);
		return mv;
	}
	
	
	
	@RequestMapping("/second")
	public String displayName(HttpServletRequest req, HttpServletResponse res) {
		return null;
	}

}
