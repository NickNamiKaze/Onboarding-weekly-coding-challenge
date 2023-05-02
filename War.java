import java.util.Arrays;

public class War{
    public static void warOfNumbers(int[] arr){
        // Check if array is empty
        if(arr.length < 1){
            System.out.println("Array is empty");
        }
        // Check if array only has one element 
        else if(arr.length < 2){
            int even, odd;
            if(arr[0] % 2 == 0){
                even = arr[0];
                System.out.println("Only one Even number found, therefore Even numbers won.");
                System.out.println("With a difference of " + even);
            }
            else{
                odd = arr[0];
                System.out.println("Only one Odd number found, therefore Odd numbers won");
                System.out.println("With a difference of " + odd);
            }
        }
        else{
            // Declare array to hold even and odd values
            int[] even = new int[arr.length];
            int[] odd = new int[arr.length];

            // Loop to categorize  if even numbers by checking if the remainder = 0
            // else then it's odd
            for(int i = 0; i < arr.length; i++){
                if(arr[i] % 2 == 0){
                    even[i] = arr[i];
                }
                else{
                    odd[i] = arr[i];
                }
            }
            
            // Calculate total even numbers
            int evenTotal = 0, oddTotal = 0;
            for(int i = 0; i < even.length; i++){
                evenTotal += even[i];
            }
            // Calculate total odd numbers
            for(int i = 0; i < odd.length; i++){
                oddTotal += odd[i];
            }
            // Check which side is greater or equal
            // Even is greater
            if(evenTotal > oddTotal){
                System.out.println("The Even numbers won with "+ evenTotal +" agaisnt " + oddTotal);
                System.out.println("With a difference of " + (evenTotal - oddTotal));
            }
            // Even and odd are equal
            else if(evenTotal == oddTotal){
                System.out.println("The even numbers (" + evenTotal + ") and the odd numbers ("+ oddTotal +") are tied up");
                System.out.println("With a difference of " + (evenTotal - oddTotal));
            }
            // Odd is greater
            else{
                System.out.println("The Odd numbers won with "+ oddTotal +" agaisnt " + evenTotal);
                System.out.println("With a difference of " + (oddTotal - evenTotal));
            }
        }
        
        
    }

    public static void main(String[] args) {
        
        int[] test1 = {2, 8, 7, 5};
        int[] test2 = {12, 90, 75};
        int[] test3 = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        // Test for tie
        int[] test4 = {12, 90, 75, 27};
        // Test for empty
        int[] test5 = {};
        // Test for only one element
        int[] test6 = {7};

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("<<<<<<< Examples >>>>>>>");
        System.out.println();
        System.out.println("Given numbers: " + Arrays.toString(test1));
        War.warOfNumbers(test1);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("Given numbers: " + Arrays.toString(test2));
        War.warOfNumbers(test2);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("Given numbers: " + Arrays.toString(test3));
        War.warOfNumbers(test3);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("<<<<<<< Test for Tie game >>>>>>>");
        System.out.println();
        System.out.println("Given numbers: " + Arrays.toString(test4));
        War.warOfNumbers(test4);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("<<<<<<< Test for empty array >>>>>>>");
        System.out.println();
        System.out.println("Given numbers: " + Arrays.toString(test5));
        War.warOfNumbers(test5);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("<<<<<<< Test for one element in array >>>>>>>");
        System.out.println();
        System.out.println("Given numbers: " + Arrays.toString(test6));
        War.warOfNumbers(test6);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
    }
}