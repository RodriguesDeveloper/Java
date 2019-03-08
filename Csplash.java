package Model;
import Forms.Splash;
import Forms.FormCliente;
/** @author samuel*/
public class Csplash {
    public static void main(String args[]){
        Splash splash = new Splash();
        splash.setLocationRelativeTo(null);
        splash.setVisible(true);
        FormCliente formc = new FormCliente();
        try{
            for (int i=0;i<=100;i++){
                Thread.sleep(40);
                splash.loading.setText(Integer.toString(i)+"%");//carregamento
                splash.loadingbar.setValue(i);
                if(i==100){
                 splash.setVisible(false);
                 formc.setVisible(true);
                }
             }
        }catch(Exception e){
        }
    }
}
