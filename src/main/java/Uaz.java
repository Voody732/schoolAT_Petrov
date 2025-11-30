public class Uaz extends Car {
    private String modelName;
    private String bodyType;
    private double numberOfDoors;
    private boolean hasWinch;
    private boolean hasRooBar;

    public Uaz(String carBrand, double cubicCapacity, String fuelType,
               double horsePower, String transmissionType, double yearOfManufacture,
               String carColour, String modelName, String bodyType, double numberOfDoors,
               boolean hasWinch, boolean hasRooBar) {
        super(carBrand, cubicCapacity, fuelType, horsePower, transmissionType, yearOfManufacture, carColour);
        this.modelName = modelName;
        this.bodyType = bodyType;
        this.numberOfDoors = numberOfDoors;
        this.hasWinch = hasWinch;
        this.hasRooBar = hasRooBar;
    }

    public boolean isHasRooBar() {
        return hasRooBar;
    }

    public void setHasRooBar(boolean hasRooBar) {
        this.hasRooBar = hasRooBar;
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

    public boolean isHasWinch() {
        return hasWinch;
    }

    public void setHasWinch(boolean hasWinch) {
        this.hasWinch = hasWinch;
    }

    @Override
    public void printCarInfo() {
        super.printCarInfo();
        System.out.println("Модель: " + modelName);
        System.out.println("Тип кузова: " + bodyType);
        System.out.println("Количество дверей: " + numberOfDoors);
        System.out.println("Наличие лебёдки: " + hasWinch);
        System.out.println("Наличие кенгурятника: " + hasRooBar);
    }
}
