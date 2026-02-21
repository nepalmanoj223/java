public class Gptques {
    public static void main(String[] args) {
        ques1();
    }
    static void ques1(){
        // Count Negative Numbers in 2D Array
        // Example:
        // Input: {{4,-1,3},{-2,-5,6}}
        // Output: 3
        int [][] arr={{4,-1,3},{-2,-5,6}};
        int count=0;
        for(int row =0; row<arr.length; row++){
            for(int col=0;col<arr[row].length; col++ ){
                if(arr[row][col]<0){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
