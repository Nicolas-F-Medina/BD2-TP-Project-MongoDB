package bd_MongoBD2TP;

import java.time.LocalDate;


public class Venta {
	
	private int numeroTicket;
	private LocalDate fecha;
	private Empleado empleadoAtencion;
	private Empleado empleadoCobro;
	private Cliente cliente;
	private String metodoPago;
	
	public Venta(int numeroTicket, LocalDate fecha, Empleado empleadoAtencion, Empleado empleadoCobro,
			Cliente cliente, String metodoPago) {
		super();
		this.numeroTicket = numeroTicket;
		this.fecha = fecha;
		this.empleadoAtencion = empleadoAtencion;
		this.empleadoCobro = empleadoCobro;
		this.cliente = cliente;
		this.metodoPago=metodoPago;
	}

	public int getNumeroTicket() {
		return numeroTicket;
	}

	public void setNumeroTicket(int numeroTicket) {
		this.numeroTicket = numeroTicket;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Empleado getEmpleadoAtencion() {
		return empleadoAtencion;
	}

	public void setEmpleadoAtencion(Empleado empleadoAtencion) {
		this.empleadoAtencion = empleadoAtencion;
	}

	public Empleado getEmpleadoCobro() {
		return empleadoCobro;
	}

	public void setEmpleadoCobro(Empleado empleadoCobro) {
		this.empleadoCobro = empleadoCobro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}
}
