package Final;

import javax.lang.model.element.Element;


public class MatrixOperations {


/////////////////// MULTIPLY M1*M2//////////////////////////////////////////////////

    public Matrix multiply ( Matrix m1, Matrix m2 ) {

        int ColumsNumber = m1.getColumsNumber();
        int RowsNumber = m1.getRowsNumber();

        Matrix  matrix = new MatrixMult(ColumsNumber, RowsNumber);

        for (int i = 0; i < ColumsNumber; i++) {

          for (int j = 0; j < RowsNumber; i++) {
              double firstMatrix = m1.getElement(i,j);
              double secondMatrix = m2.getElement(i,j);
              double matrixMultiply  = firstMatrix * secondMatrix;
              newMatrix.setElement(i, j, matrixMultiply);
          }

        }

        return newMatrix;

    }

/////////////////// MULTIPLY M1*NUMBER//////////////////////////////////////////////////
    //  ??  number, where should we get this number ????

    public Matrix multiply1 ( Matrix m1, double number) {

        int ColumsNumber = m1.getColumsNumber();
        int RowsNumber = m1.getRowsNumber();

        Matrix  matrix = new MatrixMultNumber(ColumsNumber, RowsNumber);

        for (int i = 0; i < ColumsNumber; i++) {
            for (int j = 0; j < RowsNumber; i++) {
                double firstMatrix = m1.getElement(i,j);
                double multiplier = number;
                double matrixNumberMultiply = firstMatrix * multiplier;
                newMatrix.setElement(i, j, matrixNumberMultiply);
            }

        }

        return newMatrix;

    }



/////////////////// ADD M1*M2//////////////////////////////////////////////////

    public Matrix add ( Matrix m1, Matrix m2 ) {

        int ColumsNumber = m1.getColumsNumber();
        int RowsNumber = m1.getRowsNumber();

        Matrix  matrix = new MatrixAdd(ColumsNumber, RowsNumber);

        for (int i = 0; i < ColumsNumber; i++) {

            for (int j = 0; j < RowsNumber; i++) {
                double firstMatrix = m1.getElement(i,j);
                double secondMatrix = m2.getElement(i,j);
                double matrixAdd  = firstMatrix * secondMatrix;
                newMatrix.setElement(i, j, matrixAdd);
            }

        }

        return newMatrix;

    }


/////////////////// SUBSTRACTION M1*M2//////////////////////////////////////////////////

    public Matrix substraction ( Matrix m1, Matrix m2 ) {

        int ColumsNumber = m1.getColumsNumber();
        int RowsNumber = m1.getRowsNumber();

        Matrix  matrix = new MatrixSub(ColumsNumber, RowsNumber);

        for (int i = 0; i < ColumsNumber; i++) {

            for (int j = 0; j < RowsNumber; i++) {
                double firstMatrix = m1.getElement(i,j);
                double secondMatrix = m2.getElement(i,j);
                double matrixSubstract  = firstMatrix * secondMatrix;
                newMatrix.setElement(i, j, matrixSubstract);
            }

        }

        return newMatrix;

    }


}


