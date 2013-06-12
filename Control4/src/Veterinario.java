
public class Veterinario {

	String nombre;
	
	public Veterinario(String nombre) {
		this.nombre = nombre;
	}
	
	public String curar(Animal animal) {
		Comunicacion c = new Comunicacion(animal);
		return c.getEstado();	
	}

}
