/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 *
 * @author samuel rodrigues
 */
public class Cliente {

    private int Codigo;
    private String Nome;
    private String DataNasc;
    private String Endereco;
    private String Telefone;

    public Cliente() {
        this.Codigo = 0;
        this.Nome = "";
        this.DataNasc = "";
        this.Endereco = "";
        this.Telefone = "";
    }

    public Cliente(int Codigo, String Nome, String DataNasc, String Endereco, String Telefone) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.DataNasc = DataNasc;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(String DataNasc) {
        this.DataNasc = DataNasc;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public void Imprimir_Todos() {
        System.out.println("");
        System.out.println("");
        System.out.println("Código: " + this.Codigo);
        System.out.println("Nome: " + this.Nome);
        System.out.println("Data de Nascimento: " + this.DataNasc);
        System.out.println("Endereço: " + this.Endereco);
        System.out.println("Telefone: " + this.Telefone);
    }

}
