package com.niit.shoppingcart.dao;

import java.io.Serializable;
import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.mapping.Selectable;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import com.niit.shoppingcart.model.Category;


@EnableTransactionManagement
@Repository
public class CategoryDAOImpl implements CategoryDAO 
{
	// declare session factory
	@Autowired
	private SessionFactory sessionFactory;
	private String id;
	public CategoryDAOImpl()
	{
		
	}
    public CategoryDAOImpl(SessionFactory sessionFactory) 
    {
		this.sessionFactory = sessionFactory;
	}
    @Transactional
	public boolean saveorupdate(Category category) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(category);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}
	}
    /*@Transactional
	public boolean delete(Category category) 
	{
		try 
		{
			String hql = "from Category where id =" + " ' " + id + " ' ";
			sessionFactory.getCurrentSession().delete(category);
			System.out.println("Category is deleted");
			return true;
		} catch (Exception e) 
		{
            e.printStackTrace();
			return false;
		}
	}*/
    public String deleteRow(String id) {
    	  Session session = sessionFactory.openSession();
    	  Transaction tx = session.beginTransaction();
    	  Category category = (Category) session.load(Category.class, id);
    	  session.delete(category);
    	  tx.commit();
    	  Serializable ids = session.getIdentifier(category);
    	  session.close();
    	  return (String) ids;
    	 }


	
    @Transactional
	public Category get(String id) {
		// select *from Category where id ='101'
		String hql = "from Category where id =" + " ' " + id + " ' ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Category> list = query.list();
		if (list == null || list.isEmpty()) {
			return null;
		} else {
			return list.get(0);
		}
	}

	/*@Transactional
	public List<Category> list() 
	{
		String hql = "from Category";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Category> list = query.list();
		if (list == null || list.isEmpty()) 
		{
			return null;
		}
		return list;

	}*/
    @Transactional
    public List<Category> getList()
    {
    	Session session=sessionFactory.openSession();
    	List<Category> categoryList =session.createQuery("from Category").list();
    	session.close();
    	return categoryList;
    }
    @Transactional
    public Category getRowById(String id) {
    	  Session session = sessionFactory.openSession();
    	  Category category = (Category) session.load(Category.class, id);
    	  return category;
    	 }
    @Transactional
    public String update(Category category) {
    	  Session session = sessionFactory.openSession();
    	  Transaction tx = session.beginTransaction();
    	  session.update(category);
    	  tx.commit();
    	  Serializable id = session.getIdentifier(category);
    	  session.close();
    	  return (String) id;
    	 }

   }
