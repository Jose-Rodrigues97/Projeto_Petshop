import java.util.List;
import java.util.Scanner;

public abstract class deleteConsulta {

    public static void deletarCons(List<Consulta> listConsulta) {
        try {
            Scanner reading = new Scanner(System.in);
            System.out.println("=======EXCLUIR CONSULTA=======");
            System.out.println("Insira o Id");
            String id = reading.nextLine();
            boolean idFail = false;
            for (Consulta consulta : listConsulta) {
                if (consulta.getIdConsult().equals(id)) {
                    listConsulta.remove(consulta);
                    System.out.println("CONSULTA REMOVIDA COM SUCESSO.");
                    idFail = true;
                }
            }
            if (!idFail) {
                System.out.println("ID INVÁLIDO.");
            }
        } catch (Exception e) {
            System.out.println("ERRO AO EXCLUIR CONSULTA.");
        }
    }
}
