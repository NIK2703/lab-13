package com.company;

import java.util.Scanner;

public class TestLambda {
    public static void test(){
        LambdaNoArgument pi = () -> 3.14159265358979323846;
        System.out.println("Лямбда-функция без аргументов: pi = " + pi.getValue());

        LambdaIntToInt cube = (int n) -> n*n*n;
        System.out.println("Лямбда-функция с одним аргументом: 7^3 =" + cube.getValue(7));

        LambdaIntToInt fact = (int n) ->{
            int mult = 1;
            for(int i=2; i<=n; i++)
                mult *= i;
            return mult;
        };

        LambdaIntToBool isSimple = (int n) -> {
            boolean b = true;
            for(int i=2; i<n; i++){
                if(n%i == 0) {
                    b = false;
                    break;
                }
            }
            return b;
        };


        System.out.println("Введите число:" );
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        boolean perf = isSimple.getValue(num);
        System.out.println("Блочная лямбда-функция: число " + num + " " + (perf ? "является" : "не является") + " простым числом." );


        System.out.println("Введите 2 числа:" );
        int a = scr.nextInt();
        int b = scr.nextInt();
        
        LambdaIntIntToDouble comb = (int n, int m) -> (fact.getValue(n) / (fact.getValue(m) * fact.getValue(n-m)));
        System.out.println("Лямбда-функция для двух аргументов: число сочетаний из " + a + " по " + b+ " равно " +comb.getValue(a,b));

    }
}
