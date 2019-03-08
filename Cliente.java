package Model;
import Conect.Conexao;
/**
 * @author samuel
 */
public class Cliente {
    private int codigo;
    private int cpf;
    private String nome;
    private String endereco;
    private int telefone;
    private String email;
    private int datanasc;
    
    String sql;
    Conexao con = new Conexao();
    
   public Cliente(){
      this(0,0,"","",0,"",0,"");
   }
   
    public Cliente(int codigo, int cpf, String nome, String endereco, int telefone, String email, int datanasc, String sql) {
        this.codigo = codigo;
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.datanasc = datanasc;
        this.sql = sql;
    }
    
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
    
    public void setCodigo(int codigo){
         this.codigo=codigo;
    }
    public int getCodigo(){
        return codigo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) { // validar via set (test)
        this.cpf=cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(int datanasc) {
        this.datanasc = datanasc;
    }
    
    public void cadastrarCliente(){ /*metodo cadastrarCliente*/
    sql = " insert into clientes(cpf,nome,endereco,telefone,email,datanasc) values('"+cpf+"','"+nome+"','"+endereco+"','"+telefone+"','"+email+"','"+datanasc+"')";
    con.executeSQL(sql);
    }   
}
