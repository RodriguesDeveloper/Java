/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 *04/03/2019 14:13
 * @author samuel
 */
public class ControleRemoto {
 
    private int canais;
    private int volumeSom;

    public ControleRemoto(){
        this.canais=0;
        this.volumeSom=0;
    }
    
    public ControleRemoto(int canais, int volumeSom) {
        this.canais = canais;
        this.volumeSom = volumeSom;
    }

    public int getCanais() {
        return canais;
    }

    public void setCanais(int canais) {
        this.canais = canais;
    }

    public int getVolumeSom() {
        return volumeSom;
    }

    public void setVolumeSom(int volumeSom) {
        this.volumeSom = volumeSom;
    }
    
    int potenciaVolume(int opc){
        if(opc==1)
            volumeSom++;
      else
            volumeSom--;
        return 0;
    }
    int numeroCanal(int opc){
          if(opc==3)
            canais++;
        else
            canais--;
        return 0;
    }
    int trocarCanal(int opc){
         canais = opc;
      return 0;
    }
    int consultarVolume(){
       System.out.println("Volume: "+ volumeSom+"!\n"
               + "Canal: "+ canais);
    return 0;    
    }
}
