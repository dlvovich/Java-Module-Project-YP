import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CarInputManager inputManager = new CarInputManager();
        ArrayList<Car> cars = inputManager.inputCars();
        Race race = new Race(cars);
        Car winnerCar = race.getWinner();

        if (winnerCar == null) {
            System.out.println("Нет победителя");
            return;
        }
        System.out.printf("Самая быстрая машина: %s%n", winnerCar.name);
    }
}


