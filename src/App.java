import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    // #region MAIN
    public static void main(String[] args) throws Exception {
        Scanner reading = new Scanner(System.in);
        try {
            ArrayList<Cliente> listCliente = new ArrayList<Cliente>();
            ArrayList<Animal> listAni = new ArrayList<Animal>();
            ArrayList<Administrador> listAdmin = new ArrayList<Administrador>();
            ArrayList<Veterinario> listVet = new ArrayList<Veterinario>();
            ArrayList<Consulta> listConsulta = new ArrayList<Consulta>();
            insereFuncionarios(listAdmin, listVet);
            int option = 1, optionLogin = 1, optionAdmin = 1, optionCliente, optionAni, optionFunc, optionCons;
            String idDono;
            while (option != 0) {
                home();
                option = reading.nextInt();
                switch (option) {
                    case 0:
                        System.out.println("\nFinalizando o sistema. Até logo.");
                        break;
                    case 1:
                        while (optionLogin != 0) {
                            optionLogin = login(listAdmin, listVet);
                            switch (optionLogin) {
                                case 0:
                                    System.out.println("\nFinalizando o sistema. Até logo.");
                                    option = optionLogin;
                                    break;
                                case 1:
                                    System.out.println("\nTENTE NOVAMENTE.");
                                    break;
                                case 2:
                                    while (optionAdmin != 0) {
                                        menuAdmin();
                                        optionAdmin = reading.nextInt();
                                        switch (optionAdmin) {
                                            case 0:
                                                System.out.println("\nFinalizando o sistema. Até logo.");
                                                optionLogin = optionAdmin;
                                                option = optionLogin;
                                                break;
                                            case 1: {
                                                do {
                                                    abaCliente(listCliente, listAni);
                                                    optionCliente = reading.nextInt();
                                                    switch (optionCliente) {
                                                        case 0:
                                                            System.out.println("\nFinalizando o sistema. Até logo.");
                                                            optionAdmin = optionCliente;
                                                            optionLogin = optionAdmin;
                                                            option = optionLogin;
                                                            break;
                                                        case 1:
                                                            create.inserirCli(listCliente, listAni);
                                                            break;
                                                        case 2:
                                                            read.pesquisarCli(listCliente);
                                                            break;
                                                        case 3:
                                                            update.atualizarCli(listCliente);
                                                            break;
                                                        case 4:
                                                            delete.deletarCli(listCliente, listAni);
                                                            break;
                                                        case 5:
                                                            System.out.println("RETORNANDO PARA ABA ANTERIOR.");
                                                            break;
                                                        default:
                                                            System.out.println("OPÇÃO INVÁLIDA.");
                                                            break;
                                                    }
                                                } while (optionCliente != 0 && optionCliente != 5);
                                            }
                                                break;
                                            case 2:
                                                do {
                                                    optionAni = abaPet(listCliente, listAni);
                                                    switch (optionAni) {
                                                        case 0:
                                                            System.out.println("\nFinalizando o sistema. Até logo.");
                                                            optionAdmin = optionAni;
                                                            optionLogin = optionAdmin;
                                                            option = optionLogin;
                                                            break;
                                                        case 1:
                                                            createPet.inserirPet(listAni, listCliente);
                                                            break;
                                                        case 2:
                                                            readPet.pesquisarPet(listAni);
                                                            break;
                                                        case 3:
                                                            updatePet.atualizarPet(listAni);
                                                            break;
                                                        case 4:
                                                            deletePet.deletarPet(listAni);
                                                            break;
                                                        case 5:
                                                            System.out.println("RETORNANDO PARA ABA ANTERIOR.");
                                                            break;
                                                        default:
                                                            System.out.println("OPÇÃO INVÁLIDA.");
                                                            break;
                                                    }
                                                } while (optionAni != 0 && optionAni != 5);
                                                break;
                                            case 3:
                                                do {
                                                    abaFuncionario(listAdmin, listVet);
                                                    optionFunc = reading.nextInt();
                                                    switch (optionFunc) {
                                                        case 0:
                                                            System.out.println("\nFinalizando o sistema. Até logo.");
                                                            optionAdmin = optionFunc;
                                                            optionLogin = optionAdmin;
                                                            option = optionLogin;
                                                            break;
                                                        case 1:
                                                            createFunc.inserirFunc(listAdmin, listVet);
                                                            break;
                                                        case 2:
                                                            readFunc.pesquisarFunc(listAdmin, listVet);
                                                            break;
                                                        case 3:
                                                            updateFunc.atualizarFunc(listAdmin, listVet);
                                                            break;
                                                        case 4:
                                                            deleteFunc.deletarFunc(listAdmin, listVet);
                                                            break;
                                                        case 5:
                                                            System.out.println("RETORNANDO PARA ABA ANTERIOR.");
                                                            break;
                                                        default:
                                                            System.out.println("OPÇÃO INVÁLIDA.");
                                                            break;
                                                    }
                                                } while (optionFunc != 0 && optionFunc != 5);
                                                break;
                                            case 4:
                                                do {
                                                    abaConsulta(listCliente, listAni, listAdmin, listVet, listConsulta);
                                                    optionCons = reading.nextInt();
                                                    switch (optionCons) {
                                                        case 0:
                                                            System.out.println("\nFinalizando o sistema. Até logo.");
                                                            optionAdmin = optionCons;
                                                            optionLogin = optionAdmin;
                                                            option = optionLogin;
                                                            break;
                                                        case 1:
                                                            createConsulta.inserirCons(listCliente, listAni, listVet,
                                                                    listConsulta);
                                                            abaConsulta(listCliente, listAni, listAdmin, listVet,
                                                                    listConsulta);
                                                            break;
                                                        case 2:
                                                            readConsulta.pesquisarCons(listConsulta);
                                                            abaConsulta(listCliente, listAni, listAdmin, listVet,
                                                                    listConsulta);
                                                            break;
                                                        case 3:
                                                            updateConsulta.atualizarCons(listConsulta);
                                                            abaConsulta(listCliente, listAni, listAdmin, listVet,
                                                                    listConsulta);
                                                            break;
                                                        case 4:
                                                            deleteConsulta.deletarCons(listConsulta);
                                                            abaConsulta(listCliente, listAni, listAdmin, listVet,
                                                                    listConsulta);
                                                            break;
                                                        case 5:
                                                            System.out.println("RETORNANDO PARA ABA ANTERIOR.");
                                                            break;
                                                        default:
                                                            System.out.println("OPÇÃO INVÁLIDA.");
                                                            break;
                                                    }
                                                } while (optionCons != 0 && optionCons != 5);
                                                break;
                                            default:
                                                System.out.println("OPÇÃO INVÁLIDA.");
                                                break;
                                        }
                                    }
                                    break;
                                case 3:
                                    menuVet();
                                    break;
                                default:
                                    System.out.println("OPÇÃO INVÁLIDA.");
                                    break;
                            }
                        }
                        break;
                    default:
                        System.out.println("\nOPÇÃO INVÁLIDA.");
                        break;
                }
            }
            reading.close();
        } catch (Exception e) {
            System.out.println("\nSISTEMA CAPTUROU UM ERRO, CUIDADO!.");
        }
    }
    // #endregion

    // #region INSERINDO FUNCIONÁRIOS
    public static void insereFuncionarios(List<Administrador> listAdmin, List<Veterinario> listVet) {
        // INSERINDO ADMINISTRADOR
        LocalDate aniver1 = LocalDate.of(1997, Month.JULY, 24);
        LocalDateTime dataAdmissao1 = LocalDateTime.now();
        Administrador admin = new Administrador();
        admin.setNome("Jose");
        admin.setRua("Rua 25 de Outubro, 180");
        admin.setCpf(1234L);
        admin.setTelefone(51986934715L);
        admin.setDataNasc(aniver1);
        admin.setDataAdmissao(dataAdmissao1);
        admin.setCodAdmin(GeraId.criaId());
        listAdmin.add(admin);

        // INSERINDO VETERINÁRIO
        LocalDate aniver2 = LocalDate.of(1999, Month.OCTOBER, 15);
        LocalDateTime dataAdmissao2 = LocalDateTime.now();
        Veterinario vet = new Veterinario();
        vet.setNome("Leonardo");
        vet.setRua("Rua 21 de Abril, 940");
        vet.setCpf(5678L);
        vet.setTelefone(51986934715L);
        vet.setDataNasc(aniver2);
        vet.setDataAdmissao(dataAdmissao2);
        vet.setCodVet(GeraId.criaId());
        listVet.add(vet);
    }
    // #endregion

    // #region HOME
    public static void home() {
        System.out.println("\n=======MENU=======\n");
        System.out.println("1 - Realizar Login");
        System.out.println("0 - Fechar Sistema");
        System.out.print("O que deseja fazer? ");
    }
    // #endregion

    // #region LOGIN E AUTENTICAÇÃO
    public static int login(List<Administrador> listAdmin, List<Veterinario> listVet) {
        Scanner reading = new Scanner(System.in);
        System.out.println("\n=======REALIZE O LOGIN=======\n");
        System.out.print("Insira seu nome: ");
        String nome = reading.nextLine();
        System.out.print("Insira seu CPF: ");
        long cpf = reading.nextLong();
        for (Administrador usersAdm : listAdmin) {
            if (usersAdm.getNome().equals(nome)) {
                if (usersAdm.getCpf() == cpf) {
                    System.out.println("\nLogin realizado com sucesso.");
                    System.out.printf("\nSeja Bem-vindo %s.\n", nome);
                    return 2;
                }
            }
        }
        for (Veterinario usersVet : listVet) {
            if (usersVet.getNome().equals(nome)) {
                if (usersVet.getCpf() == cpf) {
                    System.out.println("\nLogin realizado com sucesso.");
                    System.out.printf("\nSeja Bem-vindo %s.\n", nome);
                    return 3;
                }
            }
        }
        System.out.println("\nNome ou CPF inválidos.");
        System.out.print("\nDigite 0 para fechar ou 1 para tentar novamente: ");
        int option = reading.nextInt();
        return option;
    }
    // #endregion

    // #region MENU ADMINISTRADOR
    public static void menuAdmin() {
        System.out.println("\n=======VOCÊ ESTÁ LOGADO COMO ADMINISTRADOR=======\n");
        System.out.println("1 - Manter Cliente");
        System.out.println("2 - Manter Pet");
        System.out.println("3 - Manter Funcionário");
        System.out.println("4 - Manter Consulta");
        System.out.println("0 - Fechar Sistema");
        System.out.print("O que deseja fazer? ");
    }
    // #endregion

    // #region MENU VETERINÁRIO
    public static void menuVet() {
        System.out.println("\n=======VOCÊ ESTÁ LOGADO COMO VETERINÁRIO=======\n");
        System.out.println("NADA PARA FAZER AQUI.\n");
    }
    // #endregion

    // #region ABA CLIENTE
    public static void abaCliente(List<Cliente> listCliente, List<Animal> listAni) {
        System.out.println("\n=======ABA CLIENTE=======\n");
        System.out.println("1 - Incluir Cliente");
        System.out.println("2 - Pesquisar Cliente");
        System.out.println("3 - Atualiazar Cliente");
        System.out.println("4 - Deletar Cliente");
        System.out.println("5 - Voltar para Aba Anterior");
        System.out.println("0 - Fechar sistema");
        System.out.printf("O que deseja fazer? ");
    }
    // #endregion

    // #region ABA PET
    public static int abaPet(List<Cliente> listCliente, List<Animal> listAni) {
        Scanner reading = new Scanner(System.in);
        System.out.println("\n=======ABA PET=======\n");
        System.out.println("1 - Incluir Pet");
        System.out.println("2 - Pesquisar Pet");
        System.out.println("3 - Atualiazar Pet");
        System.out.println("4 - Deletar Pet");
        System.out.println("5 - Voltar para Aba Anterior");
        System.out.println("0 - Fechar sistema\n");
        System.out.printf("O que deseja fazer? ");
        int option = reading.nextInt();
        return option;
    }
    // #endregion

    // #region ABA FUNCIONÁRIO
    public static void abaFuncionario(List<Administrador> listAdmin, List<Veterinario> listVet) {
        System.out.println("\n=======ABA FUNCIONÁRIO=======\n");
        System.out.println("1 - Incluir Funcionário");
        System.out.println("2 - Pesquisar Funcionário");
        System.out.println("3 - Atualiazar Funcionário");
        System.out.println("4 - Deletar Funcionário");
        System.out.println("5 - Voltar para Aba Anterior");
        System.out.println("0 - Fechar sistema\n");
        System.out.printf("O que deseja fazer? ");
    }
    // #endregion

    // #region ABA CONSULTA
    public static void abaConsulta(List<Cliente> listCliente, List<Animal> listAni, List<Administrador> listAdmin,
            List<Veterinario> listVet, List<Consulta> listConsulta) {
        System.out.println("\n=======ABA CONSULTA=======\n");
        System.out.println("1 - Incluir Consulta");
        System.out.println("2 - Pesquisar Consulta");
        System.out.println("3 - Atualiazar Consulta");
        System.out.println("4 - Deletar Consulta");
        System.out.println("5 - Voltar para Aba Anterior");
        System.out.println("0 - Fechar sistema");
        System.out.printf("O que deseja fazer? ");
    }
    // #endregion

}