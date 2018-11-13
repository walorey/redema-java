package datos;

import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import cliente.Lugar;
import cliente.Tipo_publicacion;
import cliente.comentario;
import cliente.publicacion;



public class publicacionJSON {
	String ruta;
	public publicacionJSON(String r) {
		this.ruta=r;
	}
	public void setRuta(String archivo) {
		this.ruta=archivo;
	}
	public String getRuta(){
		return this.ruta;
	}
	@SuppressWarnings("unchecked")
	public void guardarObjeto(ArrayList<publicacion>listaPublicacion) {
		JSONArray listaJsonPublicacion= new JSONArray();
		for (int i=0;i<listaPublicacion.size();i++) {
			JSONObject objetoPublicacion = new JSONObject();
			objetoPublicacion.put("id:",listaPublicacion.get(i).getId());
			objetoPublicacion.put("imagenes:",listaPublicacion.get(i).getImagenes());
			objetoPublicacion.put("fecha:",listaPublicacion.get(i).getFecha());
			objetoPublicacion.put("id_mascota:",listaPublicacion.get(i).getId_mascota());
			objetoPublicacion.put("tipo:",listaPublicacion.get(i).getTipo());
			objetoPublicacion.put("idUsuario:",listaPublicacion.get(i).getIdUsuario());
			objetoPublicacion.put("titulo:",listaPublicacion.get(i).getTitulo());
			objetoPublicacion.put("descripcion:",listaPublicacion.get(i).getDescripcion());
			objetoPublicacion.put("lugar:",listaPublicacion.get(i).getLugar());
			objetoPublicacion.put("comentarios:",listaPublicacion.get(i).getComentarios());
			JSONArray listaJsonOf = new JSONArray();
			listaJsonPublicacion.add(objetoPublicacion);
			try {
			FileWriter file=new FileWriter(this.ruta);
			file.write(listaJsonPublicacion.toJSONString());
			file.flush();
			file.close();
			}catch(IOException e) {
			}
		}
	}
	
	public ArrayList<publicacion> cargarObjeto(){
		JSONParser parser= new JSONParser();
		ArrayList<publicacion> publicaciones= new ArrayList <publicacion>();
		try {
			Object obj=parser.parse(new FileReader(this.ruta));
			JSONArray listaJsonPublicacion=(JSONArray) obj;
			for (int i=0;i<listaJsonPublicacion.size();i++) {
				JSONArray listaJson1=(JSONArray)listaJsonPublicacion.get(i);
				JSONObject publicacion=(JSONObject)listaJson1.get(0);
				int id=(int)publicacion.get("id");
				Image [] imagenes=(Image [])publicacion.get("imagenes");
				Date fecha=(Date)publicacion.get("Fecha");
				int id_mascota=(int)publicacion.get("id_mascota");
				Tipo_publicacion tipo=(Tipo_publicacion)publicacion.get("tipo");
				int idUsuario=(int)publicacion.get("idUsuario");
				String titulo=(String)publicacion.get("titulo");
				String descripcion=(String)publicacion.get("descripcion");
				Lugar lugar=(Lugar)publicacion.get("lugar");
				@SuppressWarnings("unchecked")
				ArrayList<comentario> comentarios=(ArrayList<comentario>)publicacion.get("comentarios");
				
				publicacion Publicacion=new publicacion(tipo,titulo,descripcion,lugar); 
				Publicacion.setId(id);
				Publicacion.setImagenes(imagenes);
				Publicacion.setFecha(fecha);
				Publicacion.setId_mascota(id_mascota);
				Publicacion.setIdUsuario(idUsuario);
				Publicacion.setComentarios(comentarios);
				publicaciones.add(Publicacion);
				
			}
		}
		catch(FileNotFoundException e) {}
		catch(IOException e) {}
		catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return publicaciones;
	}
}
