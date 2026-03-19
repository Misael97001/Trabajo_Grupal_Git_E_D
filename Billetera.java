public class Billetera {
double balanceTotal;
String titular;
public Billetera(String titular, double saldoInicial) {
this.titular = titular;
this.balanceTotal = saldoInicial;
}

public void transferir(double monto) {
    if(monto>balanceTotal){
        System.out.println("Fondos insuficientes");
        return balanceTotal;
    }
balanceTotal = balanceTotal - monto;
}


public void mostrarSaldo() {
System.out.println("Saldo de " + titular + ": $" + balanceTotal);
}
}