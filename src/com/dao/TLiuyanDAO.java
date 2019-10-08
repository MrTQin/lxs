package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TLiuyan;


public class TLiuyanDAO extends HibernateDaoSupport
{

	public void save(TLiuyan transientInstance)
	{
		
			getHibernateTemplate().save(transientInstance);
			
	}

	public void delete(TLiuyan persistentInstance)
	{
		
			getHibernateTemplate().delete(persistentInstance);
			
	}

	public TLiuyan findById(java.lang.Integer id)
	{
		
			TLiuyan instance = (TLiuyan) getHibernateTemplate().get(
					"com.model.TLiuyan", id);
			return instance;
		
	}

	public void attachDirty(TLiuyan instance)
	{
		
			getHibernateTemplate().saveOrUpdate(instance);
			
	}

	

	
}