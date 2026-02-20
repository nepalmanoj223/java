public class Stringsearch {
    public static void main(String[] args) {
        String str ="Manoj";
        char target ='j';
        boolean result=search(str, target);
        System.out.println(result);
    }
    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for( int i =0; i<str.length(); i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
