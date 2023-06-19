package modelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cadastro {
    private String nome;
    private String cpf;
    private Date dataNascimento = new Date();
    private SexoEnum sexo;
    private Endereco endereco = new Endereco();
    private Contato contato = new Contato();
    private Emprego emprego = new Emprego();
    private Double pretensaoMinima;
    private Double pretensaoMaxima;
    private String habilidades;

    public Date formatarData(String dataString) {
        try {
            DateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");
            Date data = formatador.parse(dataString);
            return data;
        } catch (ParseException e) {
            throw new RuntimeException("Data inválida!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        DateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");
        return formatador.format(dataNascimento);
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public SexoEnum getSexo() {
        return sexo;
    }

    public void setSexo(SexoEnum sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Emprego getEmprego() {
        return emprego;
    }

    public void setEmprego(Emprego emprego) {
        this.emprego = emprego;
    }

    public Double getPretensaoMinima() {
        return pretensaoMinima;
    }

    public void setPretensaoMinima(Double pretensaoMinima) {
        this.pretensaoMinima = pretensaoMinima;
    }

    public Double getPretensaoMaxima() {
        return pretensaoMaxima;
    }

    public void setPretensaoMaxima(Double pretensaoMaxima) {
        this.pretensaoMaxima = pretensaoMaxima;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }
}
