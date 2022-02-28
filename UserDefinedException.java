import java.util.*;
import java.lang.*;
import java.io.*;

class OwnCustomException extends Throwable
{
    static int a,b;
    void exception(int a,int b)
    {
        try {
            this.a=a;
            this.b=b;
            if(a>b)
            {
                throw new OwnCustomException();
            }
            else
            {
                System.out.println("b :"+b+" is greater.");
            }
        } catch (OwnCustomException e) {
            //TODO: handle exception
            System.out.println("UserDefinedException Caught");
            System.out.println("a :"+a+" is greater.");
        }
       
    }
}

class UserDefinedException
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        OwnCustomException org = new OwnCustomException();
        System.out.println("Enter the value of a :");
        int a=sc.nextInt();
        System.out.println("Enter the value of b :");
        int b=sc.nextInt();
        org.exception(a,b);
    }
}