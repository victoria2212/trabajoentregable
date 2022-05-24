package tallerGuia5;

import java.util.ArrayList;

public class Responsable {
	static int id =0;
	String nombre;
	Localidad localidad;
	String oficina;
	ArrayList<Factura> listaFacturas;
	
	
	public ArrayList<Factura> getListaFacturas() {
		return listaFacturas;
	}

	public void setListaFacturas(ArrayList<Factura> listaFacturas) {
		this.listaFacturas = listaFacturas;
	}

	public Responsable(String nombre, Localidad localidad, String oficina) {
		this.localidad= localidad;
		this.oficina= oficina;
		this.nombre= nombre;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Responsable.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}
	public Provincia getProvincia() {
		Provincia provResp= this.getLocalidad().getProvincia();
		return provResp;
	}
	public Pais getPais() {
		Pais paisResp= this.getLocalidad().getProvincia().getPais();
		return paisResp;
	}
	
	public void asociarFacturaResponsable(Factura factura) {
		listaFacturas.add(factura);
	}
	
}
