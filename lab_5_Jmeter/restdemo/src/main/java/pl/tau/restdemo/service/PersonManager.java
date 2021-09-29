package pl.tau.restdemo.service;

// w oparciu o przyklad J Neumanna, przerobiony przez T Puzniakowskiego

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import pl.tau.restdemo.domain.Person;

public interface PersonManager {
	public Connection getConnection();
	public void setConnection(Connection connection) throws SQLException;
	public int addPerson(Person person);
	public int deletePerson(Person person);
	public int updatePerson(Person person) throws SQLException;
	public Person getPerson(long id) throws SQLException;
	public String introduceSelf();
	public int deleteAll();
	public List<Person> getAllPersons();
	//add by student
	public int fillDatabase(int count);
}
