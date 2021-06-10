package bd_MongoBD2TP;

import java.util.ArrayList;
import java.util.List;


public class Producto {
	
	private int codigoNumerico;
	private String tipo;
	private String descripcion;
	private float precio;
	private String laboratorio;
	private List<Producto> listProductos;
	
	
	public Producto(int codigoNumerico, String tipo, String descripcion, float precio, String laboratorio) {
		super();
		this.codigoNumerico = codigoNumerico;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.laboratorio = laboratorio;
		this.listProductos = new ArrayList<Producto>();
		
	}
	
	public int getCodigoNumerico() {
		return codigoNumerico;
	}
	public void setCodigoNumerico(int codigoNumerico) {
		this.codigoNumerico = codigoNumerico;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	public List<Producto> getListProductos() {
		return listProductos;
	}
	public void setListProductos(List<Producto> listProductos) {
		this.listProductos = listProductos;
	}

	
}
