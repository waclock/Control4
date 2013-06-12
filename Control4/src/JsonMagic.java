
import java.util.ArrayList;
import java.util.List;
public class JsonMagic{
	List<String> lista ;

	public JsonMagic(){
		lista = new ArrayList<String>();
	}


	public static String StringtoJson(String[] params){
		String var = "";
		for (String s : params ) {
			var += s;
			var += ";";
		}
		return var;
	}

	public static String[] JsontoString(String params){
		String[] var = new String [];
		for (String s : params.split(";") ) {
			var += s;
			var += ";";
		}
		return var;
	}	


}