package com.ashokit.dao;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.ashokit.anno.MyTx;

//business class
@Component
public class EmployeeDao {

	@MyTx
	public void saveEmployee() {
		System.out.println("From Save Employee");
		/* if(new Random().nextInt(15)<=10) { throw new
		 * RuntimeException("DUMMY EXCEPTION..!"); }
		 */
	}
}
