import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public abstract class updateConsulta {
    public static void atualizarCons(List<Consulta> listConsulta) { 
        try {
            Scanner reading = new Scanner(System.in);
            String id;
            boolean idFail = false;
            int dia, mes, ano, hora, minuto;
            System.out.println("\nInsira o Id da Consulta: ");
            id = reading.nextLine();
            for (Consulta consulta : listConsulta) {
                if (consulta.getIdConsult().equals(id)) {
                    idFail = true;
                    System.out.println("\n======DADOS DA CONSULTA======");
                    System.out.println("Id do Animal: ");
                    System.out.print(consulta.getIdPaciente());
                    System.out.println("Id do Cliente: ");
                    System.out.print(consulta.getIdTutor());
                    System.out.println("Id do Veterinário: ");
                    System.out.print(consulta.getIdMedico());
                    System.out.println("Procedimento: ");
                    System.out.print(consulta.getProcedimento());
                    System.out.println("Data da Consulta: ");
                    System.out.println(consulta.getDataConsult());

                    System.out.println("\n======ATUALIZAR======\n");
                    System.out.println("Procedimento: ");
                    consulta.setProcedimento(reading.nextLine());
                    System.out.println("Valor da Consulta: ");
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
                    listConsulta.remove(consulta);
                    listConsulta.add(consulta);
                    System.out.println("\nATUALIZADO COM SUCESSO.");
                }
            }
            if (!idFail) {
                System.out.println("\nID INVÁLIDO. ");
            }
        } catch (Exception e) {
            System.out.println("ERRO AO ATUALIZAR CONSULTA.");
        }
    }
}
