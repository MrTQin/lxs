package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TGonggaoDAO;
import com.dao.TJiudianDAO;
import com.model.TAdmin;
import com.model.TGonggao;
import com.model.TJiudian;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class jiudianAction extends ActionSupport
{
	private int id;
	private String mingcheng;
	private String dizhi;
	private String dianhua;
	private String jieshao;
	
	private String message;
	private String path;
	
	private TJiudianDAO jiudianDAO;
	
	public String jiudianAdd()
	{
		TJiudian jiudian=new TJiudian();
		
		jiudian.setMingcheng(mingcheng);
		jiudian.setDizhi(dizhi);
		jiudian.setDianhua(dianhua);
		jiudian.setJieshao(jieshao);
		
		jiudianDAO.save(jiudian);
		this.setMessage("酒店信息添加完毕");
		this.setPath("jiudianMana.action");
		return "succeed";
	}
	
	
	public String jiudianMana()
	{
		List jiudianList =jiudianDAO.findAll();
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("jiudianList", jiudianList);
		return ActionSupport.SUCCESS;
	}
	
	public String jiudianDel()
	{
		TJiudian jiudian=jiudianDAO.findById(id);
		jiudianDAO.delete(jiudian);
		this.setMessage("酒店信息删除完毕");
		this.setPath("jiudianMana.action");
		return "succeed";
	}
	
	public String jiudianPre()
	{
		TJiudian jiudian=jiudianDAO.findById(id);
		
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("jiudian", jiudian);
		return ActionSupport.SUCCESS;
		
	}
	
	
	public String jiudianEdit()
	{
		TJiudian jiudian=jiudianDAO.findById(id);
		
		jiudian.setMingcheng(mingcheng);
		jiudian.setDizhi(dizhi);
		jiudian.setDianhua(dianhua);
		jiudian.setJieshao(jieshao);
		
		jiudianDAO.attachDirty(jiudian);
		this.setMessage("酒店信息修改完毕");
		this.setPath("jiudianMana.action");
		return "succeed";
		
	}
	
	public String jiudianAll()
	{
		List jiudianList =jiudianDAO.findAll();
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("jiudianList", jiudianList);
		return ActionSupport.SUCCESS;
	}
	
	
	
	public String jiudianDetailQian()
	{
		TJiudian jiudian=jiudianDAO.findById(id);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("jiudian", jiudian);
		
		return ActionSupport.SUCCESS;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMingcheng() {
		return mingcheng;
	}


	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}


	public String getDizhi() {
		return dizhi;
	}


	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}


	public String getDianhua() {
		return dianhua;
	}


	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}


	public String getJieshao() {
		return jieshao;
	}


	public void setJieshao(String jieshao) {
		this.jieshao = jieshao;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	public TJiudianDAO getJiudianDAO() {
		return jiudianDAO;
	}


	public void setJiudianDAO(TJiudianDAO jiudianDAO) {
		this.jiudianDAO = jiudianDAO;
	}
	
}
