package pl.tau.restdemo.service;

// przyklad na podstawie przykladow J. Neumanna
import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pl.tau.restdemo.domain.Person;

public class PersonManagerTest {

	PersonManager personManager;

	private final static String NAME_1 = "Janek";
	private final static int YOB_1 = 1939;

	@Before
	public void setup() throws SQLException {
		personManager = new PersonManagerImpl();
	}

	@After
	public void cleanup() throws SQLException {
	}

	@Test
	public void checkConnection() {
		assertNotNull(personManager.getConnection());
	}

	@Test
	public void checkAdding() throws SQLException {
		Person person = new Person();
		person.setName(NAME_1);
		person.setYob(YOB_1);

		personManager.deleteAll();
		assertEquals(1, personManager.addPerson(person));

		List<Person> persons = personManager.getAllPersons();
		Person personRetrieved = persons.get(0);

		assertEquals(NAME_1, personRetrieved.getName());
		assertEquals(YOB_1, personRetrieved.getYob());
	}

}
