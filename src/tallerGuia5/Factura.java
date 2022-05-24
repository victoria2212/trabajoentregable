package tallerGuia5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
	static int id=0;
	double monto_total=0;
	List<Bien> listaBienes;
	Responsable responsable;
	Proveedor proveedor;
	Date fecha;
	
	
	public void asociarRespyProv(Responsable responsable, Proveedor proveedor) throws Exception {
			if(proveedor.getPais()!= responsable.getPais()) {
				throw new Exception();
			}
			else {
				this.proveedor = proveedor;
				this.responsable = responsable;
				proveedor.asociarFacturaProveedor(this);
				responsable.asociarFacturaResponsable(this);
			}
	}
	
	
	public Factura () {
		listaBienes = new ArrayList<>();
		id = id+1;
		fecha = new Date();
		responsable = null;
		proveedor = null;
		
	}
	public List<Bien> getListaBienes() {
		return listaBienes;
	}

	public void setListaBienes(List<Bien> listaBienes) {
		this.listaBienes = listaBienes;
	}
	
	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public void agregarBienes(List<Bien> listaB) throws Exception{
			if(listaBienes.size()>=20) throw new Exception();
			else listaBienes.addAll(listaB);
	}
	
	public double calcularMontoTotal(){
		double monto=0;
		for (Bien b: listaBienes) {
			monto += b.getPrecio(); 
			}
		if(this.proveedor.getProvincia() == this.responsable.getProvincia()) {
			if(this.proveedor.getLocalidad() == this.responsable.getLocalidad()) { 
				monto += monto*0.1; 
		}
			else monto += monto*0.3;
			}
		else monto += monto*0.7;
		
		return monto;}
	
	
}
