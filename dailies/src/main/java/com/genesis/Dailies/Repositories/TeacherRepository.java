package com.genesis.Dailies.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.genesis.Dailies.Entities.ParentEntity;
import com.genesis.Dailies.Entities.TeacherEntity;

public interface TeacherRepository extends CrudRepository<TeacherEntity, Integer> {

}
