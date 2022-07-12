package com.ChhavinegiMapping1.Mapping1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    
    Laptop l=new Laptop();
    l.setLid(3);
    l.setLname("hp");
    Alien a=new Alien();
    
    a.setAid(2);
    a.setAtech("java");
    a.setLap(l);
    
    
    
    	Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tc= session.beginTransaction();
        session.save(a);
        session.save(l);
        tc.commit();
    }
}
