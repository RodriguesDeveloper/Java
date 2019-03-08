package Conect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexao { 
//atributos utilizados para a conexão com o banco de dados
private Connection con;
private Statement statement;
//variavel do tipo string que armazena o nome  do driver a ser carregado( driver para o mysql)
private String servidor = "com.mysql.jdbc.Driver";
//variavel que armazena o nome da fonte de dados
private String urlBanco = "jdbc:mysql://localhost:3306/controle_estoque";
//variavel que armazena o nome do usuario
private String usuarioBanco= "root";
//variavel que armazena a senha do usuario
private String senhaBanco= "";
//no banco de dados
//metodo conecta, este metodo e o metodo responsavel por estabelecer uma conexão
//com o banco de dados atraves do nome do usuario, senha e driver
public void conecta(){
    try{
    Class.forName(servidor);
    con= DriverManager.getConnection(urlBanco, usuarioBanco, senhaBanco);        
    }catch(ClassNotFoundException Driver){
    JOptionPane.showMessageDialog(null, "Driver não encontrado" + Driver.getMessage());
        }
        catch (SQLException Fonte){
            
        }
}
//metodo executeSQL;metodo responsavel por executar instruções sql de todo o projeto
public void executeSQL(String sql){
//chamada do metodo conecta para abrir a conexão com o bd
        conecta();
        try{
        statement = con.createStatement();
        statement.execute(sql);
        desconecta();
        }catch(SQLException sqle){
             JOptionPane.showMessageDialog(null, "Driver não encontrado" + sqle.getMessage());
        }
}
//metodo retornaresultset; metodo responsavel por obter os valores do banco de dados
//recebe um parametro do tipo sql e retorna um objeto do tipo resultset(carregado com os valores)
public ResultSet RetornarResultset(String sql){
         ResultSet resultSet = null;
         conecta();
         try{
         statement =con.createStatement();
         resultSet = statement.executeQuery(sql);
         resultSet.next();
         }catch (Exception e){
         JOptionPane.showMessageDialog(null, e.getMessage());
         }
         return resultSet;
}
//metodo desconecta; metodo responsavel por fecha a conexão com o banco de dados
//ou seja invalidar o objeto conexão
  public void desconecta (){
        boolean result = true;
        try
        {
            con.close();
            //JOptionPane.showMessageDialog(null,"Banco fechado");
        }
        catch(SQLException fecha)
        {
            JOptionPane.showMessageDialog(null,"Não foi possivel fechar o banco de dados"+ fecha);
            result = false;
        }
    }
}

