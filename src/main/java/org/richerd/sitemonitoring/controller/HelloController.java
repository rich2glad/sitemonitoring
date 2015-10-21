/**
 * 
 */
package org.richerd.sitemonitoring.controller;

import javax.faces.bean.ManagedBean;

/**
 * @author HP
 *
 */
@ManagedBean
public class HelloController {

	public String showHello(){
		return "Hello from Managed Bean";
	}
	
}
