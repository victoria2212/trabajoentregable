package tallerGuia5;

public class Bien {
	static int id=0;
	String alias; 
	String descripcion;
	double precio;
	Responsable responsable;
	
	public Bien(String alias,String descripcion, double precio, Responsable responsable) {
		Bien.id = id +1;
		this.alias = alias;
		this.descripcion= descripcion;
		this.precio= precio;
		this.responsable= responsable;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Bien.id = id;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}
	
	
}
