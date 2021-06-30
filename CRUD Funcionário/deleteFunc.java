import java.util.List;
import java.util.Scanner;

public abstract class deleteFunc {
    public static void deletarFunc(List<Administrador> listAdmin, List<Veterinario> listVet) {
        try {
            Scanner reading = new Scanner(System.in);
            System.out.println("=======EXCLUIR FUNCIONÁRIO=======");
            System.out.println("Insira o Id");
            String id = reading.nextLine();
            Boolean idFail = false;
            for (Administrador admin : listAdmin) {
                if (admin.getCodAdmin().equals(id)) {
                    listAdmin.remove(admin);
                    System.out.println("FUNCIONÁRIO REMOVIDO COM SUCESSO.");
                    idFail = true;
                }
            }
            for (Veterinario vet : listVet) {
                if (vet.getCodVet().equals(id)) {
                    listVet.remove(vet);
                    System.out.println("FUNCIONÁRIO REMOVIDO COM SUCESSO.");
                    idFail = true;
                }
            }
            if (!idFail) {
                System.out.println("ID INVÁLIDO.");
            }
        } catch (Exception e) {
            System.out.println("ERRO AO EXCLUIR FUNCIONÁRIO.");
        }

    }
}
