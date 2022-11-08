public class Main {
    public static void main(String[] args) {
        String[][] array2d = {{"1", "2", "3", "4", "5"}, {"6", "7", "8", "9"}};
        int sum = sum2d(array2d);
        System.out.println("The sum of the elements of a 2D array = " + sum + ".");
    }

    public static int sum2d(String[][] a) {
//      Проверяю, что все строки в двумерном массиве одинаковой длины.
        for (int i = 0; i < a.length - 1; i++) {
            IsRowsEqual(a, i);
        }
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (isIntegerString(a[i][j])) {
                    s += Integer.parseInt(a[i][j]);
                } else {
                    break;
                }
            }
        }
        return s;
    }

    /*
        Вывел определение корректности типа данных в ячейке в отдельную функцию.
    */
    public static boolean isIntegerString(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void IsRowsEqual(String[][] array, int rowIndex) {
        if (array[0].length != array[rowIndex + 1].length) {
            throw new RuntimeException("Rows has different lengths.");
        }
    }
}