public class Billetera {
double balanceTotal;
String = "USD";
String titular;
boolean cuentaActiva = true;
public Billetera(String titular, double saldoInicial) {
this.titular = titular;
this.balanceTotal = saldoInicial;
}

public void transferir(double monto) {

    if(monto>balanceTotal){
        System.out.println("Fondos insuficientes");
        return balanceTotal;
    }
balanceTotal = balanceTotal - (monto*1.05);
System.out.println("Transferencia exitosa de:$ " + monto);
}


public void mostrarSaldo() {
System.out.println("Saldo de " + titular + ": $" + balanceTotal);
}
}