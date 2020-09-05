package com.genesis.Dailies.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genesis.Dailies.Entities.ClassEntity;
import com.genesis.Dailies.Entities.TeacherEntity;
import com.genesis.Dailies.Repositories.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	TeacherRepository teacherRepository;


	public TeacherEntity teacherRagisters(TeacherEntity teacherEntity) {
		
		if(teacherEntity != null) {
			teacherEntity = teacherRepository.save(teacherEntity);
		}
		return teacherEntity;
	}
	
	public List<TeacherEntity> getAllTeachers() {
		
		List<TeacherEntity> getAllTeachers = new ArrayList<>();
		
		List<TeacherEntity> allTeachers=(List<TeacherEntity>) teacherRepository.findAll();
		
		if(!allTeachers.isEmpty()) {
		for(TeacherEntity newTeacher:allTeachers)
		{
			
			getAllTeachers.add(newTeacher);
			
		}
		}
		return getAllTeachers;
	}

}
