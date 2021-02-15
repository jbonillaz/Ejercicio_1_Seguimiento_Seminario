import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        IngresoTeclado in = new IngresoTeclado();

        String numeroTarjeta = in.getString("Por favor ingrese el numero de su tarjeta sin letras, espacios y/o caracteres especiales.");

        String a = numeroTarjeta.substring(0, 4);
        String b = numeroTarjeta.substring(12, 16);
        String c = numeroTarjeta.substring(0, 4);
        String d = numeroTarjeta.substring(12, 16);

        System.out.println(a + c.replace(c, " XXXX ") + d.replace(d, "XXXX ") + b);

    }
}


