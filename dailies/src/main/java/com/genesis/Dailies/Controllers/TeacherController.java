package com.genesis.Dailies.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.genesis.Dailies.Entities.ClassEntity;
import com.genesis.Dailies.Entities.TeacherEntity;
import com.genesis.Dailies.Services.TeacherService;

@RestController
@RequestMapping("dailies/teacher")
@CrossOrigin("*")
public class TeacherController {

	@Autowired
	TeacherService teacherService;
	
	@RequestMapping(method = RequestMethod.POST, path = "/register")
	public TeacherEntity teacherRagister(@RequestBody TeacherEntity teacherEntity){
		return teacherService.teacherRagisters(teacherEntity);
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/getall")
	public List<TeacherEntity> getAllTeachers() {
		return  teacherService.getAllTeachers();
	}
}
