public class Perro extends Animal{
	public boolean cola;
	public Perro(String nombre, boolean cola){
		this.nombre=nombre;
		this.cola=cola;
	}

	@Override 
	public String hablar(){
		return "Guau!";
	}

}