public class Gaz extends Car {
    private String modelName;
    private String bodyType;
    private double numberOfDoors;
    private double numberOfPassengers;
    private double numberOfWheels;

    public Gaz(String carBrand, double cubicCapacity, String fuelType, double horsePower,
               String transmissionType, double yearOfManufacture, String carColour, String modelName,
               String bodyType, double numberOfDoors, double numberOfPassengers, double numberOfWheels) {
        super(carBrand, cubicCapacity, fuelType, horsePower, transmissionType, yearOfManufacture, carColour);
        this.modelName = modelName;
        this.bodyType = bodyType;
        this.numberOfDoors = numberOfDoors;
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfWheels = numberOfWheels;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public double getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(double numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public double getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(double numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public double getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(double numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void printCarInfo() {
        super.printCarInfo();
        System.out.println("Модель: " + modelName);
        System.out.println("Тип кузова: " + bodyType);
        System.out.println("Количество дверей: " + numberOfDoors);
        System.out.println("Количество пассажиров: " + numberOfPassengers);
        System.out.println("Количество колес: " + numberOfWheels);
    }
}
