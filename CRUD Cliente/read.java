import java.util.List;
import java.util.Scanner;

public abstract class read {
    public static void pesquisarCli(List<Cliente> listCliente) {
        try {

            Scanner reading = new Scanner(System.in);
            int option;
            String id;
            boolean idFail = false;
            System.out.println("======PESQUISAR CLIENTES======\n");
            System.out.printf("1 - Listar todos Clientes");
            System.out.println("\n2 - Listar por Id");
            System.out.print("O que deseja fazer? ");
            option = reading.nextInt();
            switch (option) {
                case 1:
                    System.out.printf("\n======LISTA DE CLIENTES======\n");
                    if (listCliente.isEmpty()) {
                        System.out.printf("\nLISTA VAZIA.");
                    } else {
                        for (Cliente cliente : listCliente) {
                            System.out.print("\nNome: ");
                            System.out.print(cliente.getNome());
                            System.out.print(" - ");
                            System.out.print("Id: ");
                            System.out.printf(cliente.getCodCliente());
                        }
                    }
                    break;
                case 2:
                    if (listCliente.isEmpty()) {
                        System.out.printf("\nLISTA VAZIA.");
                    } else {
                        System.out.print("Insira o Id do cliente: ");
                        id = reading.next();
                        System.out.printf("\n======DADOS DO CLIENTE======\n");
                        for (Cliente cliente : listCliente) {
                            if (cliente.getCodCliente().equals(id)) {
                                idFail = true;
                                System.out.print("\nNome: ");
                                System.out.print(cliente.getNome());
                                System.out.print("\nId: ");
                                System.out.print(cliente.getCodCliente());
                                System.out.print("\nEndereço: ");
                                System.out.print(cliente.getRua());
                                System.out.print("\nCPF: ");
                                System.out.print(cliente.getCpf());
                                System.out.print("\nTelefone: ");
                                System.out.print(cliente.getTelefone());
                                System.out.print("\nData de Nascimento: ");
                                System.out.print(cliente.getDataNasc());
                            }
                        }
                        if (!idFail) {
                            System.out.println("\nID INVÁLIDO. ");
                        }
                    }
                    break;
                default:
                    System.out.printf("OPÇÃO INVÁLIDA.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("ERRO AO PESQUISAR CLIENTE.");
        }
    }
}
