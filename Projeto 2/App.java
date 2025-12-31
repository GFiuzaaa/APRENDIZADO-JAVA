import java.util.Scanner;



public class App 
{
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\r\n]+");

        int a, b;
        double c;
        String op;

        System.out.println("Digite o 1o numero: ");
        a = sc.nextInt();

        System.out.println("Digite o 2o numero: ");
        b = sc.nextInt();

        System.out.println("Qual operação deseja fazer (+, -, * ou /): ");
        op = sc.next();

        
        sc.close();

    // .equals significa comparação de strings, é tipo um ==

        if ("+".equals(op)) {

            c = a+b;
            System.out.println("Resultado: "+ c);

        }

        else if ("-".equals(op)) {

            c = a-b;
            System.out.println("Resultado: "+ c);

        }

        else if ("*".equals(op)) {

            c = a*b;
            System.out.println("Resultado: "+ c);

        }
        else if ("/".equals(op)) {

            if (b != 0) {
            c = (double) a/b;
            System.out.println("Resultado: "+ c);
            }
            else System.out.println("Erro, divisao por 0!");

        }
        else System.out.println("Operação invalida");
        
    }
}
