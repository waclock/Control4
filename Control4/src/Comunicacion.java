
public class Comunicacion {
	private Animal animal;
	
	public Comunicacion(Animal a) {
		animal = a;
	}
	
	public String getEstado() {
		return animal.getEstado().toLowerCase();
	}
}
