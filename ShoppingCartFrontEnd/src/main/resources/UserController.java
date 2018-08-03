import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController 

{
	public ModelAndView validate(@RequestParam String id, @RequestParam String password)
	{
		ModelAndView mv = new ModelAndView("home");
		
		if(id.equals("niit") && password.equals("niit@123"))
		{
			mv.addObject("msg","Welcome Mr/Ms"+ id);
		}
		else
		{
			mv.addObject("msg","Invalid credentials...please try again");
		}
		return mv;
	}
}
