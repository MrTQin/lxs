package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TGonggao;

public class TGonggaoDAO extends HibernateDaoSupport
{

	public void save(TGonggao transientInstance)
	{
		
			getHibernateTemplate().save(transientInstance);
			
	}

	public void delete(TGonggao persistentInstance)
	{
		
			getHibernateTemplate().delete(persistentInstance);
			
	}

	public TGonggao findById(Integer id)
	{
		
			TGonggao instance = (TGonggao) getHibernateTemplate().get(
					"com.model.TGonggao", id);
			return instance;
		
	}
	public List findAll()
	{
		String queryString = "from TGonggao order by gonggaoId desc";
			return getHibernateTemplate().find(queryString);
		
	}

	


	
}