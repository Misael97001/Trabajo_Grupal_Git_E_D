public class Billetera {
double saldo;
String = "USD";
String titular;
boolean cuentaActiva = true;
public Billetera(String titular, double saldoInicial) {
this.titular = titular;
this.balanceTotal = saldoInicial;
}
public void transferir(double monto) {
balanceTotal = balanceTotal - monto;
}
public void mostrarSaldo() {
System.out.println("Saldo de " + titular + ": $" + saldo);
}
}