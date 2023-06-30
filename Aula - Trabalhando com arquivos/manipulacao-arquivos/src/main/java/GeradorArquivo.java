import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GeradorArquivo {

    public static void escrever(String endereco, String conteudo, boolean incrementar) {
        Path path = Paths.get(endereco);
        try {
            Files.createDirectories(path.getParent());

            if(incrementar) {
                if(!Files.exists(path)) {
                    Files.createFile(path);
                }
                conteudo = conteudo.concat((System.lineSeparator()));
            }

            Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8), incrementar ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void escrever(String endereco, String conteudo) {
        escrever(endereco, conteudo, false);
    }
}
