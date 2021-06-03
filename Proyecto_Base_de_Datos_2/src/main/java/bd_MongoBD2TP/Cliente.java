package bd_MongoBD2TP;

public class Cliente {
	
	private int dni;
	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	private String obraSocial;
	private int nroAfiliado;
	
	public Cliente(int dni, String nombre, String apellido, Domicilio domicilio, String obraSocial, int nroAfiliado) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.obraSocial = obraSocial;
		this.nroAfiliado = nroAfiliado;
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
}
