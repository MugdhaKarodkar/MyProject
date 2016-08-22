package com.niit.shoppingcart.dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;

@EnableTransactionManagement
@Repository(value = "categoryDAO")
public class CategoryDAOImpl implements CategoryDAO 
{
	// declare session factory
	@Autowired
	private SessionFactory sessionFactory;
	private String id;
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
    @Transactional
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

	@Transactional
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

	}
}
