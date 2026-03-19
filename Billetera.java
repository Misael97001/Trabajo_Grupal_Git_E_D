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
balanceTotal = balanceTotal - (monto*1.05);
}
public void mostrarSaldo() {
System.out.println("Saldo de " + titular + ": $" + saldo);
}
}