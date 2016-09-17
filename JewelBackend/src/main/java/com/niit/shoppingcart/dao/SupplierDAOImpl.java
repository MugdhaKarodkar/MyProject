package com.niit.shoppingcart.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import com.niit.shoppingcart.model.Supplier;

@EnableTransactionManagement
@Repository
public class SupplierDAOImpl implements SupplierDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	public SupplierDAOImpl()
	{
		
	}
	public SupplierDAOImpl(SessionFactory sessionFactory) 
	{
		this.sessionFactory = sessionFactory;
	}
    @Transactional
	public boolean saveOrUpdate(Supplier supplier)
    {
		try 
		{
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			return true;
		}
		catch (HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}
    @Transactional
    public List<Supplier> getList()
    {
    	Session session=sessionFactory.openSession();
    	List<Supplier> supplierList =session.createQuery("from Supplier").list();
    	session.close();
    	return supplierList;
    }
    @Transactional
    public String deleteRow(String id) {
  	  Session session = sessionFactory.openSession();
  	  Transaction tx = session.beginTransaction();
  	  Supplier supplier = (Supplier) session.load(Supplier.class, id);
  	  session.delete(supplier);
  	  tx.commit();
  	  Serializable ids = session.getIdentifier(supplier);
  	  session.close();
  	  return (String) ids;
  	 }
    @Transactional
    public Supplier getRowById(String id) 
    {
    	  Session session = sessionFactory.openSession();
    	  Supplier supplier = (Supplier) session.load(Supplier.class, id);
    	  return supplier;
    }
    
    
    /*@Transactional
	public boolean update(Supplier supplier) 
    {
		try 
		{
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		} 
		catch (HibernateException e)
		{
			
			e.printStackTrace();
			return false;
		}
	}*/
    /*@Transactional
	public boolean delete(Supplier supplier) 
    {
		try 
		{
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} 
		catch (HibernateException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}*/
    @Transactional
	public Supplier get(String id) 
    {
    	// select *from Supplier where id ='101'
		String hql = "from Supplier where id =" + " ' " + id + " ' ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Supplier> list = query.list();
		if (list == null)
		{
		  return null;
		} 
		else 
		{
			return list.get(0);
		}
	}
    /*@Transactional
	public List<Supplier> list() 
    {
		String hql = "from Supplier";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}*/
    @Transactional
    public String update(Supplier supplier) {
    	  Session session = sessionFactory.openSession();
    	  Transaction tx = session.beginTransaction();
    	  session.update(supplier);
    	  tx.commit();
    	  Serializable id = session.getIdentifier(supplier);
    	  session.close();
    	  return (String) id;
    	 }

   
}
