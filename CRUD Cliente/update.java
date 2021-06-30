import java.time.LocalDate;
import java.util.List;
import java.util.Scanner; 

public abstract class update {
    // #region INSERE CLIENTE
    public static void atualizarCli(List<Cliente> listCliente) {

        try {
            Scanner reading = new Scanner(System.in);
            String id;
            boolean idFail = false;
            int dia, mes, ano;
            System.out.print("\nInsira o Id do cliente: ");
            id = reading.nextLine();
            for (Cliente cliente : listCliente) {
                if (cliente.getCodCliente().equals(id)) {
                    idFail = true;
                    System.out.println("\n======DADOS DO CLIENTE======\n");
                    System.out.print("Nome: ");
                    System.out.print(cliente.getNome());
                    System.out.print("\nEndereço: ");
                    System.out.print(cliente.getRua());
                    System.out.print("\nCPF: ");
                    System.out.print(cliente.getCpf());
                    System.out.print("\nTelefone: ");
                    System.out.print(cliente.getTelefone());
                    System.out.print("\nData de Nascimento: ");
                    System.out.print(cliente.getDataNasc());
                    System.out.print("\n======ATUALIZAR======\n");
                    System.out.print("Nome: ");
                    cliente.setNome(reading.nextLine());
                    System.out.print("Endereço: ");
                    cliente.setRua(reading.nextLine());
                    System.out.print("CPF: ");
                    cliente.setCpf(reading.nextLong());
                    System.out.print("Telefone: ");
                    cliente.setTelefone(reading.nextLong());
                    System.out.print("Dia de Nascimento: ");
                    dia = reading.nextInt();
                    System.out.print("Mês de Nascimento: ");
                    mes = reading.nextInt();
                    System.out.print("Ano de Nascimento: ");
                    ano = reading.nextInt();
                    LocalDate dataAniver = LocalDate.of(ano, mes, dia);
                    cliente.setDataNasc(dataAniver);
                    listCliente.remove(cliente);
                    listCliente.add(cliente);
                    System.out.println("\nCLIENTE ATUALIZADO COM SUCESSO.");
                }
            }
            if (!idFail) {
                System.out.println("\nID INVÁLIDO. ");
            }
        } catch (Exception e) {
            System.out.println("ERRO AO ATUALIZAR CLIENTE.");
        }

    }
    // #endregion
}
