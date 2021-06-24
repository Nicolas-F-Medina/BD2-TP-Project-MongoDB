package bd_MongoBD2TP;
import java.time.LocalDate;
import java.util.List;


public class Venta {
	
	private String numeroTicket;
	private LocalDate fecha;
	private Empleado empleadoAtencion;
	private Empleado empleadoCobro;
	private Cliente cliente;
	private String metodoPago;
	private List<Producto> productosVendidos;
	
	public Venta(String numeroTicket, LocalDate fecha, Empleado empleadoAtencion, Empleado empleadoCobro,
			Cliente cliente, String metodoPago, List<Producto> productosVendidos) {
		super();
		this.numeroTicket = numeroTicket;
		this.fecha = fecha;
		this.empleadoAtencion = empleadoAtencion;
		this.empleadoCobro = empleadoCobro;
		this.cliente = cliente;
		this.metodoPago=metodoPago;
		this.productosVendidos= productosVendidos;
	}

	public String getNumeroTicket() {
		return numeroTicket;
	}

	public void setNumeroTicket(String numeroTicket) {
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

	public List<Producto> getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(List<Producto> productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	@Override
	public String toString() {
		return "Venta [numeroTicket=" + numeroTicket + ", productosVendidos=" + productosVendidos + "]";
	}

	
	
	
}
