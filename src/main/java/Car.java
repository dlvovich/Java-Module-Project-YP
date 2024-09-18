class Car {
    String name;
    int speed;

    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    int distanceFor(int duration) {
        return speed * duration;
    }
}
