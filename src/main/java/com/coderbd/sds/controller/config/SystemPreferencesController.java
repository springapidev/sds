package com.coderbd.sds.controller.config;


import com.coderbd.sds.dto.EthernetSwicthDTO;
import com.coderbd.sds.dto.SaParentDTO;
import com.coderbd.sds.dto.SntpDTO;
import com.coderbd.sds.entity.nmsConfig.Device;
import com.coderbd.sds.entity.nmsConfig.EthernetSwitch;
import com.coderbd.sds.entity.nmsConfig.SaParent;
import com.coderbd.sds.entity.nmsConfig.Sntp;
import com.coderbd.sds.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.*;

@Controller
@RequestMapping("/config/")
public class SystemPreferencesController {
    @Autowired
    private DeviceRepo repo;

    @Autowired
    private IedRepo iedRepo;

    @Autowired
    private SaParentRepo saParentRepo;

    @Autowired
    private SntpRepo sntpRepo;

    @Autowired
    private EthernetSwitchRepo ethernetSwitchRepo;

    @RequestMapping(value = "sa-create.do", method = RequestMethod.GET)
    public ModelAndView getView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("obj", new Device());
        modelAndView.addObject("list", repo.findAll());
        modelAndView.setViewName("config/sa-parent-create");
        return modelAndView;
    }

    @RequestMapping(value = "sa-create.do", method = RequestMethod.POST)
    public ModelAndView saveOrUpdate(@Valid Device obj, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("config/sa-parent-create");
        } else {
            obj.setType("SA Top Operating Devices");
            repo.save(obj);
            Device device = repo.findByName(obj.getName());
            int portNo = 1;
            for (int i = 1; i <= obj.getPort(); i++) {
                SaParent saParent = new SaParent();
                saParent.setDevice(device);
                saParent.setIpAddress("1.3.6.1.2.1.2.2.1.8." + portNo);
                portNo++;
                saParent.setCreatedDate(new Date());
                saParent.setStatus("Disconnected");
                saParentRepo.save(saParent);
            }
            modelAndView.addObject("obj", new Device());
            modelAndView.addObject("successMessage", "Insert Success");
        }
        modelAndView.addObject("obj", new Device());
        modelAndView.setViewName("config/sa-parent-create");
        return modelAndView;
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    public String updateRole(@PathVariable Integer id, Model model) {
        Optional<Device> obj1 = repo.findById(id);
        model.addAttribute("obj", obj1);
        return "config/device";
    }

    @RequestMapping(value = "del/{id}", method = RequestMethod.GET)
    public String delRole(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("successMessage", "Delete Success");
        return "redirect:/config/device.do";
    }

    @RequestMapping(value = "device.do", method = RequestMethod.GET)
    public ModelAndView getList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", repo.findAll());
        modelAndView.setViewName("config/device-list");
        return modelAndView;
    }

    @RequestMapping(value = "sntp-create.do", method = RequestMethod.GET)
    public ModelAndView getViewSntp() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("obj", new Device());
        modelAndView.addObject("list", repo.findAll());
        modelAndView.setViewName("config/sntp-create");
        return modelAndView;
    }

    @RequestMapping(value = "sntp-create.do", method = RequestMethod.POST)
    public ModelAndView saveOrUpdateSnTp(@Valid Device obj, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("config/sntp-create");
        } else {
            obj.setType("SNTP");
            repo.save(obj);
            Device device = repo.findByName(obj.getName());
            int portNo = 1;
            for (int i = 1; i <= obj.getPort(); i++) {
                Sntp sntp = new Sntp();
                sntp.setDevice(device);
                sntp.setIpAddress("1.3.6.1.2.1.2.2.1.8." + portNo);
                portNo++;
                sntp.setCreatedDate(new Date());
                sntp.setStatus("Disconnected");
                sntpRepo.save(sntp);
            }
            modelAndView.addObject("obj", new Device());
            modelAndView.addObject("successMessage", "Insert Success");
        }
        modelAndView.addObject("obj", new Device());
        modelAndView.setViewName("config/sntp-create");
        return modelAndView;
    }

    @RequestMapping(value = "es-create.do", method = RequestMethod.GET)
    public ModelAndView getViewEs() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("obj", new Device());
        modelAndView.addObject("list", repo.findAll());
        modelAndView.setViewName("config/ethernet-switch-create");
        return modelAndView;
    }

    @RequestMapping(value = "es-create.do", method = RequestMethod.POST)
    public ModelAndView saveOrUpdateEs(@Valid Device obj, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("config/ethernet-switch-create");
        } else {
            obj.setType("Ethernet Switch");
            repo.save(obj);
            Device device = repo.findByName(obj.getName());
            int portNo = 1;
            for (int i = 1; i <= obj.getPort(); i++) {
                EthernetSwitch es = new EthernetSwitch();
                es.setDevice(device);
                es.setIpAddress("1.3.6.1.2.1.2.2.1.8." + portNo);
                portNo++;
                es.setCreatedDate(new Date());
                es.setStatus("Disconnected");
                ethernetSwitchRepo.save(es);
            }
            modelAndView.addObject("obj", new Device());
            modelAndView.addObject("successMessage", "Insert Success");
        }
        modelAndView.addObject("obj", new Device());
        modelAndView.setViewName("config/ethernet-switch-create");
        return modelAndView;
    }

    @RequestMapping(value = "ethernet-switch.do", method = RequestMethod.GET)
    public ModelAndView getViewEthernetswitch() {
        ModelAndView modelAndView = new ModelAndView();
        List<EthernetSwicthDTO> list = new ArrayList<>();
        Map<String, List<EthernetSwitch>> maps = new HashMap<>();
        for (EthernetSwitch es : ethernetSwitchRepo.findAll()) {
            maps.put(es.getDevice().getName(), ethernetSwitchRepo.findAllByDevice(es.getDevice()));
        }
        System.out.println("nameList: " + maps.size());
        for (Map.Entry<String, List<EthernetSwitch>> entry : maps.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
            list.add(new EthernetSwicthDTO(entry.getKey(), entry.getValue()));
        }
        modelAndView.addObject("eslist", list);


        List<SaParentDTO> saList = new ArrayList<>();
        Map<String, List<SaParent>> saMaps = new HashMap<>();
        for (SaParent es : saParentRepo.findAll()) {
            saMaps.put(es.getDevice().getName(), saParentRepo.findAllByDevice(es.getDevice()));
        }

        for (Map.Entry<String, List<SaParent>> entry : saMaps.entrySet()) {
            saList.add(new SaParentDTO(entry.getKey(), entry.getValue()));
        }
        modelAndView.addObject("salist", saList);


        List<SntpDTO> sntpList = new ArrayList<>();
        Map<String, List<Sntp>> sntpMaps = new HashMap<>();
        for (Sntp es : sntpRepo.findAll()) {
            sntpMaps.put(es.getDevice().getName(), sntpRepo.findAllByDevice(es.getDevice()));
        }

        for (Map.Entry<String, List<Sntp>> entry : sntpMaps.entrySet()) {
            sntpList.add(new SntpDTO(entry.getKey(), entry.getValue()));
        }
        modelAndView.addObject("sntplist", sntpList);

        modelAndView.setViewName("config/ethernet-switch");
        return modelAndView;
    }
}
