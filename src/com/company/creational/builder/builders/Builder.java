package com.company.creational.builder.builders;

import com.company.creational.builder.components.Engine;
import com.company.creational.builder.components.GPSNavigator;
import com.company.creational.builder.components.Transmission;
import com.company.creational.builder.components.TripComputer;
import com.company.creational.builder.product.CarType;

public interface Builder {
    Builder setCarType(CarType type);
    Builder setSeats(int seats);
    Builder setEngine(Engine engine);
    Builder setTransmission(Transmission transmission);
    Builder setTripComputer(TripComputer tripComputer);
    Builder setGPSNavigator(GPSNavigator gpsNavigator);
}
