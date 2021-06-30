import java.util.List; 
import java.util.Scanner;

public abstract class readPet {
    public static void pesquisarPet(List<Animal> listAnimal) {
        try {

            Scanner reading = new Scanner(System.in);
            System.out.printf("1 - Listar todos Pets\n");
            System.out.printf("2 - Listar por Id\n");
            System.out.print("O que deseja fazer? ");
            int option = reading.nextInt();
            switch (option) {
                case 1:
                    if (listAnimal.isEmpty()) {
                        System.out.printf("\nLISTA VAZIA.");
                    } else {
                        System.out.printf("\n======LISTA DE PETS======");
                        for (Animal animal : listAnimal) {
                            System.out.printf("Espécie: ");
                            System.out.printf(animal.getEspecie());
                            System.out.printf("\nId: ");
                            System.out.printf(animal.getId());
                            System.out.printf("\nRaça: ");
                            System.out.printf(animal.getRaca());
                            System.out.printf("\nPeso: ");
                            System.out.print(animal.getPeso());
                            System.out.printf("\nData de Nascimento: ");
                            System.out.print(animal.getNascAnimal());
                            System.out.printf("\nID do Dono: ");
                            System.out.print(animal.getIdDono());
                        }
                    }
                    break;
                case 2:
                    boolean idFail = false;
                    System.out.print("Insira o Id do pet: ");
                    System.out.printf("\n======DADOS DO CLIENTE======\n");
                    String id = reading.nextLine();
                    for (Animal animal : listAnimal) {
                        if (id == animal.getId()) {
                            idFail = true;
                            System.out.printf("Espécie: ");
                            System.out.printf(animal.getEspecie());
                            System.out.printf("Id: ");
                            System.out.printf(animal.getId());
                            System.out.printf("Raça: ");
                            System.out.printf(animal.getRaca());
                            System.out.printf("Peso: ");
                            System.out.print(animal.getPeso());
                            System.out.printf("Data de Nascimento: ");
                            System.out.print(animal.getNascAnimal());
                            System.out.printf("ID do Dono: ");
                            System.out.print(animal.getIdDono());
                        }
                        break;
                    }
                    if (!idFail) {
                        System.out.println("\nID INVÁLIDO. ");
                    }
            }
        } catch (Exception e) {
            System.out.println("ERRO AO PESQUISAR PET.");
        }
    }
}
