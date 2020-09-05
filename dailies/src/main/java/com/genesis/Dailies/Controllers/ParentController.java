package com.genesis.Dailies.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.genesis.Dailies.Entities.ParentEntity;
import com.genesis.Dailies.Services.ParentService;



@RestController
@RequestMapping("dailies/parent")
@CrossOrigin("*")
public class ParentController {
 
	@Autowired
	ParentService parentService;
	@RequestMapping(method = RequestMethod.POST, path = "/ragister")
	public ParentEntity parentRagister(@RequestBody ParentEntity parentEntity){
		return parentService.parentRagisters(parentEntity);
	}
}
