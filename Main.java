import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args)
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String nombre;
        String apellido;
        String sexo;
        double salario;
        double montoDelPrestamo;

        System.out.println("Solicitud de Prestamo del Cliente:");

        try
        {
            System.out.println("Introduzca el nombre del cliente:");
            nombre = bufferedReader.readLine();

            System.out.println("Introduzca el apellido del cliente:");
            apellido = bufferedReader.readLine();

            System.out.println("Introduzca el sexo del cliente:");
            sexo = bufferedReader.readLine();

            System.out.println("Introduzca el apellido del cliente:");
            salario = Double.parseDouble(bufferedReader.readLine());

            System.out.println("Introduzca el monto de del prestamo");
            montoDelPrestamo = Double.parseDouble(bufferedReader.readLine());

        } catch (NumberFormatException e)
        {
            System.out.println("El dato introducido no es un número");
        } catch (IOException e)
        {
            System.out.println("Hubo algun tipo de error");
        }

        // A futuro cuando este:
        // Clientes cliente = new Cliente(nombre, apellido, sexo, salario, montoDelPrestamo);

    }
}
