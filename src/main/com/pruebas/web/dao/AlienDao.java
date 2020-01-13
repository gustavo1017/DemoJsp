package com.pruebas.web.dao;

public class AlienDao {
	public Alien getAlien(int aid) {
		Alien a = new Alien();
		a.setAid(101);
		a.setAname("Navin");
		a.setTech("Java");
		
		return a;
	}
}
