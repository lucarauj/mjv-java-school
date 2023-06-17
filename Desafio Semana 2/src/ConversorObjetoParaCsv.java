public class ConversorObjetoParaCsv {

    public StringBuilder converterObjetoEmString(Cadastro cadastro) {
        StringBuilder stringBuilder = new StringBuilder(
                cadastro.getNome() + ", "
                        + cadastro.getCpf() + ", "
                        + cadastro.getDataNascimento() + ", "
                        + cadastro.getSexo() + ", "
                        + cadastro.getEndereco().getLogradouro() + ", "
                        + cadastro.getEndereco().getNumero() + ", "
                        + cadastro.getEndereco().getBairro() + ", "
                        + cadastro.getEndereco().getComplemento() + ", "
                        + cadastro.getEndereco().getCidade() + ", "
                        + cadastro.getEndereco().getEstado() + ", "
                        + cadastro.getContato().getEmail() + ", "
                        + cadastro.getContato().getTelefone() + ", "
                        + cadastro.getContato().getCelular() + ", "
                        + (cadastro.getContato().getCelularWhats() ? "Sim" : "Não") + ", "
                        + cadastro.getEmprego().getProfissao() + ", "
                        + cadastro.getEmprego().getEmpresa() + ", "
                        + (String.format("%.2f", cadastro.getEmprego().getSalario()).replace(",", ".")) + ", "
                        + (cadastro.getEmprego().getEmpregoAtual() ? "Sim" : "Não") + ", "
                        + (String.format("%.2f", cadastro.getPretensaoMinima()).replace(",", ".")) + ", "
                        + (String.format("%.2f", cadastro.getPretensaoMaxima()).replace(",", ".")) + ", "
                        + cadastro.getHabilidades().replace(",", ".")
        );
        return stringBuilder;
    }
}
