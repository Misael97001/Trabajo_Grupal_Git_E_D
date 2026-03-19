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

System.out.println("Transferencia exitosa de:$ " + monto);
}
public void mostrarSaldo() {
System.out.println("Saldo de " + titular + ": $" + saldo);
}
}