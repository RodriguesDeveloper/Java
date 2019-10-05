package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ClienteIO {

    private String arquivo_Texto = "cliente.txt";// arquivo mesma pasta do proj netbeans

    public void Gravar(ArrayList<Cliente> dados) throws IOException {//tratamento de excessao
        //vai  gerar um arquivo um construtor chamndo outro();BufferedWriter uma memoria para gravar
        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo_Texto));//banco espaco de memoria, criado armazenar o arquivo
        for (int count = 0; count < dados.size(); count++) {//indo ate tamanho do array 
            String Linha = dados.get(count).getCodigo() + ";"
                    + dados.get(count).getNome() + ";"
                    + dados.get(count).getDataNasc() + ";"
                    + dados.get(count).getEndereco() + ";"
                    + dados.get(count).getTelefone() + "\n";
            bw.append(Linha);//append vai pegar e salvar essa linha no arquivo de texto
        }
        bw.close();//fechando o buffer
    }

    public ArrayList<Cliente> Ler() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(arquivo_Texto));
        String linha;
        ArrayList<Cliente> p = new ArrayList<>();
        while ((linha = br.readLine()) != null) {//fazendo loop ate fim 
            String[] linhaseparada = linha.split(";");//split separa, ja separa tudo como se fosse vetor
            Cliente cli = new Cliente();//instaciando o obj p1
            cli.setCodigo(Integer.parseInt(linhaseparada[0]));
            cli.setNome(linhaseparada[1]);//primeira posicao 0
            cli.setDataNasc(linhaseparada[2]);//posicao1, tem que converter para tipo.(Integer.parseInt)
            cli.setEndereco(linhaseparada[3]);
            cli.setTelefone(linhaseparada[4]);//ao1, tem que converter para tipo.(Integer.parseInt)
            p.add(cli);//adicionando a lista obj p1
        }
        br.close();
        return p;
    }
}
