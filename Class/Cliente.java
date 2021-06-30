import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Leonardo Rosa Bittencourt e José Evandro Rodrigues Filho Junho/2021
 */
public class Cliente extends Pessoa {
    private String codCliente;
    private LocalDateTime dataInsercao;
    private List<Animal> listPet;

    public Cliente() {
        super();
    }

    public Cliente(Pessoa pessoa, String codCliente, LocalDateTime dataInsercao, List<Animal> listPet) {
        super(pessoa.nome, pessoa.rua, pessoa.cpf, pessoa.telefone, pessoa.dataNasc);
        this.codCliente = codCliente;
        this.listPet = listPet;
    }

    public void setDataInsercao(LocalDateTime dataInsercao) {
        this.dataInsercao = dataInsercao;
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

    public void setCodCliente(String cod) {
        codCliente = cod;
    }

    public void setPet(List<Animal> listPet) {
        this.listPet = listPet;
    }

    public LocalDateTime getDataInsercao() {
        return dataInsercao;
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

    public String getCodCliente() {
        return codCliente;
    }

    public List<Animal> getPet() {
        return listPet;
    }

    public String toString() {
        return super.toString() + "| Código do cliente: " + codCliente + "| Pet: " + listPet.toString();
    }
}
