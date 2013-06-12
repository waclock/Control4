public class Animal{
	public String nombre;
	public String estado;

	public String hablar(){
		return "HOLA";
	}	

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String e) {
		this.estado = e.toUpperCase();
	}

}