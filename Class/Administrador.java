import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 
 * 
 * Leonardo Rosa Bittencourt e José Evandro Rodrigues Filho Junho/2021
 */
public class Administrador extends Pessoa {
    private LocalDateTime dataAdmissao;
    private String codAdmin;

    public Administrador() {
    }

    public Administrador(Pessoa pessoa, LocalDateTime dataAdmissao, String codAdmin) {
        super(pessoa.nome, pessoa.rua, pessoa.cpf, pessoa.telefone, pessoa.dataNasc);
        this.dataAdmissao = dataAdmissao;
        this.codAdmin = codAdmin;
    }

    public void setCodAdmin(String codAdmin) {
        this.codAdmin = codAdmin;
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

    public void setDataAdmissao(LocalDateTime dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCodAdmin() {
        return codAdmin;
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

    public String toString() {
        return super.toString() + "| Data de Admissão: " + dataAdmissao;
    }
}
