package com.coderbd.sds.controller.nmsConfig;


import com.coderbd.sds.entity.nmsConfig.Data;
import com.coderbd.sds.repo.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Controller
@RequestMapping("/data/")
public class DataController {
    @Autowired
    private DataRepo repo;

    @RequestMapping(value = "create", method = RequestMethod.GET)
    public ModelAndView getView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("obj", new Data());
        modelAndView.setViewName("data/create");
        return modelAndView;
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ModelAndView saveOrUpdate(@Valid Data obj, BindingResult bindingResult) {
        ModelAndView modelAndView=new ModelAndView();
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("data/create");
        } else {
                repo.save(obj);
                modelAndView.addObject("successMessage", "Insert Success");
            }
            modelAndView.addObject("obj", new Data());
            modelAndView.setViewName("data/create");
        return modelAndView;
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    public String updateRole(@PathVariable Integer id, Model model) {
        Optional<Data> obj1 = repo.findById(id);
        model.addAttribute("obj",obj1);
        return "data/create";
    }

    @RequestMapping(value = "del/{id}", method = RequestMethod.GET)
    public String delRole(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("successMessage", "Delete Success");
        return "redirect:/data/create";
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public ModelAndView getList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", repo.findAll());
        modelAndView.setViewName("data/list");
        return modelAndView;
    }
}
