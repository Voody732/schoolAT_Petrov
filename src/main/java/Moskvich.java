public class Moskvich extends Car {
    private String modelName;
    private String bodyType;
    private double numberOfDoors;

    public Moskvich(String carBrand, double cubicCapacity, String fuelType, double horsePower,
                    String transmissionType, double yearOfManufacture, String carColour,
                    String modelName, String bodyType, double numberOfDoors) {
        super(carBrand, cubicCapacity, fuelType, horsePower, transmissionType, yearOfManufacture, carColour);
        this.modelName = modelName;
        this.bodyType = bodyType;
        this.numberOfDoors = numberOfDoors;
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

    @Override
    public void printCarInfo() {
        super.printCarInfo();
        System.out.println("Модель: " + modelName);
        System.out.println("Тип кузова: " + bodyType);
        System.out.println("Количество дверей: " + numberOfDoors);
    }
}
