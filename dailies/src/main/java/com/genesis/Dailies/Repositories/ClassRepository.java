package com.genesis.Dailies.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.genesis.Dailies.Entities.ClassEntity;

public interface ClassRepository extends CrudRepository<ClassEntity, Integer> {


	List<ClassEntity> findAllByTeacherId(int teacher_id);

}
