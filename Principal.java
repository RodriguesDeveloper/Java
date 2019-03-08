/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Scanner;

/**
 * @author samuel rodrigues 03/03/2019
 */
public class Principal {
    
    public static void main(String args[]){
        Elevador ele = new Elevador();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n## Building Elevator Control System ##");
        System.out.print("\nQual a capacidade do elevador:");
        int var = Integer.parseInt(sc.nextLine());
        System.out.print("\nQual total de andares do predio:");
        int var1 =  Integer.parseInt(sc.nextLine());
        
    int opc;
    do {
          System.out.println("\n## Escolha uma das opções abaixo: ##");
          System.out.println("Opção 1 - Iniciar elevador");
          System.out.println("Opção 2 - Entrar ");
          System.out.println("Opção 3 - Subir andar");
          System.out.println("Opção 4 - Descer andar");
          System.out.println("Opção 5 - Sair pessoa");
          System.out.println("Opção 0 - Sair do programa");
          System.out.println("_______________________");
           
          System.out.print("Digite aqui sua opção: ");
          opc = Integer.parseInt(sc.nextLine());
          
           switch(opc){
               case 1:
                   ele.inicializa(var, var1);
                    System.out.print("\nElevador iniciado!");
                   break;
               case 2:
                    int entra = ele.entra();
                    System.out.print("\nrestou "+entra+" vagas!");
                   break;
               case 3 :
                   ele.sobe();
                    break;
               case 4:
                   ele.descer();
                   break;
               case 5:
                   break;
               case 0:
                   sc.close();
                   break;
               default:
                   System.out.print("\nOpcao "+ opc+" invalida!\n");
           }
     }while(opc!=0);{
       sc.close();
     }
       
        
    }
}
