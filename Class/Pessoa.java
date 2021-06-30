import java.time.LocalDate;

/**
 * 
 * 
 * Leonardo Rosa Bittencourt e José Evandro Rodrigues Filho Junho/2021
 */

public abstract class Pessoa {
    protected String nome;
    protected String rua;
    protected long cpf;
    protected long telefone;
    protected LocalDate dataNasc;

    protected Pessoa() {
    }

    protected Pessoa(String nome, String rua, long cpf, long telefone, LocalDate dataNasc) {
        this.nome = nome;
        this.rua = rua;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNome(String n) {
        nome = n;
    }

    public void setCpf(long c) {
        cpf = c;
    }

    public void setTelefone(long t) {
        telefone = t;
    }

    public void setDataNasc(LocalDate d) {
        dataNasc = d;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public String getRua() {
        return rua;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public String toString() {
        return "Nome: " + nome + "| CPF: " + cpf + "| Telefone: " + telefone + "| Data de nascimento: "
                + dataNasc.toString();
    }
}