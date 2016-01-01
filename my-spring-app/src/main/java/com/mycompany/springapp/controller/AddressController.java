package com.mycompany.springapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.springapp.dao.AddressDao;
import com.mycompany.springapp.model.Address;

@Controller
@RequestMapping("/address/")
public class AddressController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@Autowired
	private AddressDao addressDao;
	
	@RequestMapping(method=RequestMethod.POST, value="address") 
	public String saveAddress(@ModelAttribute Address addr) {
		logger.debug("Received postback on person "+addr);		
		addressDao.save(addr);
		return "redirect:ist";
		
	}
}
