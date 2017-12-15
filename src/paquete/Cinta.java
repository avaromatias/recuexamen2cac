package paquete;

public class Cinta {

	public double caloriasQuemadas(Persona unaPersona, double distancia) {
		return unaPersona.getPeso() * distancia;
	}
	
	public double velocidadMedia(double distancia, double tiempo) {
		return distancia / tiempo;
	}
	
}