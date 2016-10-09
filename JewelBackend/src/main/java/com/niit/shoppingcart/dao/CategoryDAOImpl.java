package com.niit.shoppingcart.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import com.niit.shoppingcart.model.Category;

@EnableTransactionManagement
@Repository
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDAOImpl() {

	}

	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean save(Category category) {
		try {
			sessionFactory.getCurrentSession().save(category);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}
	}

	/*
	 * @Transactional public boolean delete(Category category) { try { String
	 * hql = "from Category where id =" + " ' " + id + " ' ";
	 * sessionFactory.getCurrentSession().delete(category); System.out.println(
	 * "Category is deleted"); return true; } catch (Exception e) {
	 * e.printStackTrace(); return false; } }
	 */
	public String deleteRow(String category_id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Category category = (Category) session.load(Category.class, category_id);
		session.delete(category);
		tx.commit();
		Serializable ids = session.getIdentifier(category);
		session.close();
		return (String) ids;
	}

	@Transactional
	public Category get(String category_id) {
		// select *from Category where id ='101'
		String hql = "from Category where category_id =" + " ' " + category_id + " ' ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Category> list = query.list();
		if (list == null || list.isEmpty()) {
			return null;
		} else {
			return list.get(0);
		}
	}

	/*
	 * @Transactional public List<Category> list() { String hql =
	 * "from Category"; Query query =
	 * sessionFactory.getCurrentSession().createQuery(hql); List<Category> list
	 * = query.list(); if (list == null || list.isEmpty()) { return null; }
	 * return list;
	 * 
	 * }
	 */
	@Transactional
	public List<Category> getList() {
		Session session = sessionFactory.openSession();
		List<Category> categoryList = session.createQuery("from Category").list();
		session.close();
		return categoryList;
	}

	@Transactional
	public Category getRowById(String category_id) {
		Session session = sessionFactory.openSession();
		Category category = (Category) session.load(Category.class, category_id);
		return category;
	}

	@Transactional
	public String update(Category category) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(category);
		tx.commit();
		Serializable category_id = session.getIdentifier(category);
		session.close();
		return (String) category_id;
	}

	public Category getByName(String name) {
		String hql = "from Category where name =" + " ' " + name + " ' ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Category> list = query.list();
		if (list == null || list.isEmpty()) {
			return null;
		} else {
			return list.get(0);
		}
	}
}