
public  class Madre {


	public Gato crearGato(String nombre,String color){
		return new Gato(nombre,color);
	}
	public Perro crearPerro(String nombre){
		return new Perro(nombre);
	}

}
