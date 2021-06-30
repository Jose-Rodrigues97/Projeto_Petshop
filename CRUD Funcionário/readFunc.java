import java.util.Scanner;
import java.util.List;

public abstract class readFunc {
    public static void pesquisarFunc(List<Administrador> listAdmin, List<Veterinario> listVet) {
        try {
            boolean idFail = false;
            String id;
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
                    System.out.printf("=======PESQUISAR FUNCIONÁRIO=======\n");
                    System.out.print("Insira o Id: ");
                    id = reading.next();
                    if (listAdmin.isEmpty() && listVet.isEmpty()) {
                        System.out.printf("\nLISTA VAZIA.");
                    } else {
                        if (!listAdmin.isEmpty()) {
                            for (Administrador admin : listAdmin) {
                                if (admin.getCodAdmin().equals(id)) {
                                    idFail = true;
                                    System.out.printf("=======DADOS DO FUNCIONÁRIO=======\n");
                                    System.out.print("\nId: ");
                                    System.out.printf(admin.getCodAdmin());
                                    System.out.print("\nNome: ");
                                    System.out.print(admin.getNome());
                                    System.out.print("\nCPF: ");
                                    System.out.print(admin.getCpf());
                                    System.out.print("\nEndereço: ");
                                    System.out.printf(admin.getRua());
                                    System.out.print("\nTelefone: ");
                                    System.out.print(admin.getTelefone());
                                    System.out.print("\nData de nascimento: ");
                                    System.out.print(admin.getDataNasc());
                                    System.out.print("\nData de admissão: ");
                                    System.out.print(admin.getDataAdmissao());
                                }
                            }
                        }
                        if (!listVet.isEmpty()) {
                            for (Veterinario vet : listVet) {
                                if (vet.getCodVet().equals(id)) {
                                    idFail = true;
                                    System.out.printf("=======DADOS DO FUNCIONÁRIO=======\n");
                                    System.out.print("\nId: ");
                                    System.out.print(vet.getCodVet());
                                    System.out.print("\nNome: ");
                                    System.out.print(vet.getNome());
                                    System.out.print("\nCPF: ");
                                    System.out.print(vet.getCpf());
                                    System.out.print("\nEndereço: ");
                                    System.out.print(vet.getRua());
                                    System.out.print("\nTelefone: ");
                                    System.out.print(vet.getTelefone());
                                    System.out.print("\nData de nascimento: ");
                                    System.out.print(vet.getDataNasc());
                                    System.out.print("\nData de admissão: ");
                                    System.out.print(vet.getDataAdmissao());
                                }
                            }
                        }
                        if (!idFail) {
                            System.out.println("\nID INVÁLIDO. ");
                        }
                    }
                    break;
                case 2:
                    if (listAdmin.isEmpty() && listVet.isEmpty()) {
                        System.out.printf("\nLISTA VAZIA.");
                    } else {
                        System.out.printf("\n=======LISTA DE FUNCIONÁRIOS=======");
                        if (!listAdmin.isEmpty()) {
                            for (Administrador admin : listAdmin) {
                                System.out.print("\nNome: ");
                                System.out.print(admin.getNome());
                                System.out.print(" - ");
                                System.out.print("Id: ");
                                System.out.print(admin.getCodAdmin());
                            }
                        }
                        if (!listVet.isEmpty()) {
                            for (Veterinario vet : listVet) {
                                System.out.print("\nNome: ");
                                System.out.print(vet.getNome());
                                System.out.print(" - ");
                                System.out.print("Id: ");
                                System.out.print(vet.getCodVet());
                            }
                        }
                    }
                    break;
                case 3:
                    if (listAdmin.isEmpty()) {
                        System.out.printf("\nLISTA VAZIA.");
                    } else {
                        System.out.printf("=======DADOS DO FUNCIONÁRIO=======");
                        for (Administrador admin : listAdmin) {
                            System.out.print("\nNome: ");
                            System.out.print(admin.getNome());
                            System.out.print(" - ");
                            System.out.print("Id: ");
                            System.out.print(admin.getCodAdmin());
                        }
                    }
                    break;
                case 4:
                    if (listVet.isEmpty()) {
                        System.out.printf("\nLISTA VAZIA.");
                    } else {
                        System.out.printf("=======DADOS DO FUNCIONÁRIO=======");
                        for (Veterinario vet : listVet) {
                            System.out.print("\nNome: ");
                            System.out.print(vet.getNome());
                            System.out.print(" - ");
                            System.out.print("Id: ");
                            System.out.print(vet.getCodVet());
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
