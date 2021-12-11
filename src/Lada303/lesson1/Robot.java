package Lada303.lesson1;

public class Robot implements Actable{
    private final String model;
    private int maxRunDistance;
    private double maxJumpHeight;

    public Robot(String model) {
        this.model = model;
    }
    public Robot(String model, int maxRunDistance, double maxJumpHeight) {
        this.model = model;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.printf("Robot %s covered the distance %d of meters\n", model, distance);
            return true;
        } else {
            System.out.printf("Robot %s did not cover the distance %d of meters\n", model, distance);
        }
        return false;
    }

    @Override
    public boolean jump(double height) {
        return  height <=maxJumpHeight;
    }

    @Override
    public String info() {
        return "Robot " + model;
    }

    public String getModel() {
        return model;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public void setMaxJumpHeight(double maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "model='" + model + '\'' +
                ", maxRunDistance=" + maxRunDistance +
                ", maxJumpHeight=" + maxJumpHeight +
                '}';
    }
}

