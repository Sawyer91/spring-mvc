package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Ford", "Focus", 123));
        list.add(new Car("Audi", "A3", 3234));
        list.add(new Car("Audi", "TT", 456));
        return list;
    }
}
