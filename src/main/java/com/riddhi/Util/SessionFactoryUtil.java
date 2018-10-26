package com.riddhi.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		if(sessionFactory==null)
			this.sessionFactory= new Configuration().configure().buildSessionFactory();
			return sessionFactory;
		}
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
