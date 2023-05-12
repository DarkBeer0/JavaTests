class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    private int battery = 100;
    private int distanceDriven = 0;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery <= 0;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (battery - batteryDrain < 0)
            return;
        distanceDriven += speed;
        battery -= batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    // TODO: define the constructor for the 'RaceTrack' class
    public int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        return (double) distance / car.speed <= (double) 100 / car.batteryDrain;
    }
}
