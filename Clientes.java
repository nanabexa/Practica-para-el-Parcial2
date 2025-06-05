public class Clientes {
    String nombreCliente;
    String sexoCliente;
    double salarioCliente;
    double montoPrestamoCliente;

    public Clientes() {
        this.nombreCliente = "";
        this.sexoCliente = "";
        this.salarioCliente = 0.0;
        this.montoPrestamoCliente = 0.0;
    }

    //Metodos getters
    public String getNombreCliente() {
        return nombreCliente;
    }
    public String getSexoCliente() {
        return sexoCliente;
    }
    public double getSalarioCliente() {
        return salarioCliente;
    }
    public double getMontoPrestamoCliente() {
        return montoPrestamoCliente;
    }

    //Metodos setters
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }
    public void setSalarioCliente(double salarioCliente) {
        this.salarioCliente = salarioCliente;
    }
    public void setMontoPrestamoCliente(double montoPrestamoCliente) {
        this.montoPrestamoCliente = montoPrestamoCliente;
    }











}
