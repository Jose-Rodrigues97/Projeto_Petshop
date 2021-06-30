import java.util.List;
import java.util.Scanner;

public abstract class updatePet {
    public static void atualizarPet(List<Animal> listAnimal) {
        try {
            Scanner reading = new Scanner(System.in);
            String id;
            boolean idFail = false;
            System.out.println("\nInsira o Id do Pet: ");
            id = reading.nextLine();
            if (listAnimal.isEmpty()) {
                System.out.printf("\nLISTA VAZIA.");
            } else {
                for (Animal animal : listAnimal) {
                    if (animal.getId().equals(id)) {
                        idFail = true;
                        System.out.println("\n======DADOS DO PET======");
                        System.out.print("\nId do Animal: ");
                        System.out.print(animal.getId());
                        System.out.print("\nNome do Pet: ");
                        System.out.print(animal.getNomePet());
                        System.out.print("znEspécie: ");
                        System.out.print(animal.getEspecie());
                        System.out.print("\nRaça: ");
                        System.out.print(animal.getRaca());
                        System.out.print("\nPeso: ");
                        System.out.println(animal.getPeso());
                        System.out.print("\nData de Nascimento: ");
                        System.out.println(animal.getNascAnimal());
                        System.out.print("\nID do Dono: ");
                        System.out.println(animal.getIdDono());

                        System.out.println("\n======ATUALIZAR======\n");
                        System.out.print("\nNome do Pet: ");
                        animal.setNomePet(reading.nextLine());
                        System.out.print("\nEspécie: ");
                        animal.setEspecie(reading.nextLine());
                        System.out.print("\nRaça: ");
                        animal.setRaca(reading.nextLine());
                        System.out.print("\nPeso: ");
                        animal.setPeso(reading.nextFloat());
                        listAnimal.remove(animal);
                        listAnimal.add(animal);
                        System.out.println("\nATUALIZADO COM SUCESSO.");
                    }
                }
                if (!idFail) {
                    System.out.println("\nID INVÁLIDO. ");
                }
            }
        } catch (Exception e) {
            System.out.println("ERRO AO ATUALIZAR PET.");
        }
    }
}
