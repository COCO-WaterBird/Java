package edu.neu.mgen;

public class LabOct27Part1 {

    // Oct26 Lab assignment Part1

        public static void main(String[] args){
            // Initialize arrays x and y
            int[] x = {11,3,5,7,9};
            int[] y = {2,4,6,8,0};

            // Initialize array z
            int[] z = new int[5];
            for(int i = 0;i < z.length; i++){
                z[i] = Math.max(x[i], y[i]);
            }
            
            // Print arrays
            System.out.print("Array x={ ");
            for(int i = 0;i < x.length; i++){
                System.out.print( x[i] + (i < x.length-1 ? ", " :" "));
            }
            System.out.println("}");

            System.out.print("Array y={");
            for(int i = 0; i< y.length; i++){
                System.out.print( y[i] + (i < y.length-1 ? ", ":" "));
            }
            System.out.println("}");

            System.out.print("Array z={");
            for(int i = 0; i<z.length; i++){
                System.out.print( z[i] + (i < z.length-1 ? ", ":" "));
            }
            System.out.println("}");
        }
}


