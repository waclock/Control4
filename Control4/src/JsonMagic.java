
import java.util.ArrayList;
import java.util.List;
public class JsonMagic{
	List<String> lista ;

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

	public static void push (String[] params){
		Stirng s = StringtoJson(params);
		lista.add(s);	
	}
	public static String[] pull (String params){
		Stirng s =  lista.get(lista.size());	
		lista.remove(lista.size());	
		return jsontoString(s);
	}


}