/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools |Templates
 * and open the template in the editor.*/

package Modelo;

import java.util.Scanner;

/** @author samuel rodrigues*/

public class Elevador {
   
    private int terreo;//andarAtual
    private int totalAndares;
    private int capacidadeElevador;
    private int qtdPessoas;

    public Elevador(){
        this.terreo=0;
        this.totalAndares=0;
        this.capacidadeElevador=0;
        this.qtdPessoas=0;
    }
    
    public Elevador(int totalAndares, int capacidadeElevador, int qtdPessoas) {
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.qtdPessoas = qtdPessoas;
    }

    public int getTerreo() {
        return terreo;
    }

    public void setTerreo(int terreo) {
        this.terreo = terreo;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
    
    int inicializa(int capacidade, int totalandares){
        this.terreo=0;
        this.capacidadeElevador=capacidade;
        this.totalAndares=totalandares;
    return 0;
    }
    
    int entra(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantidade de pessoas a entrar:");
        int  qtd = (Integer.parseInt(sc.nextLine()));
      qtdPessoas = qtd;
        
        if(qtd>capacidadeElevador){
            capacidadeElevador=qtd - capacidadeElevador;
            System.out.print("\nTem que sair "+capacidadeElevador+"pessoas!\n");
        }else{
        if(qtd<capacidadeElevador){
           capacidadeElevador =capacidadeElevador - qtd;
           System.out.print("Pode entrar!");
           return capacidadeElevador;
        }else{
            System.out.print("Elevador esta cheio!");
        }
        }
     return 0;
    }
    
    int sobe(){
        if(terreo<totalAndares){
            terreo++;
            System.out.println("andar:"+terreo+"!");
        }else{
             System.out.println("último andar:"+terreo+"!");
        }
      return 0;
    }
    
    
     int descer(){
       do{
            terreo--;
              System.out.println("andar:"+terreo+"!");
            break;
          
        }while(terreo!=0);
       if(terreo==0){
             System.out.println("terreo:"+terreo+"!");
       }
      return 0;
    }
    
    int sairpessoa(){
        while(qtdPessoas!=0){
        qtdPessoas--;
        break;
        }
        return qtdPessoas;
    }
    
    
    
    
    
    
}
