package com.kodlamaio.hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kodlamaio.hrms.business.abstracts.CityService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.dataAccess.abstracts.CityDao;
import com.kodlamaio.hrms.entities.concretes.City;

public class CityManager implements CityService {

	
	private CityDao cityDao;
	
	  @Autowired
	    public CityManager(CityDao cityDao) {
	        this.cityDao = cityDao;
	    }

	  @Override
	    public DataResult<List<City>> getAll() {
	   return new SuccessDataResult<List<City>>(this.cityDao.findAll(), "Listelendi");
	    }

}
