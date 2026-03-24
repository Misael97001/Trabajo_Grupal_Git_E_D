import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Billetera miBilletera = new Billetera("Juan Perez", 100.0);
miBilletera.mostrarSaldo();

miBilletera.transferir(20.0);
miBilletera.transferir(30.0);
miBilletera.transferir(40.0);

miBilletera.mostrarSaldo();


Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuánto desea transferir? ");
        double montoUsuario = scanner.nextDouble();
        miBilletera.transferir(montoUsuario);
        miBilletera.mostrarSaldo();
        scanner.close();

        
Billetera billetera2 = new Billetera("Maria Lopez", 500.0);
billetera2.mostrarSaldo();

}
}
