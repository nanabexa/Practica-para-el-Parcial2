import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args)
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String nombre = "";
        String sexo = "";
        double salario = 0;
        double montoDelPrestamo = 0;

        System.out.println("Solicitud de Prestamo del Cliente:");

        try
        {
            System.out.println("Introduzca el nombre del cliente:");
            nombre = bufferedReader.readLine();

            System.out.println("Introduzca el sexo del cliente");
            System.out.println("Tiene que escribir \"hombre\" o \"mujer\"");
            sexo = bufferedReader.readLine();

            System.out.println("Introduzca el salario del cliente:");
            salario = Double.parseDouble(bufferedReader.readLine());

            System.out.println("Introduzca el monto de del prestamo");
            montoDelPrestamo = Double.parseDouble(bufferedReader.readLine());

        }
        catch (NumberFormatException e)
        {
            System.out.println("El dato introducido no es un número");
        }
        catch (IOException e)
        {
            System.out.println("Hubo algun tipo de error");
        }

        Cliente cliente = new Cliente(nombre, sexo, salario, montoDelPrestamo);


    }
}
