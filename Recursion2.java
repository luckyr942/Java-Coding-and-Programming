                                                   /* Tower of Hanoi */                        
public class Recursion2 {
    public static void towerofHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk" + n + "from" + src + "to" + dest);
            return;
        }
        towerofHanoi(n-1,src,dest,helper);
        System.out.println("transfer disk"+ n +"from" +src+" to "+dest);
        towerofHanoi(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        int n = 1;
        towerofHanoi(n, "S", "H", "D");
    }
}
                                         /*Print the String in Reverse */
public class Recursion2{
    public static void printRev(String str, int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    public static void main(String[] args) {
       String str = "abcd";
       printRev(str, str.length()-1);
    }
}
                     /* Find the 1st & last occurance of an element in String */
public class Recursion2{
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first = idx;
            }else{
                last = idx;
            }
        }
        findOccurance(str, idx+1, element);
    }
    public static void main(String args[]){
        String str = "abaacdaefaah";
        findOccurance(str, 0, 'a');
    }
    
}