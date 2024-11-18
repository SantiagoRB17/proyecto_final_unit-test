package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Representa un alquiler de un vehículo en el sistema, que es una transacción que incluye
 * la fecha de entrega del vehículo, la fecha de devolución y el cálculo del costo total
 * del alquiler basado en los días de uso del vehículo.
 * Esta clase extiende de la clase `Transaccion`.
 */
public class Alquiler extends Transaccion {

    /**
     * Atributo que almacena el total del alquiler, calculado en base a los días de alquiler y el precio diario del vehículo.
     */
    private double total;

    /**
     * Atributo que almacena la fecha de devolución del vehículo.
     */
    private LocalDate FechaDevolucionVehiculo;

    /**
     * Constructor de la clase Alquiler, que inicializa los atributos del alquiler y calcula el total.
     * 
     * @param codigo El código del alquiler.
     * @param fechaEntrega La fecha de entrega del vehículo.
     * @param empleado El empleado encargado del alquiler.
     * @param vehiculo El vehículo alquilado.
     * @param FechaDevolucionVehiculo La fecha de devolución del vehículo.
     * @throws PrecioVehiculoVacioException Si el precio del vehículo es 0 o no está establecido.
     */
    public Alquiler(int codigo, LocalDate fechaEntrega, Empleado empleado, Vehiculo vehiculo,
            LocalDate FechaDevolucionVehiculo) throws PrecioVehiculoVacioException {
        super(codigo, fechaEntrega, empleado, vehiculo);
        this.FechaDevolucionVehiculo = FechaDevolucionVehiculo;
        this.total = calcularTotal();
    }

    /**
     * Obtiene el total del alquiler.
     * 
     * @return El total del alquiler.
     */
    public double getTotal() {
        return total;
    }

    /**
     * Establece el total del alquiler.
     * 
     * @param total El nuevo total del alquiler.
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * Obtiene la fecha de devolución del vehículo.
     * 
     * @return La fecha de devolución del vehículo.
     */
    public LocalDate getFechaDevolucionVehiculo() {
        return FechaDevolucionVehiculo;
    }

    /**
     * Establece la fecha de devolución del vehículo.
     * 
     * @param fechaDevolucionVehiculo La nueva fecha de devolución del vehículo.
     */
    public void setFechaDevolucionVehiculo(LocalDate fechaDevolucionVehiculo) {
        FechaDevolucionVehiculo = fechaDevolucionVehiculo;
    }

    /**
     * Calcula el total del alquiler basándose en el precio diario del vehículo y la cantidad de días de alquiler.
     * 
     * @return El total calculado del alquiler.
     * @throws PrecioVehiculoVacioException Si el precio de alquiler del vehículo es 0 o no está establecido.
     * @throws IllegalArgumentException Si la fecha de entrega es posterior a la fecha de devolución.
     */
    @Override
    public double calcularTotal() throws PrecioVehiculoVacioException {
        // Verificar si el precio de alquiler es vacío o cero
        if (vehiculo.getPrecioDiaAlquiler() == 0) {
            throw new PrecioVehiculoVacioException(
                    "El precio de alquiler del vehículo está vacío o no está establecido.");
        }

        // Convertir fechas a número de días (LocalDate a int)
        int diasAlquiler = (int) ChronoUnit.DAYS.between(fechaEntregaVehiculo, FechaDevolucionVehiculo);

        // Verificar que la fecha de devolución sea posterior a la fecha de entrega
        if (diasAlquiler <= 0) {
            throw new IllegalArgumentException("La fecha de inicio debe ser anterior a la fecha de fin.");
        }

        // Calcular el costo total
        return vehiculo.getPrecioDiaAlquiler() * diasAlquiler;
    }

    /**
     * Devuelve una representación en cadena de texto del objeto Alquiler, incluyendo el total calculado.
     * 
     * @return Una cadena que contiene los detalles del alquiler.
     */
    @Override
    public String toString() {
        return "Alquiler: " + super.toString() + ", total=" + total;
    }
}
