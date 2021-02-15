import java.util.Scanner;

public class IngresoTeclado {

    Scanner entrada;//objeto

    public IngresoTeclado(){//constructor de la clase Teclado

        entrada = new Scanner(System.in);

    }

    public String getString(String titulo){//para devolver una cadena, ingresada por el usuario.

        String cadena = "";

        while(cadena.equals("")){

            System.out.println(titulo);
            cadena = entrada.nextLine();//45

            if(!cadena.matches("[0-9]{0,16}")){
                cadena = "";

            }

        }

        return cadena;

    }

}
