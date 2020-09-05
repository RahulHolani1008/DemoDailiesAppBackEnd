package com.genesis.Dailies.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.genesis.Dailies.Entities.ClassEntity;
import com.genesis.Dailies.Entities.ParentEntity;

public interface ParentRepository extends CrudRepository<ParentEntity, Integer> {

	List<ParentEntity> findAll();
}
