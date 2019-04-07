package mypackage;

import java.util.Arrays;
import java.util.Random;


class MatrixFactory {



    public MatrixFactory() {
    }
    public Matrix createMatrix(int a, int b){
        Matrix mymatrix = new Matrix();
        int[][] arr = new int[a][b];
        for ( int i = 0; i < a; i++) {
            for ( int j = 0; j < b; j++) {
                arr[i][j] = (int) (Math.random() * (21) - 10);
            }
        }
        for ( int i = 0; i < a; i++) {
            for ( int j = 0; j < a; j++) {
                System.out.print(arr[i][j] + "\t");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        mymatrix.setM(arr);
        return mymatrix;
    }
    public int[][] copy(int[][] src) {
        for (int i = 0; i < src.length; i++) {
            for (int j = 0; j < src.length; j++) {
                if(src [i][j] > 0){
                    src[i][j] = - src[i][j];
                }
            }
        }
        return src;
    }
}