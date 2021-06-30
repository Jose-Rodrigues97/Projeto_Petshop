import java.util.List;
import java.util.Scanner;

public abstract class readPet {
    public static void pesquisarPet(List<Animal> listAnimal) {
        try {
            String id;
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
                            System.out.print("\nEspécie: ");
                            System.out.print(animal.getEspecie());
                            System.out.print(" - ");
                            System.out.print("Id: ");
                            System.out.print(animal.getId());
                        }
                    }
                    break;
                case 2:
                    boolean idFail = false;
                    System.out.print("Insira o Id do pet: ");
                    id = reading.next();
                    if (listAnimal.isEmpty()) {
                        System.out.printf("\nLISTA VAZIA.");
                    } else {
                        for (Animal animal : listAnimal) {
                            if (animal.getId().equals(id)) {
                                System.out.print("\n======DADOS DO PET======\n");
                                idFail = true;
                                System.out.print("\nEspécie: ");
                                System.out.print(animal.getEspecie());
                                System.out.print("\nId: ");
                                System.out.print(animal.getId());
                                System.out.print("\nRaça: ");
                                System.out.print(animal.getRaca());
                                System.out.print("\nPeso: ");
                                System.out.print(animal.getPeso());
                                System.out.print("\nData de Nascimento: ");
                                System.out.print(animal.getNascAnimal());
                                System.out.print("\nID do Dono: ");
                                System.out.print(animal.getIdDono());
                            }
                            break;
                        }
                        if (!idFail) {
                            System.out.println("\nID INVÁLIDO. ");
                        }
                    }
            }
        } catch (Exception e) {
            System.out.println("ERRO AO PESQUISAR PET.");
        }
    }
}
