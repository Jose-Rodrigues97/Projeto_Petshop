import java.time.LocalDateTime; 
import java.util.List;
import java.util.Scanner;

public abstract class createConsulta {

    // #region INSERE CONSULTA
    public static void inserirCons(List<Cliente> listCliente, List<Animal> ListAni, List<Veterinario> listVet,
            List<Consulta> listConsulta) {
        try {
            Scanner reading = new Scanner(System.in);
            int ano, mes, dia, hora, minuto, pagar;
            String id;
            Consulta consulta = new Consulta();
            System.out.println("LISTA DE VETERINÁRIOS: ");
            for (Veterinario veterinario : listVet) {
                System.out.printf(veterinario.getNome());
                System.out.printf(" - ");
                System.out.printf(veterinario.getCodVet());
            }
            System.out.println("Insira o ID do veterinário: ");
            consulta.setIdMedico(reading.nextLine());
            System.out.println("LISTA DE CLIENTES: ");
            for (Cliente cliente : listCliente) {
                System.out.printf(cliente.getNome());
                System.out.printf(" - ");
                System.out.printf(cliente.getCodCliente());
            }
            System.out.println("Insira o ID do cliente: ");
            consulta.setIdTutor(reading.nextLine());
            System.out.println("LISTA DE PETS: ");
            for (Animal animal : ListAni) {
                System.out.printf(animal.getNomePet());
                System.out.printf(" - ");
                System.out.printf(animal.getId());
            }
            System.out.println("Insira o ID do pet: ");
            consulta.setIdPaciente(reading.nextLine());
            id = GeraId.criaId();
            consulta.setIdConsult(id);
            System.out.printf("Procedimento: ");
            consulta.setProcedimento(reading.nextLine());
            System.out.println("Valor da consulta: ");
            consulta.setValorConsult(reading.nextFloat());
            System.out.println("Dia da Consulta: ");
            dia = reading.nextInt();
            System.out.println("Mês de Consulta: ");
            mes = reading.nextInt();
            System.out.println("Ano de Consulta: ");
            ano = reading.nextInt();
            System.out.println("Hora da Consulta: ");
            hora = reading.nextInt();
            System.out.println("Minutos da Consulta: ");
            minuto = reading.nextInt();
            LocalDateTime dataConsulta = LocalDateTime.of(ano, mes, dia, hora, minuto, 00);
            consulta.setDataConsult(dataConsulta);
            pagar = realizarPag();
            do {
                if (pagar == 1) {
                    consulta.setStatusPag(true);
                } else if (pagar == 2) {
                    consulta.setStatusPag(true);
                } else {
                    System.out.println("\nOPÇÃO INVÁLIDA");
                    pagar = realizarPag();
                }
            } while (pagar != 1 || pagar != 2);
            listConsulta.add(consulta);
            System.out.println("\nCONSULTA INSERIDA COM SUCESSO.");
        } catch (Exception e) {
            System.out.println("\nERRO AO INSERIR CONSULTA.");
        }
    }
    // #endregion

    // #region PAGAR
    public static int realizarPag() {
        Scanner reading = new Scanner(System.in);
        System.out.println("1 - REALIZAR PAGAMENTO AGORA? ");
        System.out.println("2 - REALIZAR PAGAMENTO NO DIA DA CONSULTA? ");
        int pagar = reading.nextInt();
        return pagar;
    }
    // #endregion
}
