package inheritance.core;

public class Vehicle {

    private String brand;
    private String color;
    private int wheels;
    private int weight;
    private int engineSize;
    private int numberOfGears;
    private int currentGear;
    private int currentSpeed;
    private int vehicleStatus;

    public Vehicle() {
        this("Default Brand", "Default Colour", 4, 1000, 2000, 6);
    }

    public Vehicle(String brand, String color, int wheels, int weight, int engineSize, int numberOfGears) {
        this.brand = brand;
        this.color = color;
        this.wheels = wheels;
        this.weight = weight;
        this.engineSize = engineSize;
        this.numberOfGears = numberOfGears;
        this.currentGear = 1;
        this.currentSpeed = 0;
        this.vehicleStatus = 0; // 0 = Off, 1 = On
    }

    public String getBrand() {
        return this.brand;
    }

    public String getColor() {
        return this.color;
    }

    public int getWheels() {
        return this.wheels;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getEngineSize() {
        return this.engineSize;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getNumberOfGears() {
        return this.numberOfGears;
    }

    public void startVehicle() {
        if (this.vehicleStatus == 0) {
            System.out.println("Starting Vehicle...");
            this.vehicleStatus = 1;
        } else {
            System.out.println("Vehicle is already running.");
        }
    }

    public void stopVehicle() {
        if (this.vehicleStatus == 1) {
            System.out.println("Stopping Vehicle...");
            this.vehicleStatus = 0;
        } else {
            System.out.println("Vehicle is not running.");
        }
    }

    public void accelerate(int speed) {
        if (this.currentSpeed < 90) {
            this.currentSpeed += speed;
            if (this.currentSpeed > 90) {
                this.currentSpeed = 90;
            }
            System.out.println("Accelerating...");
        } else {
            System.out.println("Vehicle is already traveling at speed limit. Unable to accelerate further.");
        }
    }

    public void braking(int speed) {
        if (this.currentSpeed > 0) {
            this.currentSpeed -= speed;
            if (this.currentSpeed < 0) {
                this.currentSpeed = 0;
            }
            System.out.println("Braking...");
        } else {
            System.out.println("Vehicle is not moving.");
        }
    }

    public void upShift() {

    }

    public void downShift() {

    }

    public void steerLeft() {

    }

    public void steerRight() {

    }
}
