package com.minasan.common.controller;

import com.minasan.common.dto.Item;
import com.minasan.common.services.ItemsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class GreetingsController {
    @Resource
    private ItemsService itemsService;

    @RequestMapping(value = "/hello", method = {RequestMethod.GET})
    public ModelAndView greetUser(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView("greetings");
		model.addObject("msg", "wazup");

		return model;
	}

    @RequestMapping(value = "/items", method = {RequestMethod.GET})
    @ResponseBody
    public List<Item> fetchUsers() {
        return itemsService.fetchItems();
    }
}