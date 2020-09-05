package com.genesis.Dailies.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.genesis.Dailies.Entities.ClassEntity;
import com.genesis.Dailies.Entities.StudentEntity;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {

	List<StudentEntity> findAllByClassId(int class_id);




}
