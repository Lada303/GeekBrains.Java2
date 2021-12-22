package Lada303.lesson2;

public class MyArraySizeException extends IllegalArgumentException {

    public MyArraySizeException() {
        super("Неверные размеры входного массива");
    }
}
