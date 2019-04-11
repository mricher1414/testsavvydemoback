package com.example.Timesheet.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Timesheet.com.dao.IDepartementDAO;
import com.example.Timesheet.com.model.Departement;

@Service
public class DepartementService {
	
	@Autowired
	private IDepartementDAO departement;
	
	public List<Departement> getDepartements(){
		
		return (List<Departement>) this.departement.findAll();
		
	}
	
	public void saveDepartement(Departement departement) {
		this.departement.save(departement);	
	}
	
	public void deleteDepartement(Departement departement) {
		this.departement.delete(departement);	
	}

}
