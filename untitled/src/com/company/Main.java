package com.company;

import java.nio.channels.Pipe;
import java.nio.channels.SocketChannel;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(25);
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        for(int i=1; i<size; i++){
            int j=i;
            while(array[j]<array[j-1]){
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j--;
            }

        }
        for(int i=0; i<size; i++){
            System.out.print("   "+array[i] );
    }

}


    public static void main443(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        if (array[0] < array[1]) {
            int temp = array[0];
            array[0] = array[1];
            array[1] = temp;

            if (array[2] < array[1]) {
                temp = array[1];
                array[1] = array[2];
                array[2] = temp;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print("  "+array[i]);

        }
    }
    public static void main3456(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("x: " + array[x]);
        System.out.println("y: " + array[y]);

        for (int i = 0; i < size; i++)

            for (int j = 0; j < size-1 ; j++) {
                int temp = array[j];
                if (x > j && y < j) {

                    array[j] = array[j + 1];
                    array[j + 1] = temp;
             array[y]=array[x];
                }


            }
        for (int q = 0; q < size - 1; q++) {
            System.out.print("  " + array[q]);
    }}






    public static void main4545(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + "  ");

        }
        int swapCount;// замен нет

        for (int i = 0; i < size; i++) {
            swapCount = 0;
            for (int j = 0; j < size - 1 - i; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapCount = swapCount+1;
                } else if (j == size - i - 2) {
                    System.out.println();
                    System.out.println("последняя пара не меняется:  " + j);
                    i++;
                }

            for (int q = 0; q < size; q++)
                System.out.print(array[q] + "  ");

        System.out.println();
        if (swapCount == 0)
            System.out.println(swapCount);


    }}


















    public static void main644(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i]= random.nextInt(200);
            System.out.print(array[i]+"  ");
        }
        System.out.println();
        for(int i=0; i<size-1; i++)
for (int j=0; j<size-1-i; j++)
    if(array[j]>array[j+1]) {
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
    }
        for(int i=0; i<size; i++){
            System.out.print(array[i]+"  ");
        }
        System.out.println();
    }




public static void main5778(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] array = new int[size];

    for (int N = 0; N < size; N++) {
        boolean isOk;

   do {
       isOk = true;

       array[N] = random.nextInt(100);
       for (int i = 0; i < N; i++) {
           if (array[i] == array[N]) {
               System.out.println("Повтор" + array[i]);
               isOk = false;
               break;
           }
       }
   }while (isOk == false) ;
       }
       for(int i=0; i<size; i++)
           System.out.print(array[i]+"  ");
}











    public static void main434(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + "   ");

        }
        System.out.println();
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min + " ");

        int newMin= Integer.MAX_VALUE;
        for(int i =0; i<size; i++){
            if (array[i]<newMin&&array[i]>min)
                newMin=array[i];

        }
        System.out.print(newMin+"   ");




    }




    public static void main76(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
            System.out.print(a[i] + "  ");
        }
        System.out.println();
        int maxIndex = 0;



    }

    public static void main5355(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    for (int i=0; i<a.length/2; i=i+1) {
        System.out.println(i+"<->"+(a.length -1-i));
        int temp =a[i];
        a[i]= a[a.length -1 -i];
        a[a.length -1 -i]= temp;





}



        }



    public static void main666(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        int sum=0;
        for (int i=0; i<a.length; i++){
            sum+=a[i];
        }
        System.out.println("sum="+sum);
        int max=a[0];
        int min = a[0];
        for (int i=0;i<a.length; i++){
            if(a[i]>max)
                max = a[i];
            if(a[i]<min)
                min = a[i];
        }
        System.out.println("max" + max);
        System.out.println("min"+ min);
        int summ1=0;
        int summ2=0;

        for (int i=0; i<a.length; i++){
            if(a[i]%2==0)
                summ1+=a[i];
            if(i%2==0)
                summ2+=a[i];


        }
        System.out.println("четных"+ summ1);
        System.out.println("четных позиций " +summ2);

    }

    public static void main356(String[] args) {
        int [] a =  {1,2,3,4,5,6,7,8};
        double [] d = new double[10];
        System.out.println(a[2]);
        System.out.println(a[0]);
        System.out.println(a.length);
        System.out.println(d.length);

    }






    public static void main32(String[] args) {
        int speedOfSecondCar  = 90;
        speedOfSecondCar = speedOfSecondCar + 5;
        speedOfSecondCar*=5;
    }
    public static void main39(String[] args) {
        int x = 10;
        x= ++x+x;
        System.out.println(x);
    }


    public static void main47(String[] args) {
        int x =10000;
        int count=0;
        int tempX=x;
       while(tempX>9){
           count = count+1;
           tempX=tempX/10;
        }
        System.out.println("количество цифр:   "+count);
        int d = (int) Math.pow(10,count);
        System.out.println("максимальный делитель:   "+d);
        while(d>0){
            int c = x/d;
            System.out.print(c+"  ");
            x=x%d;
            d=d/10;
        }

    }


        public static void main77(String[] args) {
            Random r = new Random();
            int x = 20;
            int y = 7;
            int z = 3;
            int i;
            int j ;


            for (int k=0; k<z; k++) {
                for ( i = 0; i < x+k; i++) {

                    for ( j = 0; j < y; j=j+1) {


                        if (j< y / 2 + i && j > y/ 2 - i)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }}}



    public static void main95(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean prime= true;
               for(int i=2; i<=Math.sqrt(x); i++) {
                   if (x % i == 0){
                       System.out.println("нашли делитель:" +i);
                       prime = false;
                       break;
                   }

               }
if (prime==true)
        System.out.println("простое");
    else
    System.out.println("составное");}





    public static void main96(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int d = 1;
        int count = 0;
        while (d<=x){

            if (x%d==0)
                count++;
            d++;}
        if (count ==2)
            System.out.println("простое число");
            System.out.println("всего делителей:"+count);



    }
    public static void main98(String[] args) {
        Random random = new Random();
        for (int i = 0; i<10; i++)
            System.out.println(random.nextInt(100));// генератор случайных чисел
    }

    public static void main97(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(1000);
        int user=0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            user = scanner.nextInt();

            if (user > secret)
                System.out.println("секрет меньше");
            else if (user < secret)
                System.out.println("секрет больше");
            count = count + 1;

        }while(secret !=user);


        System.out.println("угадал");
        System.out.println("попыток" + count);
    }


    public static void main99(String[] args) {
        int secret = 7;
        int user=0;
        int count = 0;
               Scanner scanner = new Scanner(System.in);
        while (user != secret){
            user = scanner.nextInt();
                                if(user > secret)
                                    System.out.println("секрет меньше");
                                    else if (user < secret)
                                    System.out.println("секрет больше");
            count=count +1;



        }
        System.out.println("угадал");
        System.out.println("попыток" + count);
    }

    public static void main898(String[] args) {
        int x=10;
        int y=10;
        for (int i=0;i<y; i++ ) {
            for (int j = 0; j <x; j++){
                if (j == 0)
                    System.out.print("*");

                else if (i<x-1)
                    System.out.print("*");

                else if(i==j)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
                      System.out.println();
        }}

    public static void main44(String[] args) {
        int x=10;
        int y=10;
        for (int i=0;i<y; i=i+1 ) {
            for (int j = 0; j <x; j = j + 1){
                if (i == 0)
                    System.out.print("*");

                else if (j==y-1)
                    System.out.print("*");

                else if(i<j)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }}


    public static void main19(String[] args) {
        int x=10;
        int y=10;
        for (int i=0;i<y; i=i+1 ) {
            for (int j = 0; j <x; j = j + 1){
                if (i == x-1)
                    System.out.print("*");

                else if (x-i==j)
                    System.out.print("*");

                else if(j==y-1)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }}







    public static void main51(String[] args) {
        int x=9;
        int y=9;
                for (int i=1; i<=x; i=i+1){
            for(int j=1; j<=y; j=j+1){
                    System.out.print(+ i+ "*" +j +"="+ i*j);
                System.out.print("\t");
                System.out.print(+ i+1+ "*" +j +"="+ (i+1)*j);
                System.out.print("\t");
                System.out.print(+ i+2+ "*" +j +"="+ (i+2)*j);
                         }
            System.out.println();
        }}

    public static void main34(String[] args) {



    int x=9;
    int y=9;
                for (int i=1; i<=x; i=i+1){
        for(int j=1; j<=y; j=j+1){
            if (i==1)
                System.out.println(+ i+ "*" +j +"="+ i*j+"  "+(i+1)+"*"+j+"="+(i+1)*j+  "  "+(i+2)+"*"+j+ "=" +(i+2)*j);
            else if (i==4)
                System.out.println(+ i+ "*" +j +"="+ i*j+"  "+(i+1)+"*"+j+"="+(i+1)*j+  "  "+(i+2)+"*"+j+ "=" +(i+2)*j);
            else if (i==7)
                System.out.println(+ i+ "*" +j +"="+ i*j+"  "+(i+1)+"*"+j+"="+(i+1)*j+  "  "+(i+2)+"*"+j+ "=" +(i+2)*j);
        }
        System.out.println();
    }}












    public static void main7(String[] args) {
    int x=10;
    int y=10;
        for (int i=1;i<y; i=i+1 ) {
        for (int j = 1; j <x; j = j + 1){
            if(i+j>x-1)
                System.out.print("*");
                        else
                System.out.print(" ");
        }
            System.out.println();
    }}








    public static void main15(String[] args) {
        int x=10;
        int y=10;
        for (int i=0;i<y; i=i+1 ) {
            for (int j = 0; j <x; j = j + 1){
                if (i==0||j==0||i==y-1||j==x-1||i>j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
    }}

    public static void main10(String[] args) {
        int x=10;
        int y=10;
        for (int i=0;i<y; i=i+1 ) {
            for (int j = 0; j <x; j = j + 1){
                if (i == 0 || i == y-1 )
                    System.out.print("*");

                else if (j==0 || j==x-1)
                    System.out.print("*");

                else if(i+j==x-1)
                    System.out.print("*");
                else if (i>=j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
    }}








    public static void main14(String[] args) {
        int x=10;
        int y=4;
        for (int i=0;i<y; i=i+1 ) {
            for (int j = 0; j <x; j = j + 1){
            if (i == 0 || i == y-1 )
                System.out.print("*");
            else if (j==0 || j==x-1)
                System.out.print("*");
                else
                System.out.print(" ");
        }
        System.out.println();


        }}










    public static void main6(String[] args) {
        int x =4;
        int y=3;
        for ( int i=1; i<=x; i=i+1) {
            for (int t = 1; t <= y; t = t + 1){
                System.out.print("*");
        }
                System.out.println("*");

        }}














    public static void main11(String[] args) {
        int x=100
                ;
        for (int i = 1; i<= x; i = i + 1) {
            if (x % i ==0)
            System.out.println(i);}

    }




    public static void main12(String[] args) {
        int x = 213579;
        int s=0;
        int min = 10;
        int max= 0;
        while(x>0){
            int c = x%10;
            int h = c%2;
            if(c>max && c%2==0)
                max=c;
            if(c<min&&c%2==1)
            min=c;
            System.out.println("x="+x);
            System.out.println("c="+c);
            s=s+c;
            System.out.println("s="+s);
            x=x/10;
           
        }
        System.out.println("max"+max);
        System.out.println("min"+min);
    }




    public static void main3(String[] args) {
        int s=0;
        int i = 0;
        while (i <11) {
            s = s + i;
            i = i + 1;
        }
            System.out.println(s);



    }


    public static void main2(String[] args) {
        int s = 0;
        int i = 0;
        while (s < 20){
            i = i + 1;
        s = s + i;
    }
    System.out.println("i="+i);
};}










