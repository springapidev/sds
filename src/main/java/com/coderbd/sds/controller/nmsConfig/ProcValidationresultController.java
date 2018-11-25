package com.coderbd.sds.controller.nmsConfig;




import com.coderbd.sds.entity.nmsConfig.ProcValidationResult;
import com.coderbd.sds.repo.ProcValidationResultRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/pbresult/")
public class ProcValidationresultController {
    @Autowired
    private ProcValidationResultRepo repo;

    @RequestMapping(value = "create.do", method = RequestMethod.GET)
    public ModelAndView getView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("obj", new ProcValidationResult());
        modelAndView.setViewName("pbresult/create");
        return modelAndView;
    }

    /**
     *
     * @param obj
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "create.do", method = RequestMethod.POST)
    public ModelAndView saveOrUpdate(@Valid ProcValidationResult obj, BindingResult bindingResult) {
        ModelAndView modelAndView=new ModelAndView();
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("pbresult/create");
        } else {
                repo.save(obj);
                modelAndView.addObject("successMessage", "Insert Success");
            }
            modelAndView.addObject("obj", new ProcValidationResult());
            modelAndView.setViewName("pbresult/create");
        return modelAndView;
    }

    /**
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    public String updateRole(@PathVariable Integer id, Model model) {
        Optional<ProcValidationResult> obj1 = repo.findById(id);
        model.addAttribute("obj",obj1);
        return "pbresult/create";
    }

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "del/{id}", method = RequestMethod.GET)
    public String delRole(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("successMessage", "Delete Success");
        return "redirect:/pbresult/create";
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "list.do", method = RequestMethod.GET)
    public ModelAndView getList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", repo.findAll());
        modelAndView.setViewName("pbresult/list");
        return modelAndView;
    }
}
