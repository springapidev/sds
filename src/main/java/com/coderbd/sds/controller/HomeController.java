package com.coderbd.sds.controller;

import com.coderbd.sds.repo.RoleRepo;
import com.coderbd.sds.repo.UserRepo;
import com.coderbd.sds.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

@Autowired
private UserService userService;
    
	@Autowired
    private RoleService roleservice;
	
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "6") int perPage) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title","Hire Us to Build Your  Future ");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/login.do", method = RequestMethod.GET)
    public String login() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (!(auth instanceof AnonymousAuthenticationToken)) {
            /* The user is logged in :) */
            return "redirect:/";
        }
        return "login";
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
        return "/access-denied";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (!(auth instanceof AnonymousAuthenticationToken)) {
            /* The user is logged in :) */
            return "redirect:/";
        }
        return "signup";
    }

    @RequestMapping(value = "/forget-password", method = RequestMethod.GET)
    public String forgetPassword() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (!(auth instanceof AnonymousAuthenticationToken)) {
            /* The user is logged in :) */
            return "redirect:/";
        }
        return "forget-password";
    }
    @Autowired
    UserRepo userRepo;

    @RequestMapping(value = "/port/event.do", method = RequestMethod.GET)
    public String portEvent(Model model) {
        model.addAttribute("users", userRepo.findAll());
        return "event";
    }
    @RequestMapping(value = "/test.do", method = RequestMethod.GET)
    public String testLocale(Model model) {

        return "testlocale";
    }
 
    /*@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
    public void insertdata() {
Role role=new Role();
role.setRolename("ROLE_ADMIN");
roleservice.save(role);
User user=new User();
 Set<Role> roles = new HashSet<>();
       Role role2=roleservice.isAlreadyExist("ROLE_ADMINROLE_ADMIN");                
            roles.add(role2);        
        user.setRoles(roles);
		user.setUsername("admin");
       user.setPassword(passwordEncoder.encode("12345678"));
	   user.email("rajaul.cse@gmail.com");
        user.setJoiningDate(new Date());
        user.setActivated(true);

    }*/
}
