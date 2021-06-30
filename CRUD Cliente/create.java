import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public abstract class create {

    // #region INSERE CLIENTE
    public static void inserirCli(List<Cliente> listCliente, List<Animal> listAnimal) {
        try {
            Scanner reading = new Scanner(System.in);
            int ano, mes, dia;
            String id;
            Cliente cliente = new Cliente();
            System.out.printf("======CADASTRAR CLIENTE======\n");
            System.out.printf("\nNome: ");
            cliente.setNome(reading.nextLine());
            System.out.printf("Endereço: ");
            cliente.setRua(reading.nextLine());
            System.out.print("CPF: ");
            cliente.setCpf(reading.nextLong());
            System.out.printf("Telefone: ");
            cliente.setTelefone(reading.nextLong());
            System.out.printf("Dia de Nascimento: ");
            dia = reading.nextInt();
            System.out.printf("Mês de Nascimento: ");
            mes = reading.nextInt();
            System.out.printf("Ano de Nascimento: ");
            ano = reading.nextInt();
            LocalDate dataAniver = LocalDate.of(ano, mes, dia);
            cliente.setDataNasc(dataAniver);
            LocalDateTime dataInsercao = LocalDateTime.now();
            cliente.setDataInsercao(dataInsercao);
            id = GeraId.criaId();
            cliente.setCodCliente(id);
            listCliente.add(cliente);
            System.out.println("\nCLIENTE INSERIDO COM SUCESSO.");
        } catch (Exception e) {
            System.out.println("\nERRO AO INSERIR CLIENTE.");
        }
    }
    // #endregion

}
