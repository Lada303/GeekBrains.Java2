package Lada303.lesson5;

import java.util.Arrays;

public class Lesson5 {
    private static final int SIZE = 10000000;

    public static void main(String[] args) {
        method1();
        method2();

    }

    private static void method1() {
        float[] arraySome =new float[SIZE];
        Arrays.fill(arraySome, 1);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arraySome[i] = (float)(arraySome[i] * Math.sin(0.2f + i / 5) *
                    Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("Running time of method 1 " + (finishTime - startTime) + " ms");
        System.out.println("10 elem = " + arraySome[9] + ". 5500001 elem = " + arraySome[5500000]);
    }

    private static void method2() {
        float[] arraySome1 =new float[SIZE / 2];
        float[] arraySome2 =new float[SIZE / 2];
        Arrays.fill(arraySome1, 1);
        Arrays.fill(arraySome2, 1);
        long startTime = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < SIZE / 2; i++) {
                arraySome1[i] = (float)(arraySome1[i] * Math.sin(0.2f + i / 5) *
                        Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < SIZE / 2; i++) {
                int j = 5000000 + i;
                arraySome2[i] = (float)(arraySome2[i] * Math.sin(0.2f + j / 5) *
                        Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        float[] arraySome = new float[SIZE];
        System.arraycopy(arraySome1, 0, arraySome, 0, SIZE / 2);
        System.arraycopy(arraySome2, 0, arraySome, SIZE / 2, SIZE / 2);
        long finishTime = System.currentTimeMillis();
        System.out.println("Running time of method 2 " + (finishTime - startTime) + " ms");
        System.out.println("10 elem = " + arraySome[9] + ". 5500001 elem = " + arraySome[5500000]);
    }


}
