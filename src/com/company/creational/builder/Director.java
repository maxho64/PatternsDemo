package com.company.creational.builder;

import com.company.creational.builder.builders.Builder;
import com.company.creational.builder.components.Engine;
import com.company.creational.builder.components.GPSNavigator;
import com.company.creational.builder.components.Transmission;
import com.company.creational.builder.components.TripComputer;
import com.company.creational.builder.product.CarType;

/**
 * Директор знает в какой последовательности заставлять работать строителя. Он
 * работает с ним через общий интерфейс Строителя. Из-за этого, он может не
 * знать какой конкретно продукт сейчас строится.
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR)
                .setSeats(2)
                .setEngine(new Engine(3.0, 0))
                .setTransmission(Transmission.SEMI_AUTOMATIC)
                .setTripComputer(new TripComputer())
                .setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR).setSeats(2)
                .setEngine(new Engine(1.2, 0))
                .setTransmission(Transmission.AUTOMATIC)
                .setTripComputer(new TripComputer())
                .setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV)
                .setSeats(4)
                .setEngine(new Engine(2.5, 0))
                .setTransmission(Transmission.MANUAL)
                  .setGPSNavigator(new GPSNavigator());
    }
}
