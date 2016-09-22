package com.objis.spring.demodatabase.test;

import com.objis.spring.demodatabase.SpringJDBC;

import domaine.Employe;
import junit.framework.TestCase;

public class TestSpringJDBC extends TestCase {

private Employe emp ;
private Employe employe;
private String beanDataSource;
private SpringJDBC springjdbc ;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		emp = new Employe(4,"morad","mdpobjis","Morad","HANAFI","morad.hanafi@objis.com","employe");
		employe = new Employe(5,"clement","mdpobjis","Clement","Castro","clement.castro@objis.com","employe");
		beanDataSource = "datasource2";
        springjdbc = new SpringJDBC();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		emp = null;
	}

	public  void testSaveEmploye(){
		springjdbc.saveEmploye(emp, beanDataSource);
	}
	
	public  void testSaveEmployeJdbcTemplate(){
		springjdbc.saveEmployeJdbcTemplate(employe);
	}
	
	public void testGetEmployeById(){
		Employe employe = springjdbc.getEmployebyId(2);
		assertNotNull(employe);
	}
}
