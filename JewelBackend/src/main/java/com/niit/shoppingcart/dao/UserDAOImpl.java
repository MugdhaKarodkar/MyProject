package com.niit.shoppingcart.dao;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import com.niit.shoppingcart.model.User;

@EnableTransactionManagement
@Repository
public class UserDAOImpl implements UserDAO {
	// declare session factory
	@Autowired
	private SessionFactory sessionFactory;

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean save(User user) {
		try 
		{
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean update(User user) {
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean delete(User user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public User get(String id) {
		// select *from User where id ='101'
		String hql = "from User where id =" + " ' " + id + " ' ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<User> list = query.list();
		if (list == null) {
			return null;
		} else {
			return list.get(0);
		}
	}

	@Transactional
	public List<User> list() {
		String hql = "from User";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	@Transactional
    public boolean isValidUser(String id,String password)
    {
    	//select * from UserDetails where id='101' and password 'niit'
    	String hql = "from User where id='"+id+"' and password='"+password+"'";
    	Query query = sessionFactory.getCurrentSession().createQuery(hql);
    	List<User> list = (List<User>) query.list();
    	if(list!=null && !list.isEmpty())
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
}