package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //firstTask();
        //secondTask();
        //thirdTask();
        //fourthTask();
        //fifthTask();
        //sixthTask();
        //seventhTask();
        //eighthTask();
        //ninthTask();
        tenthTask();
    }

    public static void firstTask()
    {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive four-digit integer number: ");
        do {
            while (!scanner.hasNextInt())
            {
                scanner.nextLine();
                System.out.print("It's not an integer! Try again: ");
            }
            number = scanner.nextInt();
            if (number>=1000 && number <= 9999)
            {
                break;
            }
            else
            {
                System.out.print("It's not a positive four-digit number! Try again: ");
            }
        } while (true);
        int sumFirstNums = number/1000 + number/100%10;
        int sumLastNums = number/10%10 + number%10;
        if (sumFirstNums == sumLastNums) {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

    public static void secondTask()
    {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a real number (variable \'a\'): ");
        while (!scanner.hasNextDouble())
        {
            scanner.nextLine();
            System.out.print("It's not a real number! Try again: ");
        }
        a = scanner.nextDouble();
        System.out.print("Enter a real number (variable \'b\'): ");
        while (!scanner.hasNextDouble())
        {
            scanner.nextLine();
            System.out.print("It's not a real number! Try again: ");
        }
        b = scanner.nextDouble();
        System.out.print("Enter a real number (variable \'c\'): ");
        while (!scanner.hasNextDouble())
        {
            scanner.nextLine();
            System.out.print("It's not a real number! Try again: ");
        }
        c = scanner.nextDouble();

        double res = (b+Math.sqrt(Math.pow(b,2)+4*a*c)/(2*a))-Math.pow(a,3)*c+Math.pow(b,-2);
        System.out.println("Result = " + res);
    }

    public static void thirdTask()
    {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length \'a\' of the first cathetus: ");
        do {
            while (!scanner.hasNextDouble())
            {
                scanner.nextLine();
                System.out.print("It's not a number! Try again: ");
            }
            a = scanner.nextDouble();
            if (a>0)
            {
                break;
            }
            else
            {
                System.out.print("It's not a positive number! Try again: ");
            }
        } while (true);

        System.out.print("Enter length \'b\' of the second cathetus: ");
        do {
            while (!scanner.hasNextDouble())
            {
                scanner.nextLine();
                System.out.print("It's not a positive number! Try again: ");
            }
            b = scanner.nextDouble();
            if (b>0)
            {
                break;
            }
            else
            {
                System.out.print("It's not a positive number! Try again: ");
            }
        } while (true);

        c = Math.sqrt(a*a+b*b);

        double perimeter = a+b+c;
        double square = (a+b)/2;
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Square = " + square);
    }

    public static void fourthTask()
    {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the x coordinate: ");
        while (!scanner.hasNextInt())
        {
            scanner.nextLine();
            System.out.print("It's not an integer! Try again: ");
        }
        x = scanner.nextInt();

        System.out.print("Enter the y coordinate: ");
        while (!scanner.hasNextInt())
        {
            scanner.nextLine();
            System.out.print("It's not an integer! Try again: ");
        }
        y = scanner.nextInt();

        if ((x>=-2 && x<=2 && y>=0 && y<=4) || ((x>=-4 && x<=4 && y>=-3 && y<=0))){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    public static void fifthTask()
    {
        double a, b, c;
        double aPow, bPow, cPow;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a real number (variable \'a\'): ");
        while (!scanner.hasNextDouble())
        {
            scanner.nextLine();
            System.out.print("It's not a real number! Try again: ");
        }
        a = scanner.nextDouble();

        if (a>=0){
            aPow = a*a;
        }else{
            aPow = Math.pow(a,4);
        }

        System.out.print("Enter a real number (variable \'b\'): ");
        while (!scanner.hasNextDouble())
        {
            scanner.nextLine();
            System.out.print("It's not a real number! Try again: ");
        }

        b = scanner.nextDouble();
        if (b>=0){
            bPow = b*b;
        }else{
            bPow = Math.pow(b,4);
        }

        System.out.print("Enter a real number (variable \'c\'): ");
        while (!scanner.hasNextDouble())
        {
            scanner.nextLine();
            System.out.print("It's not a real number! Try again: ");
        }
        c = scanner.nextDouble();

        if (c>=0){
            cPow = c*c;
        }else{
            cPow = Math.pow(c,4);
        }

        System.out.println("aPow = " + aPow);
        System.out.println("bPow = " + bPow);
        System.out.println("cPow = " + cPow);
    }

    public static void sixthTask()
    {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (variable \'a\'): ");
        while (!scanner.hasNextDouble())
        {
            scanner.nextLine();
            System.out.print("It's not a number! Try again: ");
        }
        a = scanner.nextDouble();

        System.out.print("Enter a number (variable \'b\'): ");
        while (!scanner.hasNextDouble())
        {
            scanner.nextLine();
            System.out.print("It's not a number! Try again: ");
        }
        b = scanner.nextDouble();

        System.out.print("Enter a number (variable \'c\'): ");
        while (!scanner.hasNextDouble())
        {
            scanner.nextLine();
            System.out.print("It's not a number! Try again: ");
        }
        c = scanner.nextDouble();

        double max = Math.max(Math.max(a,b),c);
        double min = Math.min(Math.min(a,b),c);
        double res = min + max;
        System.out.println("The sum of the greatest and the least of the three numbers = " + res);
    }

    public static void seventhTask()
    {
        double a, b, h;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the left border of the numeric segment: ");
        while (!scanner.hasNextDouble())
        {
            scanner.nextLine();
            System.out.print("It's not a number! Try again: ");
        }
        a = scanner.nextDouble();

        System.out.print("Enter the right border of the numeric segment: ");
        do {
            while (!scanner.hasNextDouble())
            {
                scanner.nextLine();
                System.out.print("It's not a number! Try again: ");
            }
            b = scanner.nextDouble();
            if (b>a)
            {
                break;
            }
            else
            {
                System.out.print("The right border cannot be less than the left one! Try again: ");
            }
        } while (true);

        System.out.print("Enter the step of the numeric segment: ");
        do {
            while (!scanner.hasNextDouble())
            {
                scanner.nextLine();
                System.out.print("It's not a positive number! Try again: ");
            }
            h = scanner.nextDouble();
            if (h>0)
            {
                break;
            }
            else
            {
                System.out.print("The step cannot be negative! Try again: ");
            }
        } while (true);

        double res = 0;
        for(double x = a; x<=b; x+=h)
        {
            res+= Math.sin(x)*Math.sin(x) - Math.cos(2*x);
        }
        System.out.println("F(x) = " + res);
    }

    public static void eighthTask()
    {
        final int N = 20, K = 5;
        int sum=0;
        int A[] = new int[N];
        Random rand = new Random();
        for(int i=0; i<A.length; i++)
        {
            A[i]=rand.nextInt(100)+1;
            if(A[i]%K==0)
            {
                sum+=A[i];
            }
        }
        System.out.print("Sum = " + sum);
    }

    public static void ninthTask()
    {
        final int firstArrSize = 20, secondArrSize = 5;
        int k = 4;
        int A[] = new int[firstArrSize];
        int B[] = new int[secondArrSize];
        Random rand = new Random();

        System.out.println("Array A : ");
        for(int i=0; i<A.length; i++)
        {
            A[i]=rand.nextInt(100);
            System.out.print(A[i] + " ");
        }

        System.out.println("\n\nArray B : ");
        for(int i=0; i<B.length; i++)
        {
            B[i]=rand.nextInt(100);
            System.out.print(B[i] + " ");
        }

        int res[]=new int[firstArrSize+secondArrSize];
        System.out.println("\n\nResult : ");
        int i;
        for(i=0;i<=k;i++)
        {
            res[i]=A[i];
            System.out.print(res[i] + " ");
        }
        for(int j=0;j<secondArrSize;i++,j++)
        {
            res[i]=B[j];
            System.out.print(res[i] + " ");
        }
        for(int j=k+1;j<firstArrSize;j++)
        {
            res[i]=A[j];
            System.out.print(res[i] + " ");
        }
    }

    public static void tenthTask()
    {
        final int N = 10;
        int arr[][] = new int[N][N];
        for(int i=0;i<arr.length;i+=2)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=j+1;
                arr[i+1][j]=arr.length-j;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.printf("%4d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
