import java.util.Arrays;

public class Multiples {
    public static int[] arrayOfMultiples(int num, int length){

        
        int listOfNumbers[] = new int[length];
        listOfNumbers[0] = num;
        
        for(int i = 1; i < length; i++){
            listOfNumbers[i] = num * (i + 1);
        }
        return listOfNumbers;
    }

    //Function to print arrray
    public static void print(int[] arr){

        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if((i+1) != arr.length){
                System.out.print(", ");;
            }
            if((i+1) == arr.length){
                break;
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        
       // Print array with manual function 
       Multiples.print(Multiples.arrayOfMultiples(17, 6));

       // Print array with built in function
       System.out.println(Arrays.toString(Multiples.arrayOfMultiples(17, 6)));

       

       

       
    }
}
