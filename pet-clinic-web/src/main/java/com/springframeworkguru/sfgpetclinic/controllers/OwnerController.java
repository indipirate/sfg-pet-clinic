package com.springframeworkguru.sfgpetclinic.controllers;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("Owners")
public class OwnerController {

	@RequestMapping({"","/index","/index.html"})
	public String  listOwners(){
		return "owners/index";
	}
}
