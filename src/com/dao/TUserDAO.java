package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TUser;

/**
 * Data access object (DAO) for domain model class TUser.
 * 
 * @see com.model.TUser
 * @author MyEclipse Persistence Tools
 */

public class TUserDAO extends HibernateDaoSupport
{

	public void save(TUser transientInstance)
	{
			getHibernateTemplate().save(transientInstance);			
	}

	public TUser findById(Integer id)
	{
			TUser instance = (TUser) getHibernateTemplate().get(
					"com.model.TUser", id);
			return instance;	
	}
	

	public void attachDirty(TUser instance)
	{
			getHibernateTemplate().saveOrUpdate(instance);	
	}
}