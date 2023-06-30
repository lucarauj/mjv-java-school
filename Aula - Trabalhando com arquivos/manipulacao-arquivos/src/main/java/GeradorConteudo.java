import modelo.Cadastro;
import modelo.SexoEnum;

import java.time.LocalDate;
import java.util.List;

public class GeradorConteudo {

    private static final String DELIMITADOR = ";";

    public static String gerarCsv(Cadastro aluno) {

        StringBuilder conteudo = new StringBuilder();

        conteudo.append(aluno.getNome()).append(DELIMITADOR);
        conteudo.append(aluno.getCpf()).append(DELIMITADOR);
        conteudo.append(aluno.getMatricula()).append(DELIMITADOR);
        conteudo.append(aluno.getDataNascimento()).append(DELIMITADOR);
        conteudo.append(aluno.getSexo()).append(DELIMITADOR);

        conteudo.append(aluno.getEndereco().getLogradouro()).append(DELIMITADOR);
        conteudo.append(aluno.getEndereco().getNumero()).append(DELIMITADOR);
        conteudo.append(aluno.getEndereco().getBairro()).append(DELIMITADOR);
        conteudo.append(aluno.getEndereco().getComplemento()).append(DELIMITADOR);
        conteudo.append(aluno.getEndereco().getCidade()).append(DELIMITADOR);
        conteudo.append(aluno.getEndereco().getEstado()).append(DELIMITADOR);

        conteudo.append(aluno.getContato().getEmail()).append(DELIMITADOR);
        conteudo.append(aluno.getContato().getTelefone()).append(DELIMITADOR);
        conteudo.append(aluno.getContato().getCelular()).append(DELIMITADOR);
        conteudo.append(aluno.getContato().getCelularWhats()).append(DELIMITADOR);

        return conteudo.toString();
    }

    public static String gerarCsv(List<Cadastro> alunos) {
        StringBuilder conteudo = new StringBuilder();
        for(Cadastro aluno : alunos) {
            conteudo.append(gerarCsv(aluno));
            conteudo.append(System.lineSeparator());
        }

        return conteudo.toString().substring(0, conteudo.toString().length()-1);
    }
}
