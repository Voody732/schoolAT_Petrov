import java.util.ArrayList;
import java.util.List;

public class Main {
    //its Main origin
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Vaz kalina = new Vaz("Лада", 1.5, "бензин", 86, "МКПП", 2004, "белый", "Калина", "седан", 5);
        Vaz xray = new Vaz("Лада", 1.5, "бензин", 115, "МКПП", 2015, "серый", "XRAY", "кроссовер", 5);
        Uaz scorpion = new Uaz("УАЗ", 2.0, "бензин", 106, "МКПП", 2003, "зеленый", "Скорпион",
                "внедорожник", 3, false, false);
        Uaz patriot = new Uaz("УАЗ", 2.1, "бензин", 120, "МКПП", 2016, "зеленый", "Patriot",
                "внедорожник", 3, true, true);
        Gaz chaika = new Gaz("ГАЗ", 5.5, "бензин", 220, "АКПП", 1980, "черный", "14 (Чайка)", "седан", 4, 4, 4);
        Gaz next = new Gaz("ГАЗ", 2.8, "дизель", 120, "АКПП", 2020, "серый", "A64R42-10(ГАЗель Next»)",
                "автобус", 4, 12, 4);
        Aurus senat = new Aurus("Aurus", 4.4, "гибридный бензиновый", 598, "АКПП", 2024, "черный", "Senat", "седан",
                4, true, true);
        Aurus komendant = new Aurus("Aurus", 4.4, "гибридный бензиновый", 598, "АКПП", 2022, "черный", "Komendant", "внедорожник",
                4, true, true);
        Moskvich moskvich = new Moskvich("Moskvich", 1.5, "бензин", 67, "МКПП", 1998, "зеленый", "2141", "седан", 5);
        Moskvich moskvichX = new Moskvich("Moskvich", 1.5, "бензин", 174, "АКПП", 2024, "белый", "8", "кроссовер", 5);
        cars.add(kalina);
        cars.add(xray);
        cars.add(scorpion);
        cars.add(patriot);
        cars.add(chaika);
        cars.add(next);
        cars.add(senat);
        cars.add(komendant);
        cars.add(moskvich);
        cars.add(moskvichX);
        Car.printCarsAfter2006(cars);
        for (Car car : cars) {
            car.changeColorToRedIfGreen();
        }
        for (Car car : cars) {
            car.printCarInfo();
        }
        Car.printHorsePowerMoreThanHundred(cars);
    }
}
