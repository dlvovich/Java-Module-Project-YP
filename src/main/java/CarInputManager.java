import java.util.ArrayList;
import java.util.Scanner;

class CarInputManager {
    private Scanner scanner = new Scanner(System.in);

    ArrayList<Car> inputCars() {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String carName;
            Integer carSpeed;

            do {
                carName = inputName();
            } while (carName == null);

            do {
                carSpeed = inputSpeed();
            } while (carSpeed == null);

            cars.add(new Car(carName, carSpeed));
        }

        return cars;
    }

    private String inputName() {
        System.out.println("Введите название машины:");
        String name = scanner.nextLine();

        if (name.isEmpty()) {
            System.out.println("Название не может быть пустым.\nПопробуйте ещё раз...\n");
            return null;
        } else {
            return name;
        }
    }

    private Integer inputSpeed() {
        System.out.println("Введите скорость машины");
        String speedText = scanner.nextLine();

        if (!speedText.matches("-?\\d+")) {
            System.out.println("Скорость должна быть целым положительным числом.\nПопробуйте ещё раз...\n");
            return null;
        }

        Integer speed = Integer.valueOf(speedText);

        if (speed > 250 || speed < 0) {
            System.out.println("Скорость должна быть не больше 250 и не меньше 0.\nПопробуйте ещё раз...\n");
            return null;
        } else {
            return speed;
        }
    }
}