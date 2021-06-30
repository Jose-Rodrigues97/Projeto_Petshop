import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 
 * 
 * Leonardo Rosa Bittencourt e José Evandro Rodrigues Filho Junho/2021
 */
public class Veterinario extends Pessoa {
    private LocalDateTime dataAdmissao;
    private String codVet;

    public Veterinario() {

    }

    public Veterinario(Pessoa pessoa, LocalDateTime dataAdmissao, String codVet) {
        super(pessoa.nome, pessoa.rua, pessoa.cpf, pessoa.telefone, pessoa.dataNasc);
        this.dataAdmissao = dataAdmissao;
        this.codVet = codVet;
    }

    public void setNome(String n) {
        super.setNome(n);
    }

    public void setCpf(long c) {
        super.setCpf(c);
    }

    public void setTelefone(long t) {
        super.setTelefone(t);
    }

    public void setDataNasc(LocalDate d) {
        super.setDataNasc(d);
    }

    public void setDataAdmissao(LocalDateTime dA) {
        dataAdmissao = dA;
    }

    public void setCodVet(String r) {
        codVet = r;
    }

    public String getNome() {
        return super.getNome();
    }

    public long getCpf() {
        return super.getCpf();
    }

    public long getTelefone() {
        return super.getTelefone();
    }

    public LocalDate getDataNasc() {
        return super.getDataNasc();
    }

    public LocalDateTime getDataAdmissao() {
        return dataAdmissao;
    }

    public String getCodVet() {
        return codVet;
    }

    public String toString() {
        return super.toString() + "| Data de Admissão: " + dataAdmissao + "| Registro: " + codVet;
    }
    // realizaConsulta(){;}
}