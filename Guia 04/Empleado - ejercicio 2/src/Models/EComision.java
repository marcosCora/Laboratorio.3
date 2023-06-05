package Models;

public class EComision extends Empleado {


    private int numClientes;
    private int valorPorCliente;

    public EComision( String nombre, String apellido, int dni, int anioIngreso, int salario, int numClientes, int valorPorCliente) {
        super(dni, nombre, apellido, anioIngreso, salario);
        this.numClientes = numClientes;
        this.valorPorCliente = valorPorCliente;
    }


    public int getNumClientes() {
        return numClientes;
    }

    public void setNumClientes(int numClientes) {
        this.numClientes = numClientes;
    }

    public int getValorPorCliente() {
        return valorPorCliente;
    }

    public void setValorPorCliente(int valorPorCliente) {
        this.valorPorCliente = valorPorCliente;
    }

    @Override
    public String toString() {
        ///String Empleado = super.toString();
        return super.toString() +
                "\nNumero clientes: " + numClientes +
                "\nValor por cliente: " + valorPorCliente + "\n\n";
    }

    @Override
    public float calculoSalario(float salario) {

        int salarioComision = numClientes*valorPorCliente;
        if(salario < salarioComision)
        {
            salario = salarioComision;
        }

        return salario;
    }
}
