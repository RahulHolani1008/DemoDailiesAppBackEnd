package com.genesis.Dailies.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.genesis.Dailies.Entities.ClassEntity;
import com.genesis.Dailies.Entities.ParentEntity;
import com.genesis.Dailies.Entities.StudentEntity;
import com.genesis.Dailies.Services.ParentService;
import com.genesis.Dailies.Services.StudentService;



@RestController
@RequestMapping("dailies/student")
@CrossOrigin("*")
public class StudentController {
 
	@Autowired
	StudentService studentService;
	
	@RequestMapping(method = RequestMethod.POST, path = "/enroll")
	public StudentEntity studentEnroll(@RequestBody StudentEntity studentEntity){
		return studentService.studentEnroll(studentEntity);
	}
	
	@RequestMapping(path = "/getstudent/{class_id}" , method=RequestMethod.GET)
	public List<StudentEntity> getStudent(@PathVariable int class_id) {
		return  studentService.getstudentsByClassId(class_id);
	}
}
