public class Stings {
    public static void main(String[] args) {
        //String Datatype
        String name = "Tony";
        String sentence = "Tony name is this";
        
    }
}

// /* To take the input from the user for thhe string and print the output */

// import java.util.Scanner;

// public class Stings{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
//         sc.close();
//         System.out.println(name);
//     }
// }

/* Concatenation of two string */
public class Stings{
   public static void main(String args[]) {
    String firstName = "Tony";
    String lastName = "Stark";
    String fullName =  firstName + lastName;
    System.out.println(fullName);

    //for printing the length of the string
    System.out.println(fullName.length());

    //for display every letters in a word
    //charAt is used
    for (int i=0; i<fullName.length(); i++){
        System.out.println(fullName.charAt(i));
    }
   }
}

// /* For comparing the two String we use  */
// //compareTo
// public class Stings{
//     public static void main(String args[]) {
//         //compare
//         String name1 = "Tony";
//         String name2 = "Tony2";

//         //1 s1>s2 = +ve value
//         //2 s2>s1 = -ve value
//         //3 s1=s2 = 0

//         if (name1.compareTo(name2)==0){
//             System.out.println("Strings are equal");
//         }
//         else{
//             System.out.println("Strings are not equal");
//         }
//     }
// }

// /* SUBSTRING */
// public class Strings{
//     public static void main(String args[]) {
//         String sentence = "this is lucky";
//         String name = sentence.substring(0, 4);
//         System.out.println(name);
//     }
// }

/* StringBuilder */
// public class Strings{
//     public static void main(String arg[]){
//         StringBuilder sb = new StringBuilder("Tony");
//         System.out.println(sb);

//         //insert the char in string at index
//         sb.insert(2,"n");
//         System.out.println(sb);

//         //set char at index
//         sb.setCharAt(0,'P');
//         System.out.println(sb);

//         //delete
//         sb.delete(2, 3);
//         System.out.println(sb);

//         //append
//         sb.append("S");
//         System.out.println(sb);

//         //length
//         System.out.println(sb.length());
//     }    
// }

/*Reverse of the String */
public class Strings{
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("hello");

        for (int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
