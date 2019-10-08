package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TXianlu;



public class TXianluDAO extends HibernateDaoSupport
{
	public void save(TXianlu transientInstance)
	{
		getHibernateTemplate().save(transientInstance);
	}

	public void delete(TXianlu persistentInstance)
	{
			getHibernateTemplate().delete(persistentInstance);
	}

	public TXianlu findById(java.lang.Integer id)
	{
			TXianlu instance = (TXianlu) getHibernateTemplate().get(
					"com.model.TXianlu", id);
			return instance;
	}
	public List findAll()
	{
			String queryString = "from TXianlu";
			return getHibernateTemplate().find(queryString);
	}
	public void attachDirty(TXianlu instance)
	{
		getHibernateTemplate().saveOrUpdate(instance);
	}
}