package com.genesis.Dailies.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genesis.Dailies.Entities.ClassEntity;
import com.genesis.Dailies.Repositories.ClassRepository;

@Service
public class ClassService {

@Autowired
ClassRepository classRepository;


public ClassEntity classesAdd(ClassEntity classEntity) {
	if(classEntity != null) {
		classEntity.setCountOfStudent(4);
		classEntity = classRepository.save(classEntity);
	}
	return classEntity;
}


public List<ClassEntity> getClassesByTeacherId(int teacher_id) {
	List<ClassEntity> listOfClass = new ArrayList<>();
	if(teacher_id >0) {
		listOfClass =classRepository.findAllByTeacherId(teacher_id);
		}
	return listOfClass;
}
	

}
