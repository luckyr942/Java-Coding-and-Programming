public class Recursion {
    public static void printNumb(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumb(n-1);
    }
    public static void main(String args[]){
        int n=5;
        printNumb(n);
    }
}
                /* Print the sum of n natural nos */
public class Recursion{
    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum += i;
            System.out.print(sum);
            return;
        }
        sum += i;
        printSum(i+1,n,sum);
    }
    public static void main(String args[]){
        printSum(1,5,0);
    }
}
