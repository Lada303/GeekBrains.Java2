package Lada303.lesson2;

public class Lesson2 {

    private static final int SIZE_ROW = 4;
    private static final int SIZE_COLUMN = 4;

    public static void main(String[] args) {
        String[][] arrStr = new String[][] {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        try {
            int sum = sumArrayElement(arrStr);
            System.out.print("Сумма всех элементов массива: " + sum);
        }
        catch (RuntimeException exc) {
            System.out.println(exc.getMessage());
        }


    }

    public static int sumArrayElement(String[][] arr) throws RuntimeException {
        if (arr.length != SIZE_ROW) {
            throw new MyArraySizeException();
        }
        for (String[] rows : arr) {
            if (rows.length != SIZE_COLUMN) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < SIZE_ROW; i++)
            for (int j = 0; j< SIZE_COLUMN; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException exc) {
                    throw new MyArrayDataException(i, j, arr[i][j]);
                }
            }
        return sum;
    }


}
