import java.util.List;

public abstract class Car {
    protected String carBrand;
    protected double cubicCapacity;
    protected String fuelType;
    protected double horsePower;
    protected String transmissionType;
    protected double yearOfManufacture;
    protected String carColour;

    public Car(String carBrand, double cubicCapacity, String fuelType, double horsePower, String transmissionType, double yearOfManufacture, String carColour) {
        this.carBrand = carBrand;
        this.cubicCapacity = cubicCapacity;
        this.fuelType = fuelType;
        this.horsePower = horsePower;
        this.transmissionType = transmissionType;
        this.yearOfManufacture = yearOfManufacture;
        this.carColour = carColour;
    }

    public static void printCarsAfter2006(List<Car> cars) {
        for (Car car : cars) {
            if (car.getYearOfManufacture() > 2006) {
                car.printCarInfo();
            } else {
                System.out.println("Устаревший авто.");
            }
        }
    }

    public static void printHorsePowerMoreThanHundred(List<Car> cars) {
        for (Car car : cars) {
            if (car.getHorsePower() > 100) {
                car.printCarInfo();
            }
        }
    }

    public void changeColor(String newColor) {
        this.carColour = newColor;
    }

    public void changeColorToRedIfGreen() {
        if (this.carColour.equalsIgnoreCase("зеленый")) {
            changeColor("красный");
        }
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public double getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(double cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public double getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(double yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public void printCarInfo() {
        System.out.println("Информация об автомобиле:");
        System.out.println("Марка: " + getCarBrand());
        System.out.println("Объем двигателя: " + getCubicCapacity() + " л.");
        System.out.println("Тип топлива: " + getFuelType());
        System.out.println("Мощность: " + getHorsePower() + " л.с");
        System.out.println("Тип трансмиссии: " + getTransmissionType());
        System.out.println("Год выпуска: " + getYearOfManufacture());
        System.out.println("Цвет: " + getCarColour());
    }
}
