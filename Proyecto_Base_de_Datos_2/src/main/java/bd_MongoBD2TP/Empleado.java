package bd_MongoBD2TP;


public class Empleado {
	
	private int cuil;
	private int dni;
	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	private boolean encargado;
	private String obraSocial;
	private int nroAfiliado;
	private Sucursal sucursal;
	
	public Empleado(int cuil, int dni, String nombre, String apellido, Domicilio domicilio, boolean encargado,
			String obraSocial, int nroAfiliado, Sucursal sucursal) {
		super();
		this.cuil = cuil;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.encargado = encargado;
		this.obraSocial = obraSocial;
		this.nroAfiliado = nroAfiliado;
		this.sucursal = sucursal;
	}

	public int getCuil() {
		return cuil;
	}

	public void setCuil(int cuil) {
		this.cuil = cuil;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public boolean isEncargado() {
		return encargado;
	}

	public void setEncargado(boolean encargado) {
		this.encargado = encargado;
	}

	public String getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}

	public int getNroAfiliado() {
		return nroAfiliado;
	}

	public void setNroAfiliado(int nroAfiliado) {
		this.nroAfiliado = nroAfiliado;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
}
