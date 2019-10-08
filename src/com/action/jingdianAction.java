package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TGonggaoDAO;
import com.dao.TJingdianDAO;
import com.model.TAdmin;
import com.model.TGonggao;
import com.model.TJingdian;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class jingdianAction extends ActionSupport
{
	private int id;
	private String name;
	private String dizhi;
	private int menpiao;
	
	private String jieshao;
	private String fujian;
	
	private String message;
	private String path;
	
	private TJingdianDAO jingdianDAO;
	
	public String jingdianAdd()
	{
		TJingdian jingdian=new TJingdian();
		
		jingdian.setName(name);
		jingdian.setDizhi(dizhi);
		jingdian.setMenpiao(menpiao);
		jingdian.setJieshao(jieshao);
		jingdian.setFujian(fujian);
		jingdian.setDel("no");
		
		jingdianDAO.save(jingdian);
		this.setMessage("�����ɹ�");
		this.setPath("jingdianMana.action");
		return "succeed";
	}
	
	
	public String jingdianMana()
	{
		List jingdianList =jingdianDAO.getHibernateTemplate().find("from TJingdian where del='no'");
		ActionContext.getContext().getSession().put("jingdianList", jingdianList);
		return ActionSupport.SUCCESS;//success
	}
	
	public String jingdianDel()
	{
		TJingdian jingdian=jingdianDAO.findById(id);
		jingdian.setDel("yes");
		jingdianDAO.getHibernateTemplate().update(jingdian);
		this.setMessage("�����ɹ�");
		this.setPath("jingdianMana.action");
		return "succeed";
	}
	
	
	public String jingdianPre()
	{
		TJingdian jingdian=jingdianDAO.findById(id);
		ActionContext.getContext().getSession().put("jingdian", jingdian);
		return ActionSupport.SUCCESS;
	}
	
	public String jingdianEdit()
	{
		TJingdian jingdian=jingdianDAO.findById(id);

		jingdian.setName(name);
		jingdian.setDizhi(dizhi);
		jingdian.setMenpiao(menpiao);
		jingdian.setJieshao(jieshao);
		jingdian.setFujian(fujian);
		jingdian.setDel("no");
		
		jingdianDAO.attachDirty(jingdian);
		this.setMessage("�����ɹ�");
		this.setPath("jingdianMana.action");
		return "succeed";
		
	}
	


	public String jingdianAll()
	{
		List jingdianList =jingdianDAO.getHibernateTemplate().find("from TJingdian where del='no'");
		ActionContext.getContext().getSession().put("jingdianList", jingdianList);
		return ActionSupport.SUCCESS;
	}
	
	public String jingdianDetailQian()
	{
		TJingdian jingdian=jingdianDAO.findById(id);
		ActionContext.getContext().getSession().put("jingdian", jingdian);
		return ActionSupport.SUCCESS;
	}
	
	public String jingdianSearch()
	{
		String sql="from TJingdian where del='no' and name like '%"+name+"%'";
		List jingdianList =jingdianDAO.getHibernateTemplate().find(sql);
		ActionContext.getContext().getSession().put("jingdianList", jingdianList);
		return ActionSupport.SUCCESS;//�൱��success
	}

	public String getDizhi()
	{
		return dizhi;
	}


	public void setDizhi(String dizhi)
	{
		this.dizhi = dizhi;
	}


	public String getFujian()
	{
		return fujian;
	}


	public void setFujian(String fujian)
	{
		this.fujian = fujian;
	}


	public int getId()
	{
		return id;
	}


	public void setId(int id)
	{
		this.id = id;
	}


	public String getJieshao()
	{
		return jieshao;
	}


	public void setJieshao(String jieshao)
	{
		this.jieshao = jieshao;
	}


	public TJingdianDAO getJingdianDAO()
	{
		return jingdianDAO;
	}


	public void setJingdianDAO(TJingdianDAO jingdianDAO)
	{
		this.jingdianDAO = jingdianDAO;
	}


	public int getMenpiao()
	{
		return menpiao;
	}


	public void setMenpiao(int menpiao)
	{
		this.menpiao = menpiao;
	}


	public String getMessage()
	{
		return message;
	}


	public void setMessage(String message)
	{
		this.message = message;
	}


	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public String getPath()
	{
		return path;
	}


	public void setPath(String path)
	{
		this.path = path;
	}
	
}
