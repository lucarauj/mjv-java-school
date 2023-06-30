import modelo.Cadastro;
import modelo.SexoEnum;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        cadastroListagem();
    }

    static void cadastroListagem() {
        List<Cadastro> alunos = new ArrayList<>();
        alunos.add(aluno01());
        alunos.add(aluno02());

        String conteudo = GeradorConteudo.gerarCsv(alunos);

        GeradorArquivo.escrever("C:\\Users\\luc_c\\Desktop\\Diversos\\Programação\\MJV\\Java\\mjv-java-school\\mjv-java-school\\Aula - Trabalhando com arquivos\\manipulacao-arquivos\\output\\alunos.csv", conteudo);
    }

    static Cadastro aluno01() {
        Cadastro cadastro = new Cadastro();

        cadastro.setNome("Luis da Silva");
        cadastro.setCpf("00034344478");
        cadastro.setMatricula("45687");
        cadastro.setDataNascimento(LocalDate.of(2003, 6, 2));
        cadastro.setSexo(SexoEnum.MASCULINO);
        cadastro.getEndereco().setLogradouro("Avenida Pio X");
        cadastro.getEndereco().setNumero("145");
        cadastro.getEndereco().setBairro("Torres");
        cadastro.getEndereco().setComplemento("Casa");
        cadastro.getEndereco().setCidade("João Pessoa");
        cadastro.getEndereco().setEstado("PB");
        cadastro.getContato().setEmail("luis@gmail.com");
        cadastro.getContato().setTelefone(3533224545L);
        cadastro.getContato().setCelular(3599923456L);
        cadastro.getContato().setCelularWhats(true);
        return cadastro;
    }

    static Cadastro aluno02() {
        Cadastro cadastro = new Cadastro();

        cadastro.setNome("Maria Sophia");
        cadastro.setCpf("32534344234");
        cadastro.setMatricula("22680");
        cadastro.setDataNascimento(LocalDate.of(2002, 1, 23));
        cadastro.setSexo(SexoEnum.FEMININO);
        cadastro.getEndereco().setLogradouro("Rua das Flores");
        cadastro.getEndereco().setNumero("1044");
        cadastro.getEndereco().setBairro("Mangabeira");
        cadastro.getEndereco().setComplemento("Apto 101");
        cadastro.getEndereco().setCidade("João Pessoa");
        cadastro.getEndereco().setEstado("PB");
        cadastro.getContato().setEmail("mariasophii@gmail.com");
        cadastro.getContato().setTelefone(3533222260L);
        cadastro.getContato().setCelular(3599874231L);
        cadastro.getContato().setCelularWhats(true);
        return cadastro;
    }
}
