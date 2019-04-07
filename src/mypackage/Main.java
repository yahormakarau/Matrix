package mypackage;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
    MatrixFactory matrixfactory = new MatrixFactory();
    Matrix matrix = matrixfactory.createMatrix(6,6);


    Matrix mymatrix = new Matrix(matrix);
    matrixfactory.copy(mymatrix.getM());

    System.out.println(mymatrix.toString());

    MatrixOperator matrixoperator = new MatrixOperator();
    matrixoperator.sumElements(matrix);

    matrixoperator.maxElement(matrix);
    matrixoperator.minElement(matrix);
    matrixoperator.multiply(matrix);
    matrixoperator.mostRepetedValue(matrix);

    }
}
