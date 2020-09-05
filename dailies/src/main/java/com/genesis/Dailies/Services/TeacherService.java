package com.genesis.Dailies.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	

}
