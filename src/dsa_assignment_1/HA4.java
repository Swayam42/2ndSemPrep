package dsa_assignment_1;

public class HA4 {
    
    public static double[][] addMatrix(double a[][] , double b[][] ){
        int row=a.length;
        int col=a[0].length;
        
        double res[][]=new double[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        return res;
    }
    public static void disp(double arr[][]){
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] +" ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        double[][] matrixA = {{1.5, 2.0, 3.0},
                              {4.0, 5.5, 6.0},
                              {2.0, 4.0, 1.5}};

        double[][] matrixB = {{2.0, 2.5, 3.5},
                              {4.5, 4.0, 3.5},
                              {5.5, 4.5, 4.0}};

        double[][] sum = addMatrix(matrixA, matrixB);

        System.out.println("Matrix A:");
        disp(matrixA);
        System.out.println("\nMatrix B:");
        disp(matrixB);
        System.out.println("\nResult:");
        disp(sum);
    }
}
