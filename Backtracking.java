                                /* Backtracking*/
public class Backtracking {
    public static void printPermutation(String str, String perm, int idx){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            printPermutation(newString, perm+currChar, idx);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, " ", 0);        
    }
}
