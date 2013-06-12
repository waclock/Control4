
public class Comunicacion {
	private Animal animal;
	
	public Comunicacion(Animal a) {
		
	}
	
	public String getEstado() {
		return animal.getEstado().toLowerCase();
	}
}
