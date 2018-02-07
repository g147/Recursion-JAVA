import java.util.*;
class recursiveNumbers{
    static int lc=1;
    static int co=0;
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your choice :--");
        System.out.println("01. Find Factorial of a number.");
        System.out.println("02. Calculate Permutations.");
        System.out.println("03. Calculate Combinations.");
        System.out.println("04. Check for Special Number.");
        System.out.println("05. Calculate Exponential Function.");
        System.out.println("06. Find a term in a Fibonacci Sequence.");
        System.out.println("07. Find HCF of 2 Numbers.");
        System.out.println("08. Find LCM of 2 Numbers.");
        System.out.println("09. Check for Prime Number.");
        System.out.println("10. Check for Twin Primes.");
        System.out.println("11. Find sum of digits of a Number.");
        System.out.println("12. Check for Magic Number.");
        System.out.println("13. Check for Happy Number.");
        System.out.println("14. Check for Armstrong Number.");
        System.out.println("15. Reverse a  Number.");
        System.out.println("16. Check for Palindrome Number.");
        System.out.println("17. Find Prime Factors of a Number.");
        System.out.println("18. Find Sum of Prime Factors of a Number.");
        System.out.println("19. Convert Decimal to Binary.");
        System.out.println("20. Convert Binary to Decimal.");
        System.out.println("21. Convert Decimal to Octal.");
        System.out.println("22. Convert Octal to Decimal.");
        System.out.println("23. Convert Decimal to Hexadecimal.");
        int n = in.nextInt();
        int p=0, q=0, r=0;
        switch(n){
            case 1:
                System.out.println("Enter a number...");
                p = in.nextInt();
                System.out.println("Factorial of the number is : "+factorial(p));
                break;
            case 2:
                System.out.println("Enter the value of p....");
                p = in.nextInt();
                System.out.println("Enter the value of q....");
                q = in.nextInt();
                System.out.println("Permutation Result is : "+permutation(p,q));
                break;
            case 3:
                System.out.println("Enter the value of p....");
                p = in.nextInt();
                System.out.println("Enter the value of q....");
                q = in.nextInt();
                System.out.println("Combination Result is : "+combination(p,q));
                break;
            case 4:
                System.out.println("Enter a number...");
                p = in.nextInt();
                System.out.println("This is a Special Number : "+special(p));
                break;
            case 5:
                System.out.println("Enter a number...");
                p = in.nextInt();
                System.out.println("Enter its exponent...");
                q = in.nextInt();
                System.out.println("Exponential Result is : "+power(p,q));
                break;
            case 6:
                System.out.println("Enter the term...");
                p = in.nextInt();
                System.out.println("The Fibonacci Term is : "+fibonacci(p));
                break;
            case 7:
                System.out.println("Enter the numbers...");
                p = in.nextInt();
                q = in.nextInt();
                System.out.println("HCF of the numbers is : "+hcf(p,q));
                break;
            case 8:
                System.out.println("Enter the numbers...");
                p = in.nextInt();
                q = in.nextInt();
                System.out.println("LCM of the numbers is : "+lcm(p,q));
                break;
            case 9:
                System.out.println("Enter the number...");
                p = in.nextInt();
                q = prime(p,1);
                if(q==2)
                    System.out.println("This is a Prime Number : "+true);
                else
                    System.out.println("This is a Prime Number : "+false);
                break;
            case 10:
                System.out.println("Enter the two numbers...");
                p=in.nextInt();
                q=in.nextInt();
                if(prime(p,1)==2&&prime(p,1)==2&&Math.abs(p-q)==2)
                    System.out.println("The Numbers are twin primes.");
                else
                    System.out.println("The Numbers are not twin primes.");
                break;
            case 11:
                System.out.println("Enter the two numbers...");
                p=in.nextInt();
                System.out.println("The Sum of Digits are : "+sumDigits(p));
                break;
            case 12:
                System.out.println("Enter the number...");
                p=in.nextInt();
                System.out.println("This is a Magic Number : "+magicNumber(p));
                break;
            case 13:
                System.out.println("Enter the number...");
                p=in.nextInt();
                System.out.println("This is a Happy Number : "+happyNumber(p));
                break;
            case 14:
                System.out.println("Enter the number...");
                p=in.nextInt();
                System.out.println("This is a Armstrong Number : "+armstrongNumber(p));
                break;
            case 15:
                System.out.println("Enter the number...");
                p=in.nextInt();
                System.out.println("The Reversed Number is : "+reverseNumber(p));
                break;
            case 16:
                System.out.println("Enter the number...");
                p=in.nextInt();
                System.out.println("This is a Palindrome Number : "+palindromeNumber(p));
                break;
            case 17:
                System.out.println("Enter the number...");
                p=in.nextInt();
                System.out.println("Prime Factors of this number are : ");
                primeFactors(p,2);
                break;
            case 18:
                System.out.println("Enter the number...");
                p=in.nextInt();
                System.out.println("Sum of Prime Factors of this number are : "+sumOfPrimeFactors(p,2));
                break;
            case 19:
                System.out.println("Enter the number...");
                p=in.nextInt();
                System.out.println("The Binary is : "+decimalToBinary(p));
                break;
            case 20:
                System.out.println("Enter the number...");
                p=in.nextInt();
                System.out.println("The Decimal is : "+binaryToDecimal(p));
                break;
            case 21:
                System.out.println("Enter the number...");
                p=in.nextInt();
                System.out.println("The Octal is : "+decimalToOctal(p));
                break;
            case 22:
                System.out.println("Enter the number...");
                p=in.nextInt();
                System.out.println("The Decimal is : "+octalToDecimal(p));
                break;
            case 23:
                System.out.println("Enter the number...");
                p=in.nextInt();
                System.out.println("The Octal is : "+decimalToOctal(p));
                break;
            case 24:
                System.out.println("Enter the number...");
                p=in.nextInt();
                System.out.println("The Hexadecimal is : "+decimalToHexadecimal(p));
                break; 
        }
    }
    public static int factorial(int n){
        if(n==0)
            return 1;
        else
            return(n*factorial(n-1));
    }
    public static int permutation(int n, int r){
        int a = factorial(n);
        int b = factorial(n-r);
        return(a/b);
    }
    public static int combination(int n, int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        return(a/(b*c));
    }
    public static boolean special(int n){
        int rem,s=0,copy=n;
        while(n>0){
            rem=n%10;
            s=s+factorial(rem);
            n=n/10;
        }
        return (n==copy);
    }
    public static int power(int n, int p){
        if(n==0)
            return 1;
        else
            return(n*power(n, p-1));
    }
    public static int fibonacci(int n){
        if(n<=1)
            return 0;
        else if(n==2)
            return 1;
        else
            return(fibonacci(n-1)+fibonacci(n-2));
    }
    public static int hcf(int n, int p){
        if(p==0)
            return n;
        else
            return hcf(p,n%p);
    }
    public static int lcm(int n, int p){
        if(lc%n==0&&lc%p==0)
            return lc;
        lc++;
        lcm(n,p);
        return lc;
    }
    public static int prime(int n, int p){
        if(n<=p){
            if(n%p==0)
                co++;
            return prime(n,p+1);
        }
        else
            return co;
    }
    public static int sumDigits(int n){
        if(n==0)
            return 0;
        else{
            int d=n%10;
            return (d+sumDigits(n/10));
        }
    }
    public static int sumDigitsSquare(int n){
        if(n==0)
            return 0;
        else{
            int d=n%10;
            return ((d*d)+sumDigits(n/10));
        }
    }
    public static int sumDigitsCube(int n){
        if(n==0)
            return 0;
        else{
            int d=n%10;
            return ((d*d*d)+sumDigits(n/10));
        }
    }
    public static boolean magicNumber(int n){
        int a=n;
        while(a>9)
            a = sumDigits(a);
        if(a==1)
            return true;
        return false;
    }
    public static boolean happyNumber(int n){
        int a=n;
        while(a>9)
            a = sumDigitsSquare(a);
        if(a==1)
            return true;
        return false;
    }
    public static boolean armstrongNumber(int n){
        int a=sumDigitsCube(n);
        if(a==n)
            return true;
        return false;
    }
    public static int reverseNumber(int n){
        int r=0;
        if(n>0){
            int d =n%10;
            r=r*10+d;
            return (reverseNumber(n/10));
        }
        else
            return r;
    }
    public static boolean palindromeNumber(int n){
        int a=reverseNumber(n);
        if(a==n)
            return true;
        return false;
    }
    public static void primeFactors(int n, int p){
        String result="";
        if(n>1){
            if(n%p==0){
                result = result+","+Integer.toString(p);
                System.out.println(result);
                primeFactors(n/p, p);
            }
            primeFactors(n,p+1);
        }
    }
    public static int sumOfPrimeFactors(int n, int p){
        int sum=0;
        if(n>1){
            if(n%p==0){
                sum=sum+p;
                return sumOfPrimeFactors(n/p, p);
            }
            return sumOfPrimeFactors(n, p+1);
        }
        else
            return sum;
    }
    public static int decimalToBinary(int n){
        int bin=0;
        if(n>0){
            int d = n%2;
            decimalToBinary(n/2);
            bin=bin*10+d;
        }
        return bin;
    }
    public static int binaryToDecimal(int n){
        int dec=0, c=0;
        if(n>0){
            int d = n%10;
            dec=dec+d*(int)Math.pow(2,c++);
            return binaryToDecimal(n/10);
        }
        return dec;
    }
    public static int decimalToOctal(int n){
        int oct=0;
        if(n>0){
            int d = n%8;
            decimalToOctal(n/8);
            oct=oct*10+d;
        }
        return oct;
    }
    public static int octalToDecimal(int n){
        int dec=0, c=0;
        if(n>0){
            int d = n%10;
            dec=dec+d*(int)Math.pow(8,c++);
            return octalToDecimal(n/10);
        }
        return dec;
    }
    public static String decimalToHexadecimal(int n){
        String hex="";
        if(n>0){
            int d = n%16;
            if(d>=0&&d<=9)
                hex=(char)(d+48)+hex;
            else
                hex=(char)(d+55)+hex;
            decimalToHexadecimal(n/16);
        }
        return hex;
    }
    
}