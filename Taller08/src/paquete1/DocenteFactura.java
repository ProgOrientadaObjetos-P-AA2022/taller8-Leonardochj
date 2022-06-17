package paquete1;

public class DocenteFactura extends Docente {

    double valorFactura;
    int ivaDescuento;
    double valorCancelar;

    public void establecerValorFactura(double valor) {
        valorFactura = valor;
    }

    public void establecerIvaDescuento(int valor) {
        ivaDescuento = valor;
    }

    public void calcularValorCancelar() {
        valorCancelar = valorFactura + (valorFactura * ivaDescuento)/100;
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public int obtenerIvaDescuento() {
        return ivaDescuento;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {
        String reporte = String.format("Nombre del Profesor: %s\n"
                + "Identificacion: %s\n"
                + "Costo factura: %.2f\n"
                + "Valor del Iva: %d\n"
                + "Costo a cancelar: %.2f\n",
                obtenerNombreDocente(),
                obtenerCedulaDocente(),
                obtenerValorFactura(),
                obtenerIvaDescuento(),
                obtenerValorCancelar());
        return reporte;
    }

}
