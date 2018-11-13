package datos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import cliente.comentario;


public class comentarioJSON {
	String ruta;
	public comentarioJSON(String r) {
		this.ruta=r;
	}
	public void setRuta(String archivo) {
		this.ruta=archivo;
	}
	public String getRuta(){
		return this.ruta;
	}
	
	@SuppressWarnings("unchecked")
	public void guardarObjeto(ArrayList<comentario>listaComentario) {
		JSONArray listaJsonComentario= new JSONArray();
		for (int i=0;i<listaComentario.size();i++) {
			JSONObject objetoComentario = new JSONObject();
			objetoComentario.put("id:",listaComentario.get(i).getId());
			objetoComentario.put("descripcion:",listaComentario.get(i).getDescripcion());
			objetoComentario.put("fecha:",listaComentario.get(i).getFecha());
			objetoComentario.put("idUsuario:",listaComentario.get(i).getIdUsuario());
			JSONArray listaJsonOf = new JSONArray();
			listaJsonComentario.add(objetoComentario);
			try {
			FileWriter file=new FileWriter(this.ruta);
			file.write(listaJsonComentario.toJSONString());
			file.flush();
			file.close();
			}catch(IOException e) {
			}
		}
	}
	
	public ArrayList<comentario> cargarObjeto(){
		JSONParser parser= new JSONParser();
		ArrayList<comentario> comentarios= new ArrayList <comentario>();
		try {
			Object obj=parser.parse(new FileReader(this.ruta));
			JSONArray listaJsonComentario=(JSONArray) obj;
			for (int i=0;i<listaJsonComentario.size();i++) {
				JSONArray listaJson1=(JSONArray)listaJsonComentario.get(i);
				JSONObject comentario=(JSONObject)listaJson1.get(0);
				int id=(int)comentario.get("id");
				String descripcion=(String)comentario.get("descripcion");
				Date fecha=(Date)comentario.get("fecha");
				int idUsuario=(int)comentario.get("idUsuario");
				
				comentario Comentario=new comentario(descripcion); 
				Comentario.setId(id);
				Comentario.setFecha(fecha);
				Comentario.setIdUsuario(idUsuario);
				comentarios.add(Comentario);
				
			}
		}
		catch(FileNotFoundException e) {}
		catch(IOException e) {}
		catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return comentarios;
	}
}
