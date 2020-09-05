package com.genesis.Dailies.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.genesis.Dailies.Entities.ClassEntity;
import com.genesis.Dailies.Services.ClassService;



@RestController
@RequestMapping("dailies/class")
@CrossOrigin("*")
public class ClassController {
 
	@Autowired
	ClassService classService;
	@RequestMapping(method = RequestMethod.POST, path = "/add")
	public ClassEntity classAdd(@RequestBody ClassEntity classEntity){
		return classService.classesAdd(classEntity);
	}
}
