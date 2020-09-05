package com.genesis.Dailies.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.genesis.Dailies.Entities.TeacherEntity;

public interface TeacherRepository extends CrudRepository<TeacherEntity, Integer> {

	List<TeacherEntity> findAll();
}
