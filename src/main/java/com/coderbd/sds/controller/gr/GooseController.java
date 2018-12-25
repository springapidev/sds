package com.coderbd.sds.controller.gr;


import com.coderbd.sds.repo.GooseEventRepo;
import com.coderbd.sds.repo.GooseRuntimeRepo;
import com.coderbd.sds.repo.GooseScanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/goose/")
public class GooseController {
    @Autowired
    private GooseEventRepo gooseEventRepo;

    @Autowired
    private GooseRuntimeRepo gooseRuntimeRepo;

    @Autowired
    private GooseScanRepo gooseScanRepo;

    @RequestMapping(value = "event.do", method = RequestMethod.GET)
    public ModelAndView getEventList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", gooseEventRepo.findAll());
        modelAndView.setViewName("gooses/event");
        return modelAndView;
    }
    @RequestMapping(value = "runtime.do", method = RequestMethod.GET)
    public ModelAndView getRuntimeList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", gooseRuntimeRepo.findAll());
        modelAndView.setViewName("gooses/runtime");
        return modelAndView;
    }
    @RequestMapping(value = "scan.do", method = RequestMethod.GET)
    public ModelAndView getScanList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", gooseScanRepo.findAll());
        modelAndView.setViewName("gooses/scan");
        return modelAndView;
    }
}
