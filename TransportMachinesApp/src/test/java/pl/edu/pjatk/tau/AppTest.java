package pl.edu.pjatk.tau;

import pl.edu.pjatk.tau.*;
import pl.edu.pjatk.tau.domain.Car;
import pl.edu.pjatk.tau.service.CarDb;

import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
	
	public void testIsDbInitalSet() {
		ArrayList<Car> db = new CarDb().getDb();
		assertNotNull(db);
	}


}
