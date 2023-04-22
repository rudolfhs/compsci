import java.util.Scanner;

class RecursiveMethods{
    public int Fact(int n){
        if(n==1){
            return 1;
        }
        return n*Fact(n-1);
    }

    public int Sum(int n){
        if(n==0){
            return 0;
        }
        return n+Sum(n-1);
    }

    public int Power(int x, int y){
        if(y==0){
            return 1;
        }
        return x*Power(x,y-1);
    }

    public int Fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else{
            return (Fibonacci(n - 1) + Fibonacci(n - 2));
        }
    }

    public boolean findPalindrome(String InString,int index) {
        if (InString.charAt (index) != InString.charAt((InString.length ()-1) - index)){ 
            return false;
        }
        else if (index == InString.length()/2){
            return true;
        }
        else{
            return findPalindrome(InString, index+1);
        }
    }

    public boolean isPalindrome(int number) {
        int reversedNumber = reverseNumber(number, 0);
        return number == reversedNumber;
    }

    public int reverseNumber(int number, int reversedNumber) {
        if (number == 0) {
            return reversedNumber;
        }

        reversedNumber = reversedNumber * 10 + number % 10;
        return reverseNumber(number / 10, reversedNumber);
    }
}

public class Recursion {
    public static void main(String[] args) {
        RecursiveMethods rm = new RecursiveMethods();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean result = rm.isPalindrome(number);
        System.out.println(result);
        }
    }