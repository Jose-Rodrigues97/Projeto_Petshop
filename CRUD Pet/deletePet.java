import java.util.List;
import java.util.Scanner;

public abstract class deletePet {
    public static void deletarPet(List<Animal> listAnimal) {
        try {
            Scanner reading = new Scanner(System.in);
            System.out.println("=======EXCLUIR PET=======");
            System.out.print("Insira o Id do pet: ");
            String id = reading.nextLine();
            boolean idFail = false;
            if (listAnimal.isEmpty()) {
                System.out.printf("\nLISTA VAZIA.");
            } else {
                for (Animal animal : listAnimal) {
                    if (animal.getId().equals(id)) {
                        listAnimal.remove(animal);
                        System.out.println("PET REMOVIDO COM SUCESSO.");
                        idFail = true;
                    }
                }
                if (!idFail) {
                    System.out.println("ID INVÁLIDO.");
                }
            }
        } catch (Exception e) {
            System.out.println("ERRO AO EXCLUIR PET.");
        }
    }
}
