package com.genesis.Dailies.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genesis.Dailies.Entities.ParentEntity;
import com.genesis.Dailies.Repositories.ParentRepository;

@Service
public class ParentService {

@Autowired
ParentRepository parentRepository;


public ParentEntity parentRagisters(ParentEntity parentEntity) {
	
	if(parentEntity != null) {
	parentEntity = parentRepository.save(parentEntity);
	}
	return parentEntity;
}
	

}
