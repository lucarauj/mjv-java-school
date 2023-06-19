import java.util.List;

public class LerArquivo {
    public static void main(String[] args) {

        LeitorCsv leitorCsv = new LeitorCsv();
        List<Cadastro> cadastroList = leitorCsv.lerCsv("C:\\Users\\luc_c\\Desktop\\Diversos\\Programação\\MJV\\Java\\mjv-java-school\\mjv-java-school\\Desafio Semana 2\\cadastro.csv");
        for (Cadastro cadastro : cadastroList) {
            System.out.println(cadastro);
        }
    }
}
