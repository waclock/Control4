
import java.util.ArrayList;
import java.util.List;
public class JsonMagic{
	static List<String> perros ;
	static List<String> gatos ;

//Memento
	public JsonMagic(){
		lista = new ArrayList<String>();
	}


	public static String stringtoJson(String[] params){
		String var = "";
		for (String s : params ) {
			var += s;
			var += ";";
		}
		return var;
	}

	public static String[] jsontoString(String params){
		return params.split(";");
	}	

	public static void push (Perro param){
		String[] data = [param.nombre, param.estado, param.cola ? "1" : "0" ];
		Stirng s = StringtoJson(data);
		perros.add(s);	
	}
	public static void push (Gato param){
		String[] data = [param.nombre, param.estado, param.color ];
		Stirng s = StringtoJson(data);
		gatos.add(s);	
	}
	public static Gato pullGato (){
		Stirng s =  gatos.get(gatos.size() -1);	
		gatos.remove(gatos.size() -1);	
		String[] d = jsontoString(s);
		Gato g = Madre.crearGato(d[0],d[2]);
		g.estado = d[1];
		return g;
	}
	public static Perro pullPerro (){
		Stirng s =  perros.get(perros.size() -1 );	
		perros.remove(perros.size() -1 );	
		String[] d = jsontoString(s);
		Perro g = Madre.crearPerro(d[0],d[2] == "1" ? true, false);
		g.estado = d[1];
		return g;
	}




}