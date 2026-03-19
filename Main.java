public class Main {
public static void main(String[] args) {
Billetera miBilletera = new Billetera("Juan Perez", 100.0);
miBilletera.mostrarSaldo();

miBilletera.transferir(20.0);
miBilletera.transferir(30.0);
miBilletera.transferir(40.0);

miBilletera.mostrarSaldo();
}
}
