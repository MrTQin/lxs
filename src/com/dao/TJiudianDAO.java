package com.dao;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TJiudian;


public class TJiudianDAO extends HibernateDaoSupport {



	public void save(TJiudian transientInstance) {
		
			getHibernateTemplate().save(transientInstance);
			
	}

	public void delete(TJiudian persistentInstance) {
		
			getHibernateTemplate().delete(persistentInstance);
			
	}

	public TJiudian findById(Integer id) {
		
			TJiudian instance = (TJiudian) getHibernateTemplate().get(
					"com.model.TJiudian", id);
			return instance;
		
	}
	public List findAll() {
		
			String queryString = "from TJiudian";
			return getHibernateTemplate().find(queryString);
		
	}


	public void attachDirty(TJiudian instance) {
		
			getHibernateTemplate().saveOrUpdate(instance);
			
	}



}