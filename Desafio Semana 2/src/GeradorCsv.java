import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class GeradorCsv {

    public void gerarCsv(List<StringBuilder> cadastroList) {
        try {
            File cadastro = new File("C:\\Users\\luc_c\\Desktop\\Diversos\\Programação\\MJV\\Java\\mjv-java-school\\mjv-java-school\\Desafio Semana 2","cadastro.csv");
            FileOutputStream output = new FileOutputStream(cadastro);

            StringBuilder cabecalho = new StringBuilder();
            cabecalho.append("NOME,CPF,DATA DE NASCIMENTO,SEXO,LOGRADOURO,NUMERO,BAIRRO,COMPLEMENTO,CIDADE,ESTADO,EMAIL,TELEFONE,CELULAR,WHATSAPP,PROFISSAO,EMPRESA,SALARIO,EMPREGO ATUAL,PRETENSAO SALARIAL (MIN),PRETENSAO SALARIAL (MAX),HABILIDADES");

            output.write(cabecalho.toString().getBytes());
            output.write("\n".getBytes());

            for (int i = 0; i < cadastroList.size(); i++) {
                output.write(cadastroList.get(i).toString().getBytes());

                if (i < cadastroList.size() - 1) {
                    output.write("\n".getBytes());
                }
            }
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
