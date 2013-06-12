
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Animal p = Madre.crearPerro("Fido",true); //Abstract Factor
		Animal g = Madre.crearGato("Felix","rojo");

		p.setEstado("perfecto");
		g.setEstado("enfermo");

		System.out.println(p.hablar());
		System.out.println(g.hablar());

		Veterinario v = new Veterinario("vet");
		System.out.println(v.curar(g)); //Adapter

		JsonMagic.push((Perro)p); //Memento
		JsonMagic.push((Gato)g);



	}

}
