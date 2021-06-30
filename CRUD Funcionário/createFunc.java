import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner; 

public class createFunc {

    public static void inserirFunc(List<Administrador> listAdmin, List<Veterinario> listVet) {
        try {
            Scanner reading = new Scanner(System.in);
            System.out.println("======CADASTRAR FUNCIONÁRIO======");
            System.out.println("1 - Cadastrar Médico Veterinário");
            System.out.println("2 - Cadastrar Administrador");
            int option = reading.nextInt();
            int dia, mes, ano;
            String id;
            if (option == 1) {
                System.out.println("\n======CADASTRAR MÉDICO VETERINÁRIO======\n");
                Veterinario vet = new Veterinario();
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
                LocalDateTime dataAdmissao = LocalDateTime.now();
                vet.setDataAdmissao(dataAdmissao);
                id = GeraId.criaId();
                vet.setCodVet(id);
                listVet.add(vet);
                System.out.println("\nVETERINÁRIO INSERIDO COM SUCESSO.");
            } else if (option == 2) {
                System.out.println("\n======CADASTRAR ADMINISTRADOR======\n");
                Administrador admin = new Administrador();
                System.out.println("Nome: ");
                admin.setNome(reading.nextLine());
                System.out.println("Endereço: ");
                admin.setRua(reading.nextLine());
                System.out.println("CPF: ");
                admin.setCpf(reading.nextLong());
                System.out.println("Telefone: ");
                admin.setTelefone(reading.nextLong());
                System.out.println("Dia de Nascimento: ");
                dia = reading.nextInt();
                System.out.println("Mês de Nascimento: ");
                mes = reading.nextInt();
                System.out.println("Ano de Nascimento: ");
                ano = reading.nextInt();
                LocalDate dataAniver = LocalDate.of(ano, mes, dia);
                admin.setDataNasc(dataAniver);
                LocalDateTime dataAdmissao = LocalDateTime.now();
                admin.setDataAdmissao(dataAdmissao);
                id = GeraId.criaId();
                admin.setCodAdmin(id);
                listAdmin.add(admin);
                System.out.println("\nADMINISTRADOR INSERIDO COM SUCESSO.");
            } else {
                System.out.println("\nOPÇÃO INVÁLIDA\n");
            }
        } catch (Exception e) {
            System.out.println("\nERRO AO INSERIR FUNCIONÁRIO.");
        }
    }
}
