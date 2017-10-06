/**
 *
 * @author wanderson Dantas
 *  Data 21/04/16
 * Calculadora  financeira
 *  Exemplo 
 */
package modolofinanceiro;

import java.util.Scanner;

    public class ModuloFinanceiro {
      public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
            System.out.println("Entre com a opção que deseja :");
              int op; // a variavel op vai receber os dados do usuario.
             float num1 = 0, num2 = 0,total = 0;
                
             do {
                 
            // O usuario entrará com o valor que deseja
            System.out.println("Aperte [1] para Somar");
                    
            System.out.println("Aperte [2] para Multiplicar");
                  
            System.out.println("Aperte [3] para Dividir ");
                
            System.out.println("Aperte [4] para Subtrair ");
                    
            System.out.println("Aperte [5] para Voltar para o menu");
                
            System.out.println("Aperte [0] para sair do programa !");
            op = input.nextInt();
                 
            if (op == 1){
              // será realizado a soma !
            System.out.println("Entre com o primeiro numero");
                num1 = input.nextFloat();// receberá o primeiro valor 
            System.out.println("Entre com o segundo numero ");
                num2 = input.nextFloat();// receberá o segundo valor 
            total  = num1 + num2; // o ressultado será armazenado na variavel total
                        System.out.println(total);
                 }
                 else if (op == 2){
                     // será realizado a Multiplicação !
                 System.out.println("Entre com o primeiro numero");
                    num1 = input.nextFloat();// receberá o primeiro valor 
                 System.out.println("Entre com o segundo numero ");
                    num2 = input.nextFloat();// receberá o segundo valor 
                 total = num1 * num2; // o resultado será armazenado na variavel total
                        System.out.println(total);
                 }
                 else if (op == 3 ){
                     // será realizado a Divisao !
                 System.out.println("Entre com o primeiro numero");
                    num1 = input.nextFloat(); // receberá o primeiro valor 
                 System.out.println("Entre com o segundo numero ");
                    num2 = input.nextFloat(); // receberá o segundo valor
                 total = num1 / num2; // o resultado sera armazenado na variavel total
                        System.out.println(total);
                 }
                   
                 else if (op == 4){
                      //será realizado a Subtraçao !
                 System.out.println("Entre com o primeiro numero");
                     num1 = input.nextFloat(); // receberá o primeiro valor 
                 System.out.println("Entre com o segundo numero ");
                     num2 = input.nextFloat(); // receberá o segundo valor 
                 total = num1 - num2; // o resultado será armazenado na variavel
                         System.out.println(total);
                    
                 }else if (op == 0){
                     System.out.println("Voce apertou sair do programa !");
                     //  0 Sairá do programa !
                 
                 } // fim do método financeiro ! 
                 
                }while(op != 0);

                  } // fim do programa
    
        }
