import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public abstract class createPet {
    public static void inserirPet(List<Animal> listAnimal, List<Cliente> listCliente) {
        try {
            Scanner reading = new Scanner(System.in);
            int ano, mes, dia;
            String id;
            Animal animal = new Animal();
            System.out.printf("\n======CADASTRAR PET======\n");
            System.out.print("\nInforme o ID do dono do Pet:");
            animal.setDono(reading.nextLine());
            if (listCliente.isEmpty()) {
                System.out.printf("\nNENHUM CLIENTE CADASTRADO.");
            } else {
                for (Cliente cliente : listCliente) {
                    if (cliente.getCodCliente().equals(animal.getIdDono())) {
                        System.out.print("Espécie: ");
                        animal.setEspecie(reading.nextLine());
                        System.out.print("Raça: ");
                        animal.setRaca(reading.nextLine());
                        System.out.print("Peso: ");
                        animal.setPeso(reading.nextFloat());
                        System.out.print("Dia de Nascimento: ");
                        dia = reading.nextInt();
                        System.out.print("Mês de Nascimento: ");
                        mes = reading.nextInt();
                        System.out.print("Ano de Nascimento: ");
                        ano = reading.nextInt();
                        LocalDate dataAniver = LocalDate.of(ano, mes, dia);
                        animal.setNascAnimal(dataAniver);
                        id = GeraId.criaId();
                        animal.setId(id);
                        listAnimal.add(animal);
                        System.out.println("\nPET INSERIDO COM SUCESSO.");
                    } else {
                        System.out.println("\nID DO DONO INEXISTENTE.");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("\nERRO AO INSERIR PET.");
        }
    }
}
