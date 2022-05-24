package tallerGuia5;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	List <Responsable> responsables;
	List <Proveedor> proveedores;
	ArrayList <Bien> bienes;
	List <Factura> facturas;
	Proveedor proveedor;
	Responsable responsable;
	Factura factura;
	Bien b;
	
	public Empresa() {
		responsables = new ArrayList<>();
		proveedores = new ArrayList<>();
		bienes = new ArrayList<>();
		facturas = new ArrayList<>();
	}
	
	public List<Responsable> getResponsables() {
		return responsables;
	}

	public void setResponsables(List<Responsable> responsables) {
		this.responsables = responsables;
	}

	public Responsable getResponsable() {
		return responsable;
	}



	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	public double calcularMontoTotal(Factura factura) {
		double monto =0,descuento =0;
		
		monto= factura.calcularMontoTotal();
		
		descuento= factura.proveedor.descuento(factura.listaBienes);
		
		return monto-=monto*descuento;
	}
	
	public void compra(Proveedor p, Responsable r,List<Bien> bienes) {
		factura = new Factura();
		try {factura.asociarRespyProv(responsable,proveedor);
		}catch(Exception e) {
			System.out.println("El proveedor no puede proveer el bien debido a que no se encuentran en el mismo pais");
			}
		try {
			factura.agregarBienes(bienes);
		}catch (Exception e1) {
			System.out.println("No pueden agregarse mas bienes");
		}
		facturas.add(factura);
	}
	
	ArrayList<Factura> listarFacturaByProveedor(Proveedor p) {
		return (ArrayList<Factura>) p.getListaFacturas();
	}
	
	ArrayList<Factura> listarFacturaByResponsable(Responsable r){
		return (ArrayList<Factura>) r.getListaFacturas();
	}
	/* Se debe poder listar todos 
	los bienes con un precio mayor a un valor pasado por parámetros */	
	ArrayList<Bien> listarBienesByPrecioMayor(Double precioMayor){
		ArrayList<Bien> bienes2;
		bienes2= new ArrayList<>();
		for (Bien b: bienes){
			double precioBien=0;
			precioBien = b.getPrecio();
			if(precioBien > precioMayor) {
				bienes2.add(b);
			}
		}

		return sort(bienes2);
		
	}

	private ArrayList<Bien> sort(ArrayList<Bien> bienes2) {
		// TODO Auto-generated method stub
		return bienes2;
	} 
	
}

