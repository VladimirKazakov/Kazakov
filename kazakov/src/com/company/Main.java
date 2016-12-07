package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int GO_ON=1;
    public static final int DRAW=2;
    public static final int WINNER_X=3;
    public static final  int WINNER_0=4;
    public static final char EMPTY=' ';
    public static final char SYMBOL_X='@';
    public static final char SYMBOL_0='^';

    static char[][] pole =
                   {{EMPTY, EMPTY, EMPTY},
                    {EMPTY, EMPTY, EMPTY},
                    {EMPTY, EMPTY, EMPTY}};

    public static void display() {
        System.out.println(pole[0][0] + "|" + pole[0][1] + "|" + pole[0][2]);
        System.out.println("-----");
        System.out.println(pole[1][0] + "|" + pole[1][1] + "|" + pole[1][2]);
        System.out.println("-----");
        System.out.println(pole[2][0] + "|" + pole[2][1] + "|" + pole[2][2]);
        System.out.println();
        System.out.println();
    }

    public static void makeTurnRandom(char symbol) throws InterruptedException {
     Random random= new Random();
        int i;
        int j;
        do {
            int n = 1+random.nextInt(9);
            n = n - 1;
            i = 2 - n / 3;
            j = n % 3;
        } while (pole[i][j] !=EMPTY);
        pole[i][j] = symbol;
        Thread.sleep(1000);
    }

    public static void makeTurn(char symbol) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int j;
        do {
            int n = scanner.nextInt();
            n = n - 1;
            i = 2 - n / 3;
            j = n % 3;
        } while (pole[i][j] != EMPTY);
        pole[i][j] = symbol;
    }

    public static int check()    {
        for (int i = 0; i < 3; i++) {
            if (pole[i][0] == pole[i][1] && pole[i][1] == pole[i][2]) {
                if (pole[i][0] == SYMBOL_X)
                    return WINNER_X;
                if (pole[i][0] == SYMBOL_0)
                    return  WINNER_0;
            }
            if (pole[0][i] == pole[1][i] && pole[1][i] == pole[2][i]) {
                if (pole[0][i] == SYMBOL_X)
                    return WINNER_X;
                if (pole[0][i] == SYMBOL_0)
                return  WINNER_0;
            }

        }
        if ((pole[0][0]==pole[1][1]&&pole[1][1]==pole[2][2])||
        (pole[0][2]==pole[1][1]&&pole[1][1]==pole[2][0])){
            if(pole[1][1]==SYMBOL_X)
                return WINNER_X;
            if(pole[1][1]==SYMBOL_0)
                return  WINNER_0;
        }
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if (pole[i][j]==EMPTY)
                    return GO_ON;
        return DRAW;
    }



    public static void main(String[] args) throws InterruptedException {
       int result;
        char symbol=SYMBOL_X;
        do {
            display();
            if(symbol==SYMBOL_X)
            makeTurn(symbol);
            else
                makeTurnRandom(symbol);
            result= check();
            symbol=nextSymbol(symbol);
        }while(result==GO_ON);
        display();
switch (result){
    case DRAW:
        System.out.println("Ничья");
        break;
    case WINNER_X:
        System.out.println("Победил "+ SYMBOL_X);
        break;
    case  WINNER_0:
        System.out.println("Победил " +SYMBOL_0);
        break;
}
    }

    public static char nextSymbol(char c) {
        if(c==SYMBOL_X)
            return SYMBOL_0;
        return SYMBOL_X;

    }
    public static void main23324(String[] args) {
        int [][]a= new int[4][10];
        int n=0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length;j++)

                System.out.print(a[i][j]+"\t ");
            System.out.println();
        }
    }

    public static void mainw434(String[] args) {
        int [][]a= new int[4][10];
        a[0][0]=10;
        a[3][9]=100;
        for(int i=0; i<a.length; i++) {
            for (int j = 0; j < a[0].length; j++)
                System.out.print(a[i][j] + "\t ");
            System.out.println();


        }}

    public static void main43(String[] args) {
        Random random = new Random();
        Scanner scanner= new Scanner(System.in);
        int N= scanner.nextInt();
        int K=scanner.nextInt();
        int L=scanner.nextInt();
        if(K>L||L>N){
            System.out.println("Ошибка!");
            return;
        }
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int s=0;
        for(int i=K; i<=L; i++){
         s=s+array[i];
        }
        System.out.println("сумма= "+s);
    }



    public static void main34(String[] args) {
        int[]f= new int[20];
        f[0]=0;
        f[1]=1;
        for(int i=2; i<20;i++)
            f[i]=f[i-1]+f[i-2];


        for (int i=0;i<20; i++)
            System.out.println(f[i]+"  ");
        System.out.println();
    }


    public static int fib(int i){
        if(i==0)
            return 0;
        if(i==1)
            return 1;
        int p=fib(i-1);
        int pp=fib(i-2);
        return p+pp;
    }
    public static void main234(String[] args) {

        System.out.println(fib(10));

    }



    public static int ss(int i){
        if(i==0)
            return 0;
        int sum=ss(i/10);
        System.out.println(sum);
        return sum+i%10;


    }

    public static int sum(int n, int max) {
        if (n >max)
            return 0;
        int s=sum(n+1, max);
        System.out.println("я "+n+" мне сказали "+s+" я отвечу "+(s+n));
        return s+n;



    }

    public static void r2(int n) {
        if (n >10)
            return ;//выйти из функции
        r2(n + 1);
        System.out.print( "  "+ n);}


    public static void r1(int n) {
        if (n >10)
            return ;//выйти из функции
        System.out.print("  " + n);
        r1(n + 1);

    }



    public static int fr(int p){
        if (p==0)
            return 1;
        int result= p*fr(p-1);
        System.out.println(" факториал числа=  " +result);
        return result;


    }









    public static int count(int n) {
        int d=1;
        int count = 0;
        while(d<n){
            d=d*10;
        count++;
    }
        System.out.println(count);
    return count;
    }

    public static void sum2(int n) {
       int d=1;
        while(d<n)
            d=d*10;
        d=d/10;


        while ((d>0)){
            System.out.println(n/d);
            n=n%d;
            d=d/10;
        }


    }

    public static int sum45(int n){
        int s=0;
        while(n>0){
            System.out.println(n%10);
            s=s+n%10;
            n=n/10;

        }
        return s;
    }

    public static void main343(String[] args) {
   count(100000009);


    }

    public static void A(int x, int y) {

        for(int i=0; i<x;i++){
            for(int j=0;j<y;j++)
                System.out.print("*");
            System.out.println();
        }

    }

    public static void B() {
        System.out.println("Привет");

    }

    public static void C(){
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        System.out.println((x>y?x:y));

    }
    public static void main3442(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int choose;
        do{
        System.out.println("1)- прямоугольник");
        System.out.println("2)- /Привет/");
        System.out.println("3)- максимальное из двух");
        System.out.println("4)  - Выход");
        choose = scanner.nextInt();
        switch (choose){
            case 1:
            int a = scanner.nextInt();
            int b=scanner.nextInt();
            A(a,b);
            break;
            case 2:
                B();
                break;
            case 3:
                C();
                break;
            case 4: break;
            default:
                System.out.println("смотри меню!!!");
        }
    }
        while(choose!=4);
    }






    public static void main42343(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int userValue= scanner.nextInt();
        switch (userValue){
            case 1:
                System.out.println("1111");
                break;
            case 2:
                System.out.println("22222");
            case 3:
                System.out.println("33333");
                break;
            case 4:
                System.out.println("4444444");
                default:
                    System.out.println("?????");
        }
    }




    public static void printArray(int[]array) {
        for (int i=0; i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();

    }
public static int[] createAndFillRandom(int size){
    int[] array= new int[size];
    for(int i=0; i<size; i++)
        array[i]= (int) (Math.random()*10);
    return array;
}

    public static void main4444(String[] args) {
        int[]a = createAndFillRandom(5);
        printArray(a);
        int[]d = createAndFillRandom(15);
        printArray(d);
    }
    public static void main87(String[] args) {
        int[] a={1,2,3,4,5};
        int [] b = {4,34,2,2,4,35,324,354};
        int [] c= {54,3,45,67,34,453,234,2,45};
        printArray(a);
        printArray(b);
        printArray(c);


    }
    public static int sum2(int a, int b){
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println(" В");
        return a+b;
    }
    public static int stepen(int a, int b){
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("степень=" +Math.pow(a,b));
        return (int) Math.pow(a,b);

    }

    public static int plo(int r){
        System.out.println("площадь" +Math.PI*Math.pow(r,2));
        return (int) (Math.PI*Math.pow(r,2));
    }
    public static int max(int a, int b, int c, int d){
        int max;
        if (a>b){
            max=a;
        }
        else
            max=b;
        if (c>max)
            max=c;
        if (d>max)
            max=d;
        System.out.println("макс = " + max);
        return max;
    }
public static void pr(){
    for(int i=0; i<3; i++){
        for (int j=0;j<20;j++)
            System.out.print("*");
        System.out.println();
    }
}
    public static void main333(String[] args) {
        stepen(2,3);
        plo(5);
        max(2,9,5,6);
    }
    public static void priam(int a, int b){

            System.out.print(a*b);
        System.out.println();
    }


    public static void max3chicel(int a, int b, int c) {
        int max=0;
        if (a>b){
        max=a;}
            else
                max=b;
        if(c>max)
            max=c;
        System.out.println(max);
        }

    public static void summ2(int a, int b) {
        int summ=0;
        for(int i=a; i<=b; i++) {
            summ=summ +i;
        }
        System.out.println(summ);
    }

    public static void tabl(int x) {
        int y;
        for(int i=1; i<=10; i++){
            y=i*x;
            System.out.print(i+"*"+x+"="+y);
            System.out.println();

    }}





    public static void main3454(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(25);
            System.out.print(array[i] + " ");
        }
        System.out.println();
int max=0;

        for(int i = 0; i<size; i++){
            if(array[max]<array[i])
                array[max] = array[i];

        }

        System.out.printf("max  :  " + max);

    }










    public static void main565(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(25);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int count;
         count=0;
            int fromIndex = 0;
            for (int i = 0; i < size - 3; i++) {
                if (array[i] == array[i + 1] && array[i + 1] == array[i + 2]) {
                    count = 3;
                    while( (i+count) <size&&array[i] == array[i + count])
                        count++;

                    for (int j = 0; j < count; j++)
                        array[i + j] += 1;
                    i = i + count - 1;
                }}
            for ( int i = 0; i < size; i++) {
                System.out.print(array[i] + "  ");
            }
                System.out.println();
        }}