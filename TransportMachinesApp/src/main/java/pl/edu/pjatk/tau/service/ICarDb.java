package pl.edu.pjatk.tau.service;

import java.util.ArrayList;

import pl.edu.pjatk.tau.domain.Car;

public interface ICarDb {

	public ArrayList<Car> db = new ArrayList<Car>();
	public ArrayList<Car> getDb();
}
