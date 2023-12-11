package Sumofnaturalnumbers;

import java.util.Scanner;

public class Sumofnaturalnumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=scanner.nextInt();
        if(n<=0){
            System.out.println("please enter a positive number");
        }else{
            int sum=calculateSum(n);
            System.out.println("Sum of nutural numbers up to"+n+"is:"+sum);
        }
        scanner.close();

    }
    private static int calculateSum(int n){
        return(n*(n+1))/2;
    }
}
