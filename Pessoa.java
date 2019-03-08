import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
    
    private String nome;
    private String idade;
    private String altura;
    ArrayList<String> pessoas = new ArrayList();

    public Pessoa(){
        this.nome="";
        this.idade = "";
        this.altura = "";
    }

    public Pessoa(String nome, String idade, String altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
    
   void armazenaPessoa(){
        Scanner sc = new Scanner(System.in);
        for(int count=0;count<2;count++){
            System.out.print("\nEscreva seu nome: ");
            this.nome = sc.nextLine();
            pessoas.add(nome);
            System.out.print("Digite sua idade: ");
            this.idade = sc.nextLine();
            pessoas.add(idade);
            System.out.print("Digite sua Altura: ");
            this.altura = sc.nextLine();
             pessoas.add(altura);
        }
    }
    void removepessoa(){
        Scanner sc = new Scanner(System.in);
            System.out.print("Dados a ser removido? \n");
            System.out.print("Escreva o nome: ");
                 this.nome=sc.nextLine();
            System.out.print("idade: ");
                this.idade=sc.nextLine();
            System.out.print("altura: ");
                this.altura=sc.nextLine();
            pessoas.remove(nome);
            pessoas.remove(idade);
            pessoas.remove(altura);  
    }
      
    int buscapessoa(){
        return 0;
    }
    
     void imprimeAgenda(){
        for (int i = 0; i < pessoas.size(); i++) {
	    System.out.println("[+] "+pessoas.get(i));
	}
    }
    void imprimePessoa(){
        nome= pessoas.get(0);
        idade= pessoas.get(1);
        altura= pessoas.get(2);
         System.out.println("nome:  "+nome);
         System.out.println("idade:  "+idade);
         System.out.println("altura:  "+altura);
    }
}
