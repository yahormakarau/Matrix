package mypackage;

public class MatrixOperator {

    public void sumElements(Matrix matrix) {
        int[][] arr = matrix.getM();
        int x = arr.length;
        int sum = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println("Общая сумма всех элементова массива равна: " + sum);
    }

    public void maxElement(Matrix matrix) {
        int[][] arr = matrix.getM();
        int max = -10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max value is " + max);
    }

    public void minElement(Matrix matrix) {
        int[][] arr = matrix.getM();
        int min = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Min value is " + min);
    }

    public void multiply(Matrix matrix) {
        int[][] arr = matrix.getM();
        long result = 1;
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0)
                    result = result * arr[i][j];
            }
            str = "Result is " + result;
        }
        System.out.println( str);
    }
}