package mypackage;

import java.util.Arrays;

public class Matrix {
    private int[][] arr;


    public Matrix() {

    }

    public Matrix(Matrix matrix) {
        arr = matrix.arr;
    }

    public int[][] getM() {
        return arr;
    }

    public void setM(int[][] arr) {
        this.arr = arr;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] num : arr) {
            stringBuilder.append(Arrays.toString(num))
                    .append("\n");
        }
        return stringBuilder.toString();
    }
}