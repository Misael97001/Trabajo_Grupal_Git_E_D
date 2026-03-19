public class Billetera {
<<<<<<< HEAD
double balanceTotal;
=======
double saldo;
String moneda= "USD";
>>>>>>> 72c642498ded48dfa6a80f0dd62611317b813257
String titular;
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