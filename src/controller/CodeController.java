package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import data.Bio;
import data.BioDAO;

@Controller
@SessionAttributes("current")
public class CodeController {
	@Autowired
	private BioDAO bioDAO;
	
	@ModelAttribute("current")
	public Integer initSessionObject() {
		return 1;
	}
	
	@RequestMapping(path="GetProfileData.do", 
			params="sign",
			method=RequestMethod.GET)
	public ModelAndView getBySign(@RequestParam("sign") String s) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("listProfiles.jsp");
		mv.addObject("profiles", bioDAO.getProfileBySign(s));
			
		return mv;
	}
	
	@RequestMapping(path="GetProfileData.do", 
			params="animal",
			method=RequestMethod.GET)
	public ModelAndView getByAnimal(@RequestParam("animal") String a) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("listProfiles.jsp");
		mv.addObject("profiles", bioDAO.getProfileByAnimal(a));
		return mv;
	}
	
	@RequestMapping(path="GetProfileData.do", 
			params="name",
			method=RequestMethod.GET)
	public ModelAndView getByName(@RequestParam("name") String n) {
		System.out.println("Inside getByName");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("listProfiles.jsp");
		mv.addObject("profiles", bioDAO.getProfileByName(n));
		return mv;
	}
	
	@RequestMapping(path = "CreateBio.do", method = RequestMethod.POST)
	public ModelAndView newBio(Bio bio) {
		bioDAO.addBio(bio);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("listProfiles.jsp");
		return mv;
	}
	
	@RequestMapping(path = "EditBio.do", method = RequestMethod.POST)
	public ModelAndView editBio(Bio bio) {
		bioDAO.editBio(bio);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("listProfiles.jsp");
		return mv;
	}
	
	@RequestMapping(path = "getAllBios.do", method = RequestMethod.GET)
	public ModelAndView getAllBios() {
		bioDAO.getAllBios();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("listAllProfiles.jsp");
		mv.addObject("profiles", bioDAO.getAllBios());
		System.out.println("inside getAllBios");
		return mv;
	}

}
