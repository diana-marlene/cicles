package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*for(contador =0; contador < numero ; contador++){
            //codigo que se repite
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        int numero = sc.nextInt();
        /*int suma = 1;
        int anterior1 = 0;
        int anterior2 = 1;
        System.out.println(anterior1);
        for (int i= 0; i <numero; i++){
            //System.out.println(numero + "x" + i + " = "+ (numero*i));
            System.out.println(suma);
            suma =anterior1+anterior2;
            anterior1 = anterior2;
            anterior2 = suma;
        }

        for(int i = 1; i <=10;i++){
            //pasa a la siguiente iteracion al ejecutar
            continue;
        }*/
        //int numeroSecreto = 52;
        /*while(numero != numeroSecreto){
            System.out.println("Adivina el numero secreto: ");
            numero = sc.nextInt();
        }
        sc.close();
        System.out.println("Felicidades adivinaste el # secreto");*/
        /*do{
            System.out.println("Adivina el numero secreto: ");
            numero = sc.nextInt();
        }while (numero!=numeroSecreto);
        System.out.println("Felicidades adivinaste el # secreto");*/
        int x =0, factorial= 1;
        while(numero > x){
            x++;
            factorial = factorial *x;
        }
        System.out.println("El factorial de "+numero +" es: "+factorial);
    }
}
