package com.exam.ejb.controller;

import com.exam.ejb.entity.Employees;
import com.exam.ejb.model.SpringModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Calendar;

@Controller
public class EmployessController {

    @Autowired
     private SpringModel springModel;
    @RequestMapping(path = "/employ/list", method = RequestMethod.GET)
    public String getList(Model model, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit) {
        Page<Employees> pagination = springModel.findAll( PageRequest.of(page - 1, limit));
        model.addAttribute("pagination", pagination);
        model.addAttribute("page", page);
        model.addAttribute("limit", limit);
        model.addAttribute("datetime", Calendar.getInstance().getTime());
        return "employess-list";
    }
}
