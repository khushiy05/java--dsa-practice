/*class FirstClass {
        public static void main(String args[]) {
            // this is how we find output in Java 
        System.out.print("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!\n");
        System.out.println("Hello, World!\n\ni love java");



    /* print the pattern  
    *
    **
    ***
    ****
    */
   /*System.out.println("*");
   System.out.println("**");
   System.out.println("***");
   System.out.println("****");

   /* variables in java+dsa
   int a = 10;
   int b = 25;
   int sum = a + b;
   //System.out.println(sum);
   //int diff = a - b;
   int mul = a * b;
   System.out.println(mul);*/ 
    //}
//}

/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        /*
        nextInt()
        nextInt() */
        //System.out.println(name);
    //}
//}


// if -else condition in java
/*import java.util.*;
public class Conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
    }      
}/* */ 
    
/*import java.util.*;
public class Conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}*/

/*import java.util.*;
public class Conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b) {
            System.out.println("Equal");
        } else {
            if(a > b) {
                System.out.println("a is greater");
            } else {
                System.out.println("a is lesser");
            }
        }
            
    }
}*/

//with else if 
/*import java.util.*;
public class Conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b) {
            System.out.println("Equal");
        } else if(a > b) {
                System.out.println("a is greater");
            } else {
                System.out.println("a is lesser");
            }        
    }
}*/

// print the greeting 
import java.util.*;
public class Conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button =  sc.nextInt();

        //if(button == 1) {
        //    System.out.println("Hello");
        //} else if(button == 2) {
        //    System.out.println("Namaste");
        //} else if(button == 3) {
        //    System.out.println("Bonjour");
        //} else {
        //    System.out.println("Invalid Button");
        switch(button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");

        }
    }
}