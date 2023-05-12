public class ElonsToyCar {
    private int dist = 0;
    private int battery = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + dist + " meters";
    }

    public String batteryDisplay() {
        return battery <= 0 ? "Battery empty" : "Battery at " + battery +"%";
    }

    public void drive() {
        if (battery - 1 < 0)
            return;
        dist += 20;
        battery -= 1;
    }
}
