package com.dao;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TJingdian;



public class TJingdianDAO extends HibernateDaoSupport
{
	public void save(TJingdian transientInstance)
	{
			getHibernateTemplate().save(transientInstance);
	}

	public void delete(TJingdian persistentInstance)
	{
			getHibernateTemplate().delete(persistentInstance);
	}

	public TJingdian findById(Integer id)
	{
	
			TJingdian instance = (TJingdian) getHibernateTemplate().get(
					"com.model.TJingdian", id);
			return instance;
	}
	public List findAll()
	{
		
			String queryString = "from TJingdian";
			return getHibernateTemplate().find(queryString);
	}
	public void attachDirty(TJingdian instance)
	{
			getHibernateTemplate().saveOrUpdate(instance);
	}
}