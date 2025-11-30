public class Aurus extends Car {
    private String modelName;
    private String bodyType;
    private double numberOfDoors;
    private boolean hasArmored;
    private boolean hasTinted;

    public Aurus(String carBrand, double cubicCapacity, String fuelType, double horsePower,
                 String transmissionType, double yearOfManufacture, String carColour, String modelName,
                 String bodyType, double numberOfDoors, boolean hasArmored, boolean hasTinted) {
        super(carBrand, cubicCapacity, fuelType, horsePower, transmissionType, yearOfManufacture, carColour);
        this.modelName = modelName;
        this.bodyType = bodyType;
        this.numberOfDoors = numberOfDoors;
        this.hasArmored = hasArmored;
        this.hasTinted = hasTinted;
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

    public boolean isHasArmored() {
        return hasArmored;
    }

    public void setHasArmored(boolean hasArmored) {
        this.hasArmored = hasArmored;
    }

    public boolean isHasTinted() {
        return hasTinted;
    }

    public void setHasTinted(boolean hasTinted) {
        this.hasTinted = hasTinted;
    }

    @Override
    public void printCarInfo() {
        super.printCarInfo();
        System.out.println("Модель: " + modelName);
        System.out.println("Тип кузова: " + bodyType);
        System.out.println("Количество дверей: " + numberOfDoors);
        System.out.println("Наличие бронирования: " + hasArmored);
        System.out.println("Наличие тонировки: " + hasTinted);
    }
}
