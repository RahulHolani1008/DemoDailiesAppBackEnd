package com.genesis.Dailies.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genesis.Dailies.Entities.ClassEntity;
import com.genesis.Dailies.Entities.ParentEntity;
import com.genesis.Dailies.Entities.StudentEntity;
import com.genesis.Dailies.Repositories.ClassRepository;
import com.genesis.Dailies.Repositories.ParentRepository;
import com.genesis.Dailies.Repositories.StudentRepository;

@Service
public class StudentService {

 @Autowired
 StudentRepository studentRepository;
 
 @Autowired
 ClassRepository classRepository;


public StudentEntity studentEnroll(StudentEntity studentEntity) {
	if(studentEntity.getClassId() > 0 && studentEntity != null) {
		ClassEntity classEntity = classRepository.findById(studentEntity.getClassId()).get();
		classEntity.setCountOfStudent(classEntity.getCountOfStudent()-1);
		classRepository.save(classEntity);
		studentRepository.save(studentEntity);
	}else {
		studentEntity = studentRepository.save(studentEntity);
	}
	return studentEntity;
}


public List<StudentEntity> getstudentsByClassId(int class_id) {
	List<StudentEntity> listOfStudent = new ArrayList<>();
	if(class_id >0) {
		listOfStudent =studentRepository.findAllByClassId(class_id);
		}
	return listOfStudent;
}


public String deleteStudent(int student_id) {
	
	if(student_id>0)
	{
		studentRepository.deleteById(student_id);
		return "successfully Deleted";
	}else {
		return "missing argument";
	}
	
}


public String deleteStudentByClassId(int class_id, int student_id) {
	if( student_id > 0 && class_id > 0) {
		ClassEntity classEntity = classRepository.findById(class_id).get();
		classEntity.setCountOfStudent(classEntity.getCountOfStudent()+1);
		classRepository.save(classEntity);
		studentRepository.deleteById(student_id);
		return "successfully Deleted";
	}else {
		return "missing argument";
	}

}
	

}
