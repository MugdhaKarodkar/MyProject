package com.niit.shoppingcart.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import com.niit.shoppingcart.model.Product;

@EnableTransactionManagement
@Repository(value = "productDAO")
public class ProductDAOImpl implements ProductDAO {
	// declare session factory
	private static final Logger log = LoggerFactory.getLogger(ProductDAOImpl.class);
	// private static final Logger log = LoggerFactory.getLogger("com.niit.JewelBackEnd.dao.Product");
	@Autowired
	private SessionFactory sessionFactory;

	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean saveorupdate(Product product) {

		try {
			//log.debug("srating of method saveorupdate");
			sessionFactory.getCurrentSession().saveOrUpdate(product);
			//log.debug("end of method saveorupdate");
			return true;
		} catch (Exception e) {
			//log.error("exception occured in save method" + e.getMessage());
			e.printStackTrace();
			return false;
		}

	}

	@Transactional
	public boolean delete(Product product) {
		try {
			//log.debug("srating of meth");
			//System.out.println("product is deleted");
			sessionFactory.getCurrentSession().delete(product);
			System.out.println("product is deleted");
			//log.debug("end of meth");
			return true;
		} catch (Exception e) {
			//log.error("exception occured in save method" + e.getMessage());
			e.printStackTrace();
			return false;
		}

	}

	@SuppressWarnings("unchecked")
	@Transactional
	public Product get(String id) {
		// select *from Product where id ='101'
		
		//log.debug("starting of meth get");
		//log.info("trying to get product based on id:" + id);
		String hql = "from Product where id =" + " ' " + id + " ' ";
		//log.info("the hql query is:" + hql);

		@SuppressWarnings("rawtypes")

		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		@SuppressWarnings("deprecation")

		List<Product> list = (List<Product>) query.list();
		if (list == null || list.isEmpty()) {
			//log.info("no products are available with this id:" + id);
			return null;
		} else 
		{
			return list.get(0);
		}
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Product> list() {
		//log.debug("starting of the method list");
		String hql = "from Product";
		@SuppressWarnings("rawtypes")
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		//log.debug("starting of the method list");
		@SuppressWarnings("deprecation")
		List<Product> list = query.list();
		if (list == null || list.isEmpty()) 
		{
			//log.info("no products are available");
			return null;
		}
		// return query.list();
		return list;
	}
}
