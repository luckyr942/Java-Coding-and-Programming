public class Arrays{
    public static void main(String args[]) {
        int [] marks = new int[3];
        marks[0] = 97; //phy
        marks[1] = 98; //chem
        marks[2] = 99; //maths
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        
        for (int i=0; i<3; i++){
        System.out.println(marks[i]);
        }
    }
}


//user se input leke store karana
/*import java.util.*;
public class Arrays{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();  
        int numbers[] = new int[size];  
        
        // input for loop this one
        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        sc.close();
        // output for loop this one
        for (int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }
}*/

//Take an array from the user and search for a given number x and print the index at which it occurs

import java.util.*;
public class Arrays{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();  
        int numbers[] = new int[size];  
        
        // input for loop this one
        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        
        int x = sc.nextInt();
        sc.close();
        // output for loop this one
        for (int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                 System.out.println("x found at index : "+ i);
            } 
        }
    }
}
