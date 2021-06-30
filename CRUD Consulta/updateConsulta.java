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
            System.out.print("\nInsira o Id da Consulta: ");
            id = reading.next();
            if (listConsulta.isEmpty()) {
                System.out.printf("\nLISTA VAZIA.");
            } else {
                for (Consulta consulta : listConsulta) {
                    if (consulta.getIdConsult().equals(id)) {
                        idFail = true;
                        System.out.println("\n======DADOS DA CONSULTA======");
                        System.out.println("Procedimento: ");
                        System.out.print(consulta.getProcedimento());
                        System.out.println("Data da Consulta: ");
                        System.out.println(consulta.getDataConsult());
                        System.out.println("\n======ATUALIZAR======\n");
                        System.out.print("\nProcedimento: ");
                        consulta.setProcedimento(reading.nextLine());
                        System.out.print("\nValor da Consulta: ");
                        consulta.setValorConsult(reading.nextFloat());
                        System.out.print("\nDia da Consulta: ");
                        dia = reading.nextInt();
                        System.out.print("\nMês de Consulta: ");
                        mes = reading.nextInt();
                        System.out.print("\nAno de Consulta: ");
                        ano = reading.nextInt();
                        System.out.print("\nHora da Consulta: ");
                        hora = reading.nextInt();
                        System.out.print("\nMinutos da Consulta: ");
                        minuto = reading.nextInt();
                        LocalDateTime dataConsulta = LocalDateTime.of(ano, mes, dia, hora, minuto, 00);
                        consulta.setDataConsult(dataConsulta);
                        listConsulta.remove(consulta);
                        listConsulta.add(consulta);
                        System.out.println("\nATUALIZADO COM SUCESSO.");
                    }
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
