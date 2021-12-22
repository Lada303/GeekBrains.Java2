package Lada303.lesson2;

public class MyArrayDataException extends NumberFormatException{

    public MyArrayDataException(int row, int column, String str) {
        super(String.format("Неверное значение в ячейке [%d][%d]: %s\n", row, column, str));
    }
}
