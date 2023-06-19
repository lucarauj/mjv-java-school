package modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class LeitorCsv {

    public List<Cadastro> lerCsv(String caminhoDoArquivo) {
        try {
            Path arquivoOrigem = Paths.get(caminhoDoArquivo.toString());
            List<String> linhas = Files.readAllLines(arquivoOrigem);

            List<Cadastro> dados = new ArrayList<>();

            for (int i = 1; i < linhas.size(); i++) {
                String linha = linhas.get(i);
                String[] atributos = linha.split(",");

                Cadastro cadastro = new Cadastro();

                cadastro.setNome(atributos[0]);
                cadastro.setCpf(atributos[1]);
                cadastro.setDataNascimento(cadastro.formatarData(atributos[2]));
                cadastro.setSexo(SexoEnum.valueOf(atributos[3]));
                cadastro.getEndereco().setLogradouro(atributos[4]);
                cadastro.getEndereco().setNumero(atributos[5]);
                cadastro.getEndereco().setBairro(atributos[6]);
                cadastro.getEndereco().setCidade(atributos[7]);
                cadastro.getEndereco().setEstado(atributos[8]);
                cadastro.getEndereco().setComplemento(atributos[9]);
                cadastro.getContato().setEmail(atributos[10]);
                cadastro.getContato().setTelefone(Long.parseLong(atributos[11]));
                cadastro.getContato().setCelular(Long.parseLong(atributos[12]));
                cadastro.getContato().setCelularWhats((Boolean.valueOf(atributos[13]) ? true : false));
                cadastro.getEmprego().setProfissao(atributos[14]);
                cadastro.getEmprego().setEmpresa(atributos[15]);
                cadastro.getEmprego().setSalario(Double.valueOf(atributos[16]));
                cadastro.getEmprego().setEmpregoAtual((Boolean.valueOf(atributos[17]) ? true : false));
                cadastro.setPretensaoMinima(Double.valueOf(atributos[18]));
                cadastro.setPretensaoMaxima(Double.valueOf(atributos[19]));
                cadastro.setHabilidades(atributos[20]);

                dados.add(cadastro);
            }

            return dados;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}