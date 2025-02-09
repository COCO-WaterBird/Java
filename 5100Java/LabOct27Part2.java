package edu.neu.mgen;
// import java.util.Scanner; //import Scanner for input values
 
// HelloWorld
/*
* It is my first Java program.
*/
 
/**
public class HelloWorld{
    public static void main(String[] args) {
        // Declare variables of types
        int intVar1 = 5, intVar2 = 5;
        long longVar1 = 10, longVar2 = 10;
        double doubleVar1 = 5.5f, doubleVar2 = 3.14149;
        boolean boolVar1 = true, boolVar2 = false;
        char charVar1 = 'H', charVar2 = 'W';
 
        // Convert "int" to "long"
        long convertlong1 = intVar1, convertlong2 = intVar2;
 
        System.out.println("convertlong1 =" + convertlong1);
        System.out.println("convertlong2 =" + convertlong2);
 
        // Convert "long" to "int"
        int convertInt1 = (int) longVar1, convertInt2 = (int) longVar2;
 
        // Input float values with Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the first float values ");
        float floatVar1 = scanner.nextFloat();
        System.out.println("Please input the second float values ");
        float floatVar2 = scanner.nextFloat();
 
        // // Input boolean
        // System.out.println("Please input true or flase ");
        // boolean boolVar3 = scanner.nextBoolean();
        double doubleVar3 = 0;
        System.out.println("Please input true or flase ");
        boolean boolVar3 = scanner.nextBoolean();
            
           
        if (boolVar3 == true) {
            doubleVar3 = floatVar1 + floatVar2;
        }else{
            doubleVar3 = floatVar1 - floatVar2;
        }    

        //Print doubleVar3 result
        System.out.println("doubleVar3 =" + doubleVar3);
    }
}
**/

/** 
public class HelloWorld{
    public static void main(String[] args) {
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());
 }
}
**/

/* 
public class HelloWorld{
    public static void main(String[] args) {
        String txt = "Hello World";
	System.out.println(txt.toUpperCase());   
    }
}
*/


/* 
// public class HelloWorld {
//     public static void main(String[] args){
//         String txt = "Hello World";
//         System.out.println(txt.toLowerCase());
//     }
    
// }


// public class HelloWorld{
//     public static void main(String[] args) {
//         String txt = "Please locate where 'locate' occurs!";
//         System.out.println(txt.indexOf("locate")); 
//     }
// }


// public class HelloWorld {
//     public static void main(String[] args) {
//         String name = "Alice";
//         char firstLetter = name.charAt(0);
//         System.out.println("The first letter is: " + firstLetter);
//     }
    
// }


// public class HelloWorld {
//     public static void main(String[] args) {
//         String emoji = "😊";
//         int code = emoji.codePointAt(0); 
//         System.out.println(code);
//     }
    
// }


// public class HelloWorld {
//     public static void main(String[] args) {
//         boolean isSunny = true;  // 赋值为真
//         boolean hasUmbrella = false;  // 赋值为假

//         System.out.println("Is it sunny? " + isSunny);   // 输出: true
//         System.out.println("Do you have an umbrella? " + hasUmbrella);  // 输出: false
//     }
// }
// */

// import java.util.ArrayList;
// public class HelloWorld {
//     public static void main(String[] args){
//         //1) Given String str = “Oakland”; Write a code to

//         String str = "Oakland";
//         int length = str.length();
//         // find length
//         System.out.println("Length of the string: "+length);

//         // fint the char at index 2
//         char charAtIndex2 = str.charAt(2);
//         System.out.println("Charcter at index 2: "+charAtIndex2);

//         //extract the sbustring”land“
//         String substring = str.substring(3);
//         System.out.println("Extracted substring: "+substring);

//         //convert to Uppercase
//         String uppercase = str.toUpperCase();
//         System.out.println("uppercase: "+uppercase);


//         //2)Given int[] abc = {1,3,5,2,5}; Write a code to
//         int[] abc = {1,3,5,2,5};
//         int length2 = abc.length;
//         System.out.println("find the length of the array: "+length2);

//         int lastnumber = abc[abc.length-1];
//         System.out.println("find the last member of the array:" +lastnumber);

//         //3) Create an ArrayList that consists of the following strings: “Austin”, “Houston”, “Oakland”, “Paris”, “San Francisco”, “Seattle”. Remove “Paris’ from the ArrayList.
//         ArrayList<String> cities = new ArrayList<>();
//         cities.add("Austin");
//         cities.add("Houston");
//         cities.add("Oakland");
//         cities.add("Paris");
//         cities.add("San Francisco");
//         cities.add("Seattle");

//         cities.remove("Paris");
//         System.out.println("ArrayList: "+ cities);
//     }
    
// }


// import java.time.Duration;
// import java.time.LocalTime;


// public class HelloWorld {

//     public static void main(String[] args) {

//         // Enter word according to Scanner
//         Scanner sc = new Scanner(System.in);
//         LocalTime startDate = LocalTime.now();
//         System.out.println("Please enter any word: ");
//         String enterWord = sc.nextLine();
//         LocalTime endDate = LocalTime.now();

//         int wordLength = enterWord.length();

//         // Timing during entering process
//         Duration duration = Duration.between(startDate, endDate);
//         long timeElapsed = duration.getSeconds();

//         System.out.println("Word Length: " + wordLength);
//         System.out.println("Elapsed Seconds= " + timeElapsed);

//         String lengthType = "";
//         if (enterWord.isEmpty()) {
//             System.out.println("You did not enter any word");

//         } else{
//             if (wordLength <= 5) {
//                 lengthType = "short"; 
//             } else if(wordLength > 5 && wordLength <= 10) {
//                 lengthType = "medium"; 
//             }else{
//                 lengthType = "long";
//             }

//             System.out.println("Your word is" + enterWord);
//             System.out.println("It is a " + lengthType + " word");
//             System.out.println("The length of the word is " + wordLength);
//             System.out.println("Your reaction time is " + timeElapsed + " seconds");
//         }

//     }
    
// }




// public class HelloWorld {

//     public static void main(String[] args) {

//         int x = 15, y = 9;

//         if (x > y)

//              y += x;

//         else

//             x++;

//             y -= x;

//         System.out.println("x = " + x + "; y = " + y);

//     }

// }



// public class HelloWorld {
//         public static void main(String[] args) {
//             System.out.println("Hello World");
//         }
// }



// // Oct26 Lab assignment Part1
// public class HelloWorld{
//         public static void main(String[] args){
//             // Initialize arrays x and y
//             int[] x = {11,3,5,7,9};
//             int[] y = {2,4,6,8,0};

//             // Initialize array z
//             int[] z = new int[5];
//             for(int i = 0;i < z.length; i++){
//                 z[i] = Math.max(x[i], y[i]);
//             }
            
//             // Print arrays
//             System.out.print("Array x={ ");
//             for(int i = 0;i < x.length; i++){
//                 System.out.print( x[i] + (i < x.length-1 ? ", " :" "));
//             }
//             System.out.println("}");

//             System.out.print("Array y={");
//             for(int i = 0; i< y.length; i++){
//                 System.out.print( y[i] + (i < y.length-1 ? ", ":" "));
//             }
//             System.out.println("}");

//             System.out.print("Array z={");
//             for(int i = 0; i<z.length; i++){
//                 System.out.print( z[i] + (i < z.length-1 ? ", ":" "));
//             }
//             System.out.println("}");
//         }
// }


// // Oct26 Lab assignment Part2
import java.util.ArrayList;
public class LabOct27Part2{
    public static void main(String[] args){
    //Initialize the name list
    ArrayList<String> names = new ArrayList<>();
    names.add("Allen");
    names.add("Brrey");
    names.add("Cloudd");
    names.add("Davvid");
    names.add("Emmma");

    //Creat a new list to restore the new names
    ArrayList<String> newnames = new ArrayList<>();
    for(String name:names){
        if(name.length()>1){
            String newname = name.substring(name.length()-1).toUpperCase() + 
                             name.substring(1,name.length()-1).toLowerCase() +
                             name.substring(0,1).toLowerCase();
            newnames.add(newname);
        }else{
            newnames.add(name);
        }
    }

    //Print the original name and swapping name
    System.out.println("Name1= {" + String.join(", ",names)+"}");
    System.out.println("Name2= {" + String.join(", ",newnames) + "}");
 }
}
