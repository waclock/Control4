
public  class Madre {


	public static Gato crearGato(String nombre,String color){
		return new Gato(nombre,color);
	}
	public static Perro crearPerro(String nombre,boolean cola){
		return new Perro(nombre,cola);
	}

}
