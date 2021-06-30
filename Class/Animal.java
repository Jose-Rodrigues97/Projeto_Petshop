import java.time.LocalDate;

/**
 * 
 * 
 * Leonardo Rosa Bittencourt e José Evandro Rodrigues Filho Junho/2021
 */
public class Animal {
    private String id;
    private String especie;
    private String nomePet;
    private String idDono;
    private String raca;
    private float peso;
    private LocalDate nascAnimal;

    public Animal() {

    }

    public Animal(String id, String especie, String nomePet, String idDono, String raca, float peso,
            LocalDate nascAnimal) {
        this.id = id;
        this.especie = especie;
        this.nomePet = nomePet;
        this.idDono = idDono;
        this.raca = raca;
        this.peso = peso;
        this.nascAnimal = nascAnimal;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public void setDono(String idDono) {
        this.idDono = idDono;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setNascAnimal(LocalDate nascAnimal) {
        this.nascAnimal = nascAnimal;
    }

    public String getId() {
        return id;
    }

    public String getEspecie() {
        return especie;
    }

    public String getNomePet() {
        return nomePet;
    }

    public String getIdDono() {
        return idDono;
    }

    public String getRaca() {
        return raca;
    }

    public double getPeso() {
        return peso;
    }

    public LocalDate getNascAnimal() {
        return nascAnimal;
    }

    public String toString() {
        return "Id: " + id + "| Espécie: " + especie + "| Nome do Pet: " + nomePet + "| Dono: " + idDono + "| Raça: "
                + raca + "| Peso: " + peso + "| Data de nascimento do Pet: " + nascAnimal;
    }
}
