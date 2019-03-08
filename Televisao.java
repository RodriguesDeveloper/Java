/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class Televisao {

    public static void main(String Args[]){
        ControleRemoto rm =new ControleRemoto();
        Scanner sc = new Scanner(System.in);
    
    int opc;
    do{
        System.out.println("\nOpcao 1. Aumentar volume do som\n"
                         + "Opcao 2. Diminuir volume do som\n"
                         + "Opcao 3. Aumentar canal\n"
                         + "Opcao 4. Diminuir canal\n"
                         + "Opcao 5. Trocar canal para\n"
                         + "Opcao 6. Consultar\n"
                         + "Digite sua opcao:");
              opc = (Integer.parseInt(sc.nextLine()));
            
            switch(opc){
            case 1:
                rm.potenciaVolume(opc);
                break;
            case 2:
                rm.potenciaVolume(opc);
                break;
            case 3:
                rm.numeroCanal(opc);
                break;
            case 4:
                rm.numeroCanal(opc);
                break;
            case 5:
                System.out.println("Digite o canal:");
                int can = (Integer.parseInt(sc.nextLine()));
                rm.trocarCanal(can);
                break;
            case 6:
                rm.consultarVolume();
                break;
            case 0:
                sc.close();
            break;
            default:
               System.out.println("Invalido!");
        }
    }while(opc!=0);{
        sc.close();
    }         
    }
}