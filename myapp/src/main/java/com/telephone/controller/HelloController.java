package com.telephone.controller;

import com.telephone.model.Telephone;
import com.telephone.service.ITelephoneService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class HelloController {
    @Resource
    ITelephoneService telephoneService;

    @RequestMapping("")
    public String index() {
        return "index";
    }

    @RequestMapping("add")
    public String add() {
        return "add";
    }

    @RequestMapping("save")
    @ResponseBody
    public void save(@RequestParam("name") String naem, @RequestParam("telephone") String telephone) {
        Telephone telephoneObj = new Telephone();
        telephoneObj.setName(naem);
        telephoneObj.setTelephone(telephone);
        telephoneService.save(telephoneObj);
    }

    @RequestMapping("delete")
    @ResponseBody
    public void delete(@RequestParam("index") Integer index) {
        telephoneService.delete(index);
    }

    @RequestMapping("list")
    @ResponseBody
    public List<Telephone> list() {
        return telephoneService.getAll();
    }

}
