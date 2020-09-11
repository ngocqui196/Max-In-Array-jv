import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        ;
        int[][] array = {{15,23,86},
                        {56,75,93},
                        {85,94,1996}};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
