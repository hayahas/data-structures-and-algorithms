import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
      List<List<Integer>> matrix = new ArrayList<>();
      matrix.add(List.of(1, 2, 3));
      matrix.add(List.of(4, null, 0));
      matrix.add(List.of(7, 8, 9));

      List<Integer> result = sumMatrix(matrix);
      System.out.println(result);

    }

    static List<Integer> sumMatrix(List<List<Integer>> matrix) {
       List<Integer> result = new ArrayList<>();
      
        for (List<Integer> row : matrix) {
              int rowSum = 0;
           for (Integer num : row){
            if (num == null) {
                 rowSum+=0;
            }else{
                rowSum+=num;}
           }
           result.add(rowSum);
        }
        return result;
    }
}