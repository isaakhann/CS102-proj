import java.util.Random;
import java.util.Scanner;

public class assignment2 {
    public static int[] max_min(int arr[])
    {
        int min=99;
        int max=-99;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
            if(arr[i]<min)
            min=arr[i];
        }
        int res[] = new int[2];
        res[0]=max;
        res[1]=min;
        
        return res;
    }
    public static int[] average(int arr[])
    {
        int res[]= new int[arr.length];
        int sum = 0;
        for ( int i = 0;i < arr.length; i++)
        {
        sum += arr[i];
        }
        int avg = sum / arr.length;

        for ( int i = 0; i < arr.length; i++)
        {
        res[i] = arr[i] - avg;
        }

        return res;
    }
    public static int[] odd_even (int arr[]){
        int res[]=new int[2];
        int sum_even=0;
        int sum_odd=0;

        for (int i=0 ; i<arr.length ; i++){
            if(i%2 ==0)
            sum_even+=arr[i];
            else
            sum_odd+=arr[i];
        }
        res[0]=sum_even;
        res[1]=sum_odd;

        return res;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rn = new Random();
        
        int size = 1;
        System.out.println("Enter the size of the array");
        size = scan.nextInt();
        int [] arr = new int[size]; 
        for(int i = 0; i<size; i++){
            int rand = rn.nextInt(0,100);
            arr[i] = rand;
        }
    
        System.out.println("Array is: ");
        for(int i = 0; i<size; i++){
            System.out.println(arr[i]);
        }
       int choice = 5;
       while(choice != 0){
        System.out.println("Enter Your Choice");
        System.out.println("1. Find the max and min of the array");
        System.out.println("2. Find the differences from the average");
        System.out.println("3. Find the sum of odd and even integers");
        System.out.println("0. Quit");
        choice = scan.nextInt();
        if(choice == 1){
            System.out.println("The max of the array is "+max_min(arr)[0]);
            System.out.println("The min of the array is "+ max_min(arr)[1]);

        }
        if(choice==2){
            System.out.println("differences of average is:");
        for(int i=0;i<arr.length;i++)
            System.out.print(average(arr)[i]+" ");
    }
    if(choice == 3){
        System.out.println("Sum of even indices are: "+ odd_even(arr)[0]);
        System.out.println("Sum of odd indices are: "+ odd_even(arr)[1]);
    }
    
    if(choice == 0)
    break;
       }

    }
}
