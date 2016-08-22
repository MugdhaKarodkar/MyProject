package com.niit.shoppingcart.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import com.niit.shoppingcart.model.UserDetails;

@EnableTransactionManagement
@Repository(value="userDetailsDAO")
public class UserDetailsDAOImpl implements UserDetailsDAO
{
    // declare session factory
	@Autowired
	private SessionFactory sessionFactory;
	public UserDetailsDAOImpl(SessionFactory sessionFactory) 
	{
		this.sessionFactory = sessionFactory;
	}
    @Transactional
	public boolean save(UserDetails category)
    {
		try 
		{
			sessionFactory.getCurrentSession().save(category);
			return true;
		}
		catch (HibernateException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
    @Transactional
	public boolean update(UserDetails category) 
    {
		try 
		{
			sessionFactory.getCurrentSession().update(category);
			return true;
		} 
		catch (HibernateException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
    @Transactional
	public boolean delete(UserDetails category) 
    {
		try 
		{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		} 
		catch (HibernateException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
    @Transactional
	public UserDetails get(String id) 
    {
    	// select *from UserDetails where id ='101'
		String hql = "from UserDetails where id =" + " ' " + id + " ' ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<UserDetails> list = query.list();
		if (list == null)
		{
		  return null;
		} 
		else 
		{
			return list.get(0);
		}
	}
    @Transactional
	public List<UserDetails> list() 
    {
		String hql = "from UserDetails";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
}
