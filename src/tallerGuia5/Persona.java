package tallerGuia5;

public abstract class Persona implements CriterioBusqueda<Object> {
	Localidad localidad;
	
	public Persona (Localidad l) {
		this.localidad= l;
	}
	
	public boolean  esDeLocalidad(Localidad l) {
		boolean equals = localidad.getClass().equals(l);
		boolean prov = localidad.getProvincia().nombre.equals(l.getProvincia().nombre);
		boolean pais = localidad.getProvincia().getPais().nombre.equals(l.getProvincia().getPais().nombre);
		boolean r= equals && prov && pais;
		return r;
	}
	
	
}