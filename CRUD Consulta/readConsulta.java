import java.util.List;
import java.util.Scanner; 

public abstract class readConsulta {
    public static void pesquisarCons(List<Consulta> listConsulta) {
        try {

            Scanner reading = new Scanner(System.in);
            System.out.printf("1 - Listar todas Consultas\n");
            System.out.printf("2 - Listar por Id\n");
            System.out.print("O que deseja fazer? ");
            int option = reading.nextInt();
            switch (option) {
                case 1:
                    if (listConsulta.isEmpty()) {
                        System.out.printf("\nLISTA VAZIA.");
                    }
                    for (Consulta consulta : listConsulta) {
                        System.out.printf("=======DADOS DAS CONSULTAS=======");
                        System.out.printf("Id: ");
                        System.out.printf(consulta.getIdConsult());
                        System.out.printf("Pagamento Realizado: ");
                        if (consulta.getStatusPag() == true) {
                            System.out.printf("Sim");
                        } else {
                            System.out.printf("Não");
                        }
                        System.out.printf("Data da Consulta: ");
                        System.out.print(consulta.getDataConsult());
                        System.out.printf("Valor: ");
                        System.out.print(consulta.getValorConsult());
                        System.out.printf("Procedimento: ");
                        System.out.printf(consulta.getProcedimento());
                        System.out.printf("Id do Animal: ");
                        System.out.printf(consulta.getIdPaciente());
                        System.out.printf("Id do Cliente: ");
                        System.out.printf(consulta.getIdTutor());
                        System.out.printf("Id do Veterinário: ");
                        System.out.printf(consulta.getIdMedico());
                        System.out.printf("-----------------------------------------");
                    }
                    break;
                case 2:
                    boolean idFail = false;
                    System.out.printf("Insira o Id: ");
                    String id = reading.nextLine();
                    for (Consulta consulta : listConsulta) {
                        if (consulta.getIdConsult().equals(id)) {
                            idFail = true;
                            System.out.printf("=======DADOS DA CONSULTA=======");
                            System.out.printf("Id: ");
                            System.out.printf(consulta.getIdConsult());
                            System.out.printf("Pagamento Realizado: ");
                            if (consulta.getStatusPag() == true) {
                                System.out.printf("Sim");
                            } else {
                                System.out.printf("Não");
                            }
                            System.out.printf("Data da Consulta: ");
                            System.out.print(consulta.getDataConsult());
                            System.out.printf("Valor: ");
                            System.out.print(consulta.getValorConsult());
                            System.out.printf("Procedimento: ");
                            System.out.printf(consulta.getProcedimento());
                            System.out.printf("Id do Animal: ");
                            System.out.printf(consulta.getIdPaciente());
                            System.out.printf("Id do Cliente: ");
                            System.out.printf(consulta.getIdTutor());
                            System.out.printf("Id do Veterinário: ");
                            System.out.printf(consulta.getIdMedico());
                        }
                    }
                    if (!idFail) {
                        System.out.println("\nID INVÁLIDO. ");
                    }
                default:
                    System.out.printf("OPÇÃO INVÁLIDA.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("ERRO AO PESQUISAR CONSULTA .");
        }
    }
}
