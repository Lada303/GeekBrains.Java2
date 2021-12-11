package Lada303.lesson1;


public class Lesson1 {
    private static final int TOTAL_PARTICIPANTS = 9;
    private static final int TOTAL_OBSTACLES = 2;

    public static void main(String[] args) {
        Actable[] participants = new Actable[TOTAL_PARTICIPANTS];
        participants[0] = new Human("Ivanov Ivan", 100, 2);
        participants[1] = new Human("Petrov Petr", 150, 2.2);
        participants[2] = new Human("Denisov Denis", 200, 2.4);
        participants[3] = new Cat("Barsik", 100, 2);
        participants[4] = new Cat("Larsik", 150, 2.2);
        participants[5] = new Cat("Marsik", 200, 2.4);
        participants[6] = new Robot("a1001", 100, 2);
        participants[7] = new Robot("a1502.2", 150, 2.2);
        participants[8] = new Robot("a2002.4", 200, 2.4);


        Obstacle[] obstacles = new Obstacle[TOTAL_OBSTACLES];
        obstacles[0] = new RunDistance(150);
        obstacles[1] = new WallDistance(2.3);

        for (int i = 0; i < TOTAL_PARTICIPANTS; i++) {
            for (int j = 0; j < TOTAL_OBSTACLES; j++) {
                if (!obstacles[j].obstacle(participants[i])) {
                    break;
                }
            }

        }
    }
}
