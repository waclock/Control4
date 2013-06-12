public class Gato extends Animal{
	public String color;
	public Gato(String nombre,String color){
		this.nombre=nombre;
		this.color=color;
	}
	@Override
	public String hablar(){
		return "miau";
	}
}