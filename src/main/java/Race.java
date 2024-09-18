import java.util.ArrayList;

class Race {
    private ArrayList<Car> cars;
    private int durationInHours = 24;

    Race(ArrayList<Car> cars) {
        this.cars = cars;
    }

    Car getWinner() {
        if (cars.isEmpty()) {
            return null;
        }

        Car winner = this.cars.get(0);
        for (Car car : cars) {
            if (winner.distanceFor(durationInHours) < car.distanceFor(durationInHours)) {
                winner = car;
            }
        }

        return winner;
    }
}
