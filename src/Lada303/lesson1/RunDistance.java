package Lada303.lesson1;

public class RunDistance implements Obstacle{
    private int distance;

    public RunDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean obstacle(Actable actable) {
      //  System.out.printf("%s started to run a distance of %d meter\n", actable.info(), distance);
        return actable.run(distance);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "RunDistance=" + distance;
    }
}
