/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author PC Casa
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("BEM VINDO A CALCULADORA!");
        int num1, num2, resultado;
        String CharOpc;
        boolean encerrar = false;
        do {
            System.out.print("Digite o primeiro valor:");
            num1 = teclado.nextInt();
            System.out.print("Digite o segundo valor:");
            num2 = teclado.nextInt();
            System.out.println("Digite soma, para somar, subtracao para subtrair, divisao para dividir, multiplicacao, para multiplicar e mod para tirar o resto: ");
            String caso = teclado.next();
            resultado = 0;
            switch (caso) {
                case "soma":
                    resultado = num1 + num2;
                    System.out.println("A soma é: " + resultado);
                    break;

                case "subtracao":
                    resultado = num1 - num2;
                    System.out.println("A subtracao é " + resultado);
                    break;

                case "divisao":
                    resultado = num1 / num2;
                    System.out.println("A divisao é " + resultado);
                    break;

                case "multiplicacao":
                    resultado = num1 * num2;
                    System.out.println("A multiplicação é " + resultado);
                    break;

                case "mod":
                    resultado = num1 % num2;
                    System.out.println("O resto é " + resultado);
                    break;

                default:
                    System.out.println("Digite algo válido");

            }
            System.out.print("Deseja continuar[S/N]:");
            CharOpc = teclado.next();
            if (CharOpc.equals("N") || CharOpc.equals("n")){
                encerrar = true;
            }
        } while (encerrar == false);
        

    
    
    
    }

}
