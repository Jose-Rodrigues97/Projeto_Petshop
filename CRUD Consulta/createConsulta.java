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
            if (listCliente.isEmpty() || listVet.isEmpty() || ListAni.isEmpty()) {
                System.out.printf("\nVocê esqueceu de cadastrar Cliente ou Veterinário ou Animal.");
            } else {
                System.out.printf("\n======CADASTRAR CONSULTA======\n");
                System.out.println("======LISTA DE VETERINÁRIOS======");
                for (Veterinario veterinario : listVet) {
                    System.out.print(veterinario.getNome());
                    System.out.print(" - ");
                    System.out.print(veterinario.getCodVet());
                }
                System.out.print("\nInsira o ID do veterinário: ");
                consulta.setIdMedico(reading.next());
                System.out.println("======LISTA DE CLIENTES======");
                for (Cliente cliente : listCliente) {
                    System.out.print(cliente.getNome());
                    System.out.print(" - ");
                    System.out.print(cliente.getCodCliente());
                }
                System.out.print("\nInsira o ID do cliente: ");
                consulta.setIdTutor(reading.next());
                System.out.println("======LISTA DE PETS======");
                for (Animal animal : ListAni) {
                    System.out.print(animal.getNomePet());
                    System.out.print(" - ");
                    System.out.print(animal.getId());
                }
                System.out.print("\nInsira o ID do pet: ");
                consulta.setIdPaciente(reading.next());
                System.out.println("======INFOS DA CONSULTA======");
                System.out.print("Procedimento: ");
                consulta.setProcedimento(reading.next());
                System.out.print("Valor da consulta: ");
                consulta.setValorConsult(reading.nextFloat());
                System.out.print("Dia da Consulta: ");
                dia = reading.nextInt();
                System.out.print("Mês de Consulta: ");
                mes = reading.nextInt();
                System.out.print("Ano de Consulta: ");
                ano = reading.nextInt();
                System.out.print("Hora da Consulta: ");
                hora = reading.nextInt();
                System.out.print("Minutos da Consulta: ");
                minuto = reading.nextInt();
                LocalDateTime dataConsulta = LocalDateTime.of(ano, mes, dia, hora, minuto, 00);
                consulta.setDataConsult(dataConsulta);
                id = GeraId.criaId();
                consulta.setIdConsult(id);
                System.out.print("\n1 - REALIZAR PAGAMENTO EM DINHEIRO ");
                System.out.print("\n2 - REALIZAR PAGAMENTO EM CARTÃO ");
                System.out.print("\nO que deseja fazer: ");
                pagar = reading.nextInt();
                do {
                    switch (pagar) {
                        case 1:
                            consulta.setStatusPag(true);
                            System.out.println("\nPAGAMENTO RECEBIDO NO DINHEIRO");
                            break;
                        case 2:
                            consulta.setStatusPag(true);
                            System.out.println("\nPAGAMENTO RECEBIDO NO CARTÃO");
                            break;
                        default:
                            System.out.println("\nOPÇÃO INVÁLIDA");
                            break;
                    }
                } while (pagar == 1 && pagar == 2);
                listConsulta.add(consulta);
                System.out.println("\nCONSULTA INSERIDA COM SUCESSO.");
            }
        } catch (Exception e) {
            System.out.println("\nERRO AO INSERIR CONSULTA.");
        }
    }
    // #endregion
}
