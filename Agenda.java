import java.util.Scanner;

public class Agenda  {
   public static void main(String args[]){
    Pessoa p = new Pessoa();
    Scanner sc = new Scanner(System.in);
    int opc;
    do {
          System.out.println("\n## Escolha uma das opções abaixo: ##");
          System.out.println("Opção 1 - Cadastrar Pessoas");
          System.out.println("Opção 2 - Imprimir Pessoas Cadastradas");
          System.out.println("Opção 3 - Remover Pessoas");
          System.out.println("Opção 4 - Buscar Pessoas");
          System.out.println("Opção 5 - Imprimir Primeira Pessoa");
          System.out.println("Opção 0 - Sair do programa");
          System.out.println("_______________________");
           
          System.out.print("Digite aqui sua opção: ");
          opc = Integer.parseInt(sc.nextLine());
          
           switch(opc){
               case 1:
                    p.armazenaPessoa();
                   break;
               case 2:
                    p.imprimeAgenda();
                   break;
               case 3 :
                   p.removepessoa();
                    break;
               case 4:
                   p.buscapessoa();
                   break;
               case 5:
                   p.imprimePessoa();
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

