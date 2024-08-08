package com.mbb.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryCofig {
	private static SessionFactory sf;
	static {
		sf=new Configuration().configure().buildSessionFactory();
	}
	public static SessionFactory getFactory() {
		return sf;
	}
}
