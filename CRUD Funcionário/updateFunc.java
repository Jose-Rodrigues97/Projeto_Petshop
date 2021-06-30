import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public abstract class updateFunc {
    public static void atualizarFunc(List<Administrador> listAdmin, List<Veterinario> listVet) {
        try { 
            Scanner reading = new Scanner(System.in);
            String id;
            int dia, mes, ano;
            System.out.println("\nInsira o Id do funcionário: ");
            id = reading.nextLine();
            boolean idFail = false;
            for (Administrador admin : listAdmin) {
                System.out.println("======DADOS DO FUNCIONÁRIO======");
                if (admin.getCodAdmin().equals(id)) {
                    idFail = true;
                    System.out.print("\nNome: ");
                    System.out.print(admin.getNome());
                    System.out.print("\nEndereço: ");
                    System.out.print(admin.getRua());
                    System.out.print("\nCPF: ");
                    System.out.print(admin.getCpf());
                    System.out.print("\nTelefone: ");
                    System.out.print(admin.getTelefone());
                    System.out.print("\nData de Nascimento: ");
                    System.out.print(admin.getDataNasc());
                    System.out.print("\n======ATUALIZAR======");
                    System.out.print("\nNome: ");
                    admin.setNome(reading.nextLine());
                    System.out.print("\nEndereço: ");
                    admin.setRua(reading.nextLine());
                    System.out.print("\nCPF: ");
                    admin.setCpf(reading.nextLong());
                    System.out.print("\nTelefone: ");
                    admin.setTelefone(reading.nextLong());
                    System.out.print("\nDia de Nascimento: ");
                    dia = reading.nextInt();
                    System.out.print("\nMês de Nascimento: ");
                    mes = reading.nextInt();
                    System.out.print("\nAno de Nascimento: ");
                    ano = reading.nextInt();
                    LocalDate dataAniver = LocalDate.of(ano, mes, dia);
                    admin.setDataNasc(dataAniver);
                    listAdmin.remove(admin);
                    listAdmin.add(admin);
                    System.out.println("\nATUALIZADO COM SUCESSO.");
                }
            }
            for (Veterinario vet : listVet) {
                System.out.println("======DADOS DO FUNCIONÁRIO======\n");
                if (vet.getCodVet().equals(id)) {
                    idFail = true;
                    System.out.print("\nNome: ");
                    System.out.print(vet.getNome());
                    System.out.print("\nEndereço: ");
                    System.out.print(vet.getRua());
                    System.out.print("\nCPF: ");
                    System.out.print(vet.getCpf());
                    System.out.print("\nTelefone: ");
                    System.out.print(vet.getTelefone());
                    System.out.print("\nData de Nascimento: ");
                    System.out.print(vet.getDataNasc());
                    System.out.print("\n======ATUALIZAR======\n");
                    System.out.print("\nNome: ");
                    vet.setNome(reading.nextLine());
                    System.out.print("\nEndereço: ");
                    vet.setRua(reading.nextLine());
                    System.out.print("\nCPF: ");
                    vet.setCpf(reading.nextLong());
                    System.out.print("\nTelefone: ");
                    vet.setTelefone(reading.nextLong());
                    System.out.print("\nDia de Nascimento: ");
                    dia = reading.nextInt();
                    System.out.print("\nMês de Nascimento: ");
                    mes = reading.nextInt();
                    System.out.print("\nAno de Nascimento: ");
                    ano = reading.nextInt();
                    LocalDate dataAniver = LocalDate.of(ano, mes, dia);
                    vet.setDataNasc(dataAniver);
                    listVet.remove(vet);
                    listVet.add(vet);
                    System.out.println("\nATUALIZADO COM SUCESSO.");
                }
            }
            if (!idFail) {
                System.out.println("\nID INVÁLIDO.");
            }
        } catch (Exception e) {
            System.out.println("\nERRO AO ATUALIZAR FUNCIONÁRIO.");
        }
    }
}
