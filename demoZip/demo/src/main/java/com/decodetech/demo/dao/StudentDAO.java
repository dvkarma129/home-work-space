package com.decodetech.demo.dao;

import javax.transaction.Transaction;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.stereotype.Service;

import com.decodetech.demo.dto.StudentDTO;

@Service
public class StudentDAO {

	public void addStudent(StudentDTO model) {
		
		StudentDTO dto = new StudentDTO();
		dto.setStudentId(model.getStudentId());
		dto.setStudentFname(model.getStudentFname());
		dto.setStudentLname(model.getStudentLname());
		dto.setStudentAge(model.getStudentAge());
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();  
		Session ss = sf.openSession();
		Transaction txn = (javax.transaction.Transaction) ss.beginTransaction();
		ss.save(dto);
		
	}

}
