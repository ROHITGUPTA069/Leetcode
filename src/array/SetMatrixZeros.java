package array;
import java.util.*;
public class SetMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };
        setZeros(matrix);

        for(int[] row: matrix){
            for(int num: row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void findZero(int[][] matrix, List<int []> list){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i]. length; j++){
                if(matrix[i][j] == 0){
                    list.add(new int[]{i, j});
                }
            }
        }
    }

    //make zeros
    public static void setZeros(int[][] matrix) {
        List<int[]> list =new ArrayList<>();
        findZero(matrix, list);
        for(int[] innerarray: list){
            int row = innerarray[0];
            int col = innerarray[1];
                //for col
                for(int j = 0;  j < matrix[row].length; j++){
                    matrix[row][j] = 0;
                }
                //for row
                for(int i = 0; i < matrix.length; i++){
                    matrix[i][col] = 0;
                }
        }
    }
}
