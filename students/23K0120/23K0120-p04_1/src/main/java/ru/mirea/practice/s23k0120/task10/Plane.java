package ru.mirea.practice.s23k0120.task10;

public class Plane extends Vehicle{

    public Plane() {
        // Default constructor
    }

    public Plane(double speed, double cost, int passengerSeats) {
        super(speed, cost, passengerSeats);
    }

    public Plane(double speed, double cost, double cargoCapacity) {
        super(speed, cost, cargoCapacity);
    }

    public Plane(double speed, double cost, int passengerSeats, double cargoCapacity) {
        super(speed, cost, cargoCapacity);
    }

    @Override
    public void transportPassengers(int numOfPassengers, double distance) {
        super.transportPassengers(numOfPassengers, distance);
        System.out.print(" via plane");
    }

    @Override
    public void transportCargo(double weight, double distance) {
        super.transportCargo(weight, distance);
        System.out.print(" via plane");
    }

}
