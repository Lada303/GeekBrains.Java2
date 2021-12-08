package Lada303.lesson1;

public class WallDistance implements Obstacle{
    private double height;

    public WallDistance(double height) {
        this.height = height;
    }

    @Override
    public boolean obstacle(Actable actable) {
        if (actable.jump(height)) {
            System.out.printf("%s jumped to a height of %.2f meter\n", actable.info(), height);
            return true;
        } else {
            System.out.printf("%s did not jump to a height of %.2f meter\n", actable.info(), height);
        }
        return false;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "WallDistance=" + height;
    }
}

