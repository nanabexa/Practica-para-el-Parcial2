public class Cliente {
    String nombre;
    String sexo;
    double salario;
    double montoPrestamo;

    public Cliente(String nombre, String sexo, double salario, double montoPrestamo) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.salario = salario;
        this.montoPrestamo = montoPrestamo;
    }

    //Metodos getters
    public String getNombre() {
        return nombre;
    }
    public String getSexo() {
        return sexo;
    }
    public double getSalario() {
        return salario;
    }
    public double getMontoPrestamo() {
        return montoPrestamo;
    }

    //Metodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setMontoPrestamo(double montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }











}
