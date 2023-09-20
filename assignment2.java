import java.util.Random;
import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rn = new Random(0);
        
        int size = 1;
        System.out.println("Enter the size of the array");
        size = scan.nextInt();
        int [] arr = new int[size]; 
        for(int i = 0; i<size; i++){
            int rand = rn.nextInt(0,100);
            arr[i] = rand;
        }
        
        

    }
}
