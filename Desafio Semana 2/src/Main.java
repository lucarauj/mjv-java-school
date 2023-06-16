import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<StringBuilder> cadastroList = new ArrayList<>();
        GeradorCsv csv = new GeradorCsv();

        Cadastro c1 = new Cadastro();

        c1.setNome("Lucas");
        c1.setCpf("33344455566");
        c1.setDataNascimento(c1.formatarData("2023-06-06"));
        c1.setSexo(SexoEnum.MASCULINO);
        c1.getEndereco().setLogradouro("Rua 1");
        c1.getEndereco().setNumero("433");
        c1.getEndereco().setBairro("Centro");
        c1.getEndereco().setCidade("Belo Horizonte");
        c1.getEndereco().setEstado("Minas Gerais");
        c1.getEndereco().setComplemento("casa");
        c1.getContato().setEmail("lucas@gmail.com");
        c1.getContato().setTelefone(3331223467L);
        c1.getContato().setCelular(33999912323L);
        c1.getContato().setCelularWhats(true);
        c1.getEmprego().setProfissao("Operador");
        c1.getEmprego().setEmpresa("Minas Sol");
        c1.getEmprego().setSalario(5000.00);
        c1.getEmprego().setEmpregoAtual(true);
        c1.setPretensaoMinima(3000.00);
        c1.setPretensaoMaxima(6000.00);
        c1.setHabilidades("Operador de pá carregadeira / Motorista cat E / Motorista de cargas perigosas");

        ConversorObjetoParaCsv conversor1 = new ConversorObjetoParaCsv();
        StringBuilder stringBuilder1 = conversor1.converterObjetoEmString(c1);
        cadastroList.add(stringBuilder1);

        Cadastro c2 = new Cadastro();

        c2.setNome("Pedro");
        c2.setCpf("88344455566");
        c2.setDataNascimento(c2.formatarData("2023-05-05"));
        c2.setSexo(SexoEnum.MASCULINO);
        c2.getEndereco().setLogradouro("Rua Alenir");
        c2.getEndereco().setNumero("50");
        c2.getEndereco().setBairro("Nova Morada");
        c2.getEndereco().setCidade("Recife");
        c2.getEndereco().setEstado("Pernambuco");
        c2.getEndereco().setComplemento("Apto 101");
        c2.getContato().setEmail("pedro@gmail.com");
        c2.getContato().setTelefone(8831223467L);
        c2.getContato().setCelular(88999912323L);
        c2.getContato().setCelularWhats(true);
        c2.getEmprego().setProfissao("Telefonista");
        c2.getEmprego().setEmpresa("Telemix");
        c2.getEmprego().setSalario(2500.00);
        c2.getEmprego().setEmpregoAtual(false);
        c2.setPretensaoMinima(2000.00);
        c2.setPretensaoMaxima(3500.00);
        c2.setHabilidades("Recepcionista / Telefonista / Operador de caixa");

        ConversorObjetoParaCsv conversor2 = new ConversorObjetoParaCsv();
        StringBuilder stringBuilder2 = conversor2.converterObjetoEmString(c2);
        cadastroList.add(stringBuilder2);

        csv.gerarCsv(cadastroList);
    }
}