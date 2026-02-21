
import java.util.Arrays;

public class Twosearch {
    public static void main(String[] args){
        int[][] arr={
            {21,45,67},
            {19,28,56},
            {1,2,5,96,12},
            {21,13,19}
        };
        int target=13;
        int []ans= search(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr, int tareget){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==tareget){
                    return new int[]{i, j};      
                  }
            }
        }
        return new int[]{-1, -1};
    }
}
