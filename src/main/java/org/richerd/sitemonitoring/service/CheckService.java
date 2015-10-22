package org.richerd.sitemonitoring.service;

import java.util.List;

import org.richerd.sitemonitoring.entity.Check;
import org.richerd.sitemonitoring.repository.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckService {

	@Autowired
	CheckRepository checkRepository;
	
	public List<Check> findAll(){
		return checkRepository.findAll();
	}

	public void save(Check check) {
		checkRepository.save(check);
		
	}

	public void remove(Check check) {
		checkRepository.delete(check);
		
	}
}
