package tallerGuia5;

import java.util.ArrayList;
import java.util.List;
public class Proveedor {
	static int id=0;
	String nombre;
	Localidad localidad;
	List<Bien> listaBienes;
	ArrayList<Factura> listaFacturas;
	
	public ArrayList<Factura> getListaFacturas() {
		return listaFacturas;
	}

	public void setListaFacturas(ArrayList<Factura> listaFacturas) {
		this.listaFacturas = listaFacturas;
	}

	public Proveedor(){
		listaBienes = new ArrayList<>();
		listaFacturas = new ArrayList<>();
	}
	
	public Proveedor (String nombre, Localidad localidad,Bien b) {
		Proveedor.id = id+1;
		this.localidad= localidad;
		this.nombre= nombre;
		listaBienes.add(b);
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Proveedor.id = id;
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

	public List<Bien> getListaBienes() {
		return listaBienes;
	}

	public void setListaBienes(List<Bien> listaBienes) {
		this.listaBienes = listaBienes;
	}
	
	public Provincia getProvincia() {
		Provincia provProv= this.getLocalidad().getProvincia();
		return provProv;
	}
	public Pais getPais() {
		Pais paisProv= this.getLocalidad().getProvincia().getPais();
		return paisProv;
	}
	public double descuento(List<Bien> listb) {
		double desc=0;
		int cant = listb.size();
		if (cant >=5) {desc=0.1;}
			else if(cant>10) desc=0.2;
		return desc;
	}
	
	public void asociarFacturaProveedor(Factura factura) {
		listaFacturas.add(factura);
	}
	
}
