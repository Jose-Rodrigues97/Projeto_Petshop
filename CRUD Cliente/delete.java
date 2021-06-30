import java.util.List; 
import java.util.Scanner;

public abstract class delete {
    public static void deletarCli(List<Cliente> listCliente, List<Animal> listAnimal) {
        try {
            Scanner reading = new Scanner(System.in);
            System.out.println("=======EXCLUIR CLIENTE=======");
            System.out.print("Insira o Id do cliente: ");
            String id = reading.nextLine();
            Boolean idFail = false;
            for (Cliente cliente : listCliente) {
                if (cliente.getCodCliente().equals(id)) {
                    listCliente.remove(cliente);
                    System.out.println("CLIENTE REMOVIDO COM SUCESSO.");
                    idFail = true;
                }
            }
            if (!idFail) {
                System.out.println("ID INVÁLIDO.");
            }
        } catch (Exception e) {

        }
    }
}
