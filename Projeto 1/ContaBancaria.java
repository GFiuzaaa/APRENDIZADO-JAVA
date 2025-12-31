public class ContaBancaria {
    
String titular;
double saldo;
int ops;

public ContaBancaria(String titular){
    this.titular = titular;
    this.saldo = 0.0;
    ops = 0;
}

public void deposito(double valor) {

    if (valor <= 0) {
        System.out.println("Erro: valor de deposito invalido.");
        return;
    }

    if (saldo + valor > 10000) {
        System.out.println("Erro: limite maximo de R$ 10.000 excedido.");
        return;
    }

    saldo += valor;
    System.out.println("Deposito bem sucedido!");
    ops++;
}


public void sacar(double valor){


    if (valor <= 0) {
            System.out.println("Erro: valor de saque invalido.");
            return;
        }

    if (valor > saldo) {
        System.out.println("Erro, nao e possivel sacar mais do que voce tem!");
        return;
    }

    

    saldo -= valor;
    System.out.println("Saque bem sucedido!");
    ops++;
}

public void showsaldo(){
    System.out.println("Titular: " + titular);
    System.out.println("Saldo: R$: " + saldo);
}

public int getOps()
{
    return ops;
}


}