package tallerGuia5;

public interface CriterioBusqueda<T> {
	
	public default boolean esDeLocalidad(Localidad l) {
		return esDeLocalidad(l);
	}
}
