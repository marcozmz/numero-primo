package com.mycompany.exercicio11;

/**
 *
 * @author marco
 */
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        int numero;
        
        System.out.printf("Digite um numero: ");
        numero = console.nextInt();
        
        if(numero <= 1){
            System.out.printf("Digite um numero maior que 1");
        }else{
        
            boolean primo = true;

            for(int i = 2; i <= Math.sqrt(numero); i++){
                if (numero % i == 0){
                    primo = false;
                    break;
                }
            }

            if(primo){
                System.out.printf("O numero %d e primo", numero);
            }else{
                System.out.printf("O numero %d nao e primo", numero);
            }
        }
    }
}
