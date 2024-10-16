package com.pb.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	public static SessionFactory getSessionFactory() {
		
		Configuration cfg = new Configuration();
		
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		//Session s = sf.openSession();
		
		return sf;
	}
}
