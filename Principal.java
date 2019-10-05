/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author samuel rodrigues
 */
public class Principal {

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("\n## Escolha uma das opções abaixo: ##");
        System.out.println("Opção 1 - Incluir");
        System.out.println("Opção 2 - Alterar");
        System.out.println("Opção 3 - Excluir");
        System.out.println("Opção 4 - Imprimir Todos");
        System.out.println("Opção 5 - Sair");
        System.out.println("_______________________");
        System.out.print("Digite aqui sua opção: ");
        opc = sc.nextInt();
        return opc;
    }

    public static void opcao(int opc) throws IOException {
        ClienteIO c = new ClienteIO();
        Scanner sc = new Scanner(System.in);
        switch (opc) {
            case 1:
                System.out.println("Digite a quantidade de pessoas");
                int quant = sc.nextInt();//pegar inteiros
                ArrayList<Cliente> array = new ArrayList();
                for (int count = 0; count < quant; count++) {
                    System.out.println("Digite o Código:");
                    int code = sc.nextInt();
                    System.out.println("Escreva o Nome:");
                    String name = sc.next();
                    System.out.println("Digite a Data de Nascimento:");
                    String datanasc = sc.next();
                    System.out.println("Escreva o Endereço:");
                    String end = sc.next();
                    System.out.println("Digite o Telefone:");
                    String tel = sc.next();
                    Cliente ci = new Cliente();
                    ci.setCodigo(code);
                    ci.setNome(name);
                    ci.setDataNasc(datanasc);
                    ci.setEndereco(end);
                    ci.setTelefone(tel);
                    array.add(ci);
                }
                c.Gravar(array);
                break;
            case 2:
                System.out.println("\n---------Alterar Cliente(Y/N)----------\n");
                System.out.print("opção:");
                String res = sc.nextLine();
                if (res.equals("Y")) {
                    System.out.println("\nEscreva o nome:\n");
                    String nom = sc.nextLine();
                    alterar(nom);
                }
                break;
            case 3:
                System.out.println("\n---------Excluir Cliente(Y/N)----------\n");
                System.out.print("opção:");
                String re = sc.nextLine();
                if (re.equals("Y")) {
                    System.out.println("Escreva o nome a ser excluido:");
                    String nomere = sc.nextLine();
                    remove_Pessoa(nomere);
                }
                break;
            case 4:
                ArrayList<Cliente> array2 = c.Ler();//outro array
                for (int count = 0; count < array2.size(); count++) {
                    array2.get(count).Imprimir_Todos();
                }
                break;
            case 5:
                sc.close();
                break;
            default:
                System.out.println("\nOpcão Invalida:\n" + opc);
        }

    }

    public static void alterar(String nome) throws IOException {
        ClienteIO cc = new ClienteIO();
        ArrayList<Cliente> arra = cc.Ler();
        int result = buscar_Pessoa(nome);
        Scanner sc = new Scanner(System.in);
        if (result != -1) {//se meu resultado for diferente de invalido
            // arra.remove(arra.get(result));//remove dentro do arrayList
            arra.remove(arra.get(result));
            System.out.println("\n[+]--------Preencha os Campos Abaixo----------\n");
            System.out.println("Informe o Código:");
            int codi = sc.nextInt();
            System.out.println("Escreva o Nome:");
            String name = sc.next();
            System.out.println("Digite a Data de Nascimento:");
            String datanasc = sc.next();
            System.out.println("Escreva o Endereço:");
            String end = sc.next();
            System.out.println("Digite o Telefone:");
            String tel = sc.next();
            Cliente ci = new Cliente();
            ci.setCodigo(codi);
            ci.setNome(name);
            ci.setDataNasc(datanasc);
            ci.setEndereco(end);
            ci.setTelefone(tel);
            arra.add(ci);
        }
        cc.Gravar(arra);
    }

    public static void remove_Pessoa(String nome) throws IOException {
        ClienteIO ca = new ClienteIO();
        ArrayList<Cliente> arra = ca.Ler();
        int result = buscar_Pessoa(nome);
        if (result != -1) {//se meu resultado for diferente de invalido
            arra.remove(arra.get(result));//remove dentro do arrayList
            System.out.println("Cliente Removido!");
        }
        ca.Gravar(arra);
    }

    public static int buscar_Pessoa(String nome) throws IOException {
        ClienteIO co = new ClienteIO();
        ArrayList<Cliente> arra = co.Ler();
        for (int count = 0; count < arra.size(); count++) {
            if (arra.get(count).getNome().equals(nome)) {//pessoas.get(count), passando por todo array pega o nome e faz equals ==
                return count;
            }
        }
        return -1;//zero passa como posicao valida entao colocar -1 como invalida
    }

    public static void main(String[] args) throws IOException {
        int op;
        do {
            op = menu();
            opcao(op);
        } while (op != 5);//loop
    }
}
