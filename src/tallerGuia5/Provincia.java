package tallerGuia5;

public class Provincia {
	static int id=0;
	String nombre;
	Pais pais;
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public Provincia(String nombre) {
		this.nombre= nombre;
		id= id+1;
	}
}
