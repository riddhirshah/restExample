package com.riddhi.Controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.riddhi.Entities.Messages;
import com.riddhi.Util.SessionFactoryUtil;

public class MessageService {
	
	SessionFactoryUtil sfu=new SessionFactoryUtil();
	
	public Session openSession() {
		SessionFactory sf=sfu.getSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		return s;
	}

	public List<Messages> getAllMessages() {
		Session s=openSession();
		List<Messages> messageList = (List<Messages>) s.createQuery("from Messages").list();
		return messageList;
	}

	public Messages saveMessage(Messages message) {
		Session s=openSession();
		s.save(message);
		s.getTransaction().commit();
		s.close();
		return message;
	}

	public Messages getMessage(int id) {
		Messages message=openSession().get(Messages.class, id);
		return (Messages) message;
	}

	public Messages updateMessage(Messages message) {
		
		Session s=	openSession();
		s.saveOrUpdate(message);
		s.getTransaction().commit();
		s.close();
		return (Messages) message;
	}
		
}
