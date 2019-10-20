package pl.edu.pjatk.tau.service;

import java.util.ArrayList;

import pl.edu.pjatk.tau.domain.Car;

public class CarDb implements ICarDb{

	private ArrayList<Car> db = new ArrayList<Car>();
	
	public ArrayList<Car> getDb() {
		return db;
	}
}
