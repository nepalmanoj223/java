public class Another {
    public static void main(String[] args) {
        int [] num={1,2,3,4,5,6,7,8,91,23,24,53};
        int chosen=91;
        System.out.println("Why not updated");
        int result=search(num, chosen);
        System.out.println("Item in index : "+result);
    }

    static int search(int [] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
                return -1;
    }
}
