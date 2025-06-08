public class Cliente
{
    String nombre;
    String sexo;
    double salario;
    double montoPrestamo;

    public Cliente(String nombre, String sexo, double salario, double montoPrestamo)
    {
        this.nombre = nombre;
        this.sexo = sexo;
        this.salario = salario;
        this.montoPrestamo = montoPrestamo;
    }

    //Metodos getters
    public String getNombre()
    {
        return nombre;
    }
    public String getSexo()
    {
        return sexo;
    }
    public double getSalario()
    {
        return salario;
    }
    public double getMontoPrestamo()
    {
        return montoPrestamo;
    }

    //Metodos setters
    public void setNombre(String nombre) throws IllegalArgumentException
    {
        if (nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+"))
        {
            this.nombre = nombre;
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }
    public void setSexo(String sexo) throws IllegalArgumentException
    {
        sexo = sexo.trim().toLowerCase();

        // Aquí recordar verificar esto si funciona.
        if (sexo.matches("hombre|mujer"))
        {
            this.sexo = sexo;
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }
    public void setSalario(double salario) throws NumberFormatException
    {
        if (salario > 0)
        {
            this.salario = salario;
        }
        else
        {
            throw new NumberFormatException();
        }
    }
    public void setMontoPrestamo(double montoPrestamo) throws NumberFormatException
    {
        if (montoPrestamo > 0)
        {
            this.montoPrestamo = montoPrestamo;
        }
        else
        {
            throw new NumberFormatException();
        }
    }











}
