import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\r\n]+");

        System.out.print("Digite o nome do titular: ");
        String nome = sc.nextLine();

        ContaBancaria conta = new ContaBancaria(nome);


        int op = 0;

        while (op != 5) {

            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Mostrar saldo");
            System.out.println("4 - Numero de operações feitas");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opcao: ");

            op = sc.nextInt();
            
            switch (op) {

                case 1:
                    System.out.println("Quanto deseja depositar: ");
                    double dep = sc.nextDouble();
                    conta.deposito(dep);
                break;
            
                case 2:
                    System.out.println("Quanto deseja sacar: ");
                    double saq = sc.nextDouble();
                    conta.sacar(saq);
                break;

                case 3: 
                conta.showsaldo();
                break;

                case 4:
                    System.out.println("Numero de operações feitas: " + conta.getOps());
                    break;
case 5:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida.");

            }
        }

sc.close();
    }

}

