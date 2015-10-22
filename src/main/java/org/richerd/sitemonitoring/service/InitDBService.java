package org.richerd.sitemonitoring.service;

import javax.annotation.PostConstruct;

import org.richerd.sitemonitoring.entity.Check;
import org.richerd.sitemonitoring.repository.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitDBService {

	@Autowired
	private CheckRepository checkRepository;
	
	@PostConstruct
	public void init(){
		{
		Check check = new Check();
		check.setName("example");
		check.setUrl("http://www.example.com");
		checkRepository.save(check);
		}
		{
			Check check = new Check();
			check.setName("sitemonitoring");
			check.setUrl("http://www.sitemonitoring.sourceforge.net");
			checkRepository.save(check);
			}
		{
			Check check = new Check();
			check.setName("javavids");
			check.setUrl("http://www.javavids.com");
			checkRepository.save(check);
			}
		
	}
	
	
}
