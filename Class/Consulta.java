import java.time.LocalDateTime;

/**
 * Leonardo Rosa Bittencourt e José Evandro Rodrigues Filho Junho/2021
 */
public class Consulta {
    private String idTutor;
    private String idMedico;
    private String idConsult;
    private String idPaciente;
    private String procedimento;
    private float valorConsult;
    private LocalDateTime dataConsult;
    private boolean statusPag;

    public Consulta() {

    }

    public Consulta(String idPaciente, String idTutor, String idMedico, String idConsult, float valorConsult,
            LocalDateTime dataConsult, String procedimento, boolean statusPag) {
        this.idPaciente = idPaciente;
        this.idTutor = idTutor;
        this.idMedico = idMedico;
        this.idConsult = idConsult;
        this.valorConsult = valorConsult;
        this.dataConsult = dataConsult;
        this.procedimento = procedimento;
        this.statusPag = statusPag;
    }

    public void setStatusPag(boolean statusPag) {
        this.statusPag = statusPag;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setIdTutor(String idTutor) {
        this.idTutor = idTutor;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    public void setIdConsult(String idConsult) {
        this.idConsult = idConsult;
    }

    public void setValorConsult(float valorConsult) {
        this.valorConsult = valorConsult;
    }

    public void setDataConsult(LocalDateTime dataConsult) {
        this.dataConsult = dataConsult;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public boolean getStatusPag() {
        return statusPag;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public String getIdTutor() {
        return idTutor;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public String getIdConsult() {
        return idConsult;
    }

    public double getValorConsult() {
        return valorConsult;
    }

    public LocalDateTime getDataConsult() {
        return dataConsult;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public String toString() {
        return "| Pago: " + statusPag + "| Pet: " + idPaciente + "| Tutor: " + idTutor + "| Veterinário: " + idMedico
                + "| Id Consulta: " + idConsult + "| Valor da Consulta: " + valorConsult + "| Data: " + dataConsult
                + "| Procedimento: " + procedimento;
    }
}
