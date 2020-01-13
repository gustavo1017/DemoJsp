package com.prueba.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.prueba.web.model.Alien;

public class AlienDao {
	public Alien getAlien(int aid) {
		Alien a = new Alien();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/navin?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from alien where ad="+aid);
			if(rs.next()) {
				a.setAid(rs.getInt("ad"));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
		
		return a;
	}
}
