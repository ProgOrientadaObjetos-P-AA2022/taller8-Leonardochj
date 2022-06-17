package paquete1;

public class DocenteNombramiento extends Docente {

    double valorSueldo;
    double valorHoraExtra;
    int numeroHorasExtras;
    double sueldoTotal;

    public void establecerValorSueldo(double valor) {
        valorSueldo = valor;
    }

    public void establecerValorHoraExtra(double valor) {
        valorHoraExtra = valor;
    }

    public void establecerNumeroHorasExtras(int valor) {
        numeroHorasExtras = valor;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = valorSueldo + (numeroHorasExtras * valorHoraExtra);
    }

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public double obtenerValorHoraExtra() {
        return valorHoraExtra;
    }

    public int obtenerNumeroHorasExtras() {
        return numeroHorasExtras;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    @Override
    public String toString() {
        String reporte = String.format("Nombre del Profesor: %s\n"
                + "Identificacion: %s\n"
                + "Sueldo del docente: %.2f\n"
                + "Costo de hora extra: %.2f\n"
                + "Numero de horas extras: %d\n"
                + "Costo total: %.2f\n",
                obtenerNombreDocente(),
                obtenerCedulaDocente(),
                obtenerValorSueldo(),
                obtenerValorHoraExtra(),
                obtenerNumeroHorasExtras(),
                obtenerSueldoTotal());
        return reporte;
    }

}
