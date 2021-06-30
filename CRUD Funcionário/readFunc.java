import java.util.Scanner;
import java.util.List;

public abstract class readFunc {
    public static void pesquisarFunc(List<Administrador> listAdmin, List<Veterinario> listVet) {
        try {
            boolean idFail = false; 
            Scanner reading = new Scanner(System.in);
            System.out.printf("======PESQUISAR FUNCIONÁRIO======\n");
            System.out.printf("\n1 - Listar por Id\n");
            System.out.printf("2 - Listar todos funcionário\n");
            System.out.printf("3 - Listar administradores\n");
            System.out.printf("4 - Listar veterinários\n");
            System.out.printf("O que deseja fazer? ");
            int option = reading.nextInt();
            switch (option) {
                case 1:
                    System.out.printf("Insira o Id: ");
                    String id = reading.nextLine();
                    for (Administrador admin : listAdmin) {
                        if (admin.getCodAdmin().equals(id)) {
                            idFail = true;
                            System.out.printf("=======DADOS DO FUNCIONÁRIO=======\n");
                            System.out.printf("\nId: ");
                            System.out.printf(admin.getCodAdmin());
                            System.out.printf("\nNome: ");
                            System.out.print(admin.getNome());
                            System.out.printf("\nCPF: ");
                            System.out.print(admin.getCpf());
                            System.out.printf("\nEndereço: ");
                            System.out.printf(admin.getRua());
                            System.out.printf("\nTelefone: ");
                            System.out.print(admin.getTelefone());
                            System.out.printf("\nData de nascimento: ");
                            System.out.print(admin.getDataNasc());
                            System.out.printf("\nData de admissão: ");
                            System.out.print(admin.getDataAdmissao());
                        }
                    }
                    for (Veterinario vet : listVet) {
                        if (vet.getCodVet().equals(id)) {
                            idFail = true;
                            System.out.printf("=======DADOS DO FUNCIONÁRIO=======\n");
                            System.out.printf("\nId: ");
                            System.out.printf(vet.getCodVet());
                            System.out.printf("\nNome: ");
                            System.out.print(vet.getNome());
                            System.out.printf("\nCPF: ");
                            System.out.print(vet.getCpf());
                            System.out.printf("\nEndereço: ");
                            System.out.printf(vet.getRua());
                            System.out.printf("\nTelefone: ");
                            System.out.print(vet.getTelefone());
                            System.out.printf("\nData de nascimento: ");
                            System.out.print(vet.getDataNasc());
                            System.out.printf("\nData de admissão: ");
                            System.out.print(vet.getDataAdmissao());
                        }
                    }
                    if (!idFail) {
                        System.out.println("\nID INVÁLIDO. ");
                    }
                case 2:
                    if (listAdmin.isEmpty() && listVet.isEmpty()) {
                        System.out.printf("\nLISTA VAZIA.");
                    } else {
                        System.out.printf("\n=======DADOS DO FUNCIONÁRIO=======");
                        for (Administrador admin : listAdmin) {
                            System.out.printf("\nNome: ");
                            System.out.print(admin.getNome());
                            System.out.printf(" - ");
                            System.out.printf("Id: ");
                            System.out.printf(admin.getCodAdmin());
                        }
                        for (Veterinario vet : listVet) {
                            System.out.printf("\nNome: ");
                            System.out.print(vet.getNome());
                            System.out.printf(" - ");
                            System.out.printf("Id: ");
                            System.out.printf(vet.getCodVet());
                        }
                    }
                    break;
                case 3:
                    if (listAdmin.isEmpty()) {
                        System.out.printf("\nLISTA VAZIA.");
                    } else {
                        System.out.printf("=======DADOS DO FUNCIONÁRIO=======");
                        for (Administrador admin : listAdmin) {
                            System.out.printf("\nNome: ");
                            System.out.print(admin.getNome());
                            System.out.printf(" - ");
                            System.out.printf("Id: ");
                            System.out.printf(admin.getCodAdmin());
                        }
                    }
                    break;
                case 4:
                    if (listVet.isEmpty()) {
                        System.out.printf("\nLISTA VAZIA.");
                    } else {
                        System.out.printf("=======DADOS DO FUNCIONÁRIO=======");
                        for (Veterinario vet : listVet) {
                            System.out.printf("\nNome: ");
                            System.out.print(vet.getNome());
                            System.out.printf(" - ");
                            System.out.printf("Id: ");
                            System.out.printf(vet.getCodVet());
                        }
                    }
                    break;
                default:
                    System.out.printf("OPÇÃO INVÁLIDA.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("ERRO AO PESQUISAR FUNCIONÁRIO.");
        }
    }
}
