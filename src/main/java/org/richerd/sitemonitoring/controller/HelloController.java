/**
 * 
 */
package org.richerd.sitemonitoring.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.inject.Inject;
import javax.inject.Named;

import org.richerd.sitemonitoring.service.HelloSpringService;
import org.springframework.context.annotation.Scope;

import lombok.Getter;
import lombok.Setter;

/**
 * @author HP
 *
 */

@Getter
@Setter
@ManagedBean
//@Scope("request")
//@Named
public class HelloController {

	@ManagedProperty("#{helloSpringService}")
	//@Inject
	private HelloSpringService helloSpringService;
	
	public String showHello(){
		return helloSpringService.sayHello();
	}


//	public void setHelloSpringService(HelloSpringService helloSpringService) {
//		this.helloSpringService = helloSpringService;
//	}
	
}
