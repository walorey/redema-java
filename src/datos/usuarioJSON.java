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


import cliente.usuario;

public class usuarioJSON {
	String ruta;
	public usuarioJSON(String r) {
		this.ruta=r;
	}
	public void setRuta(String archivo) {
		this.ruta=archivo;
	}
	public String getRuta(){
		return this.ruta;
	}
	
	@SuppressWarnings("unchecked")
	public void guardarObjeto(ArrayList<usuario>listaUsuario) {
		JSONArray listaJsonUsuario= new JSONArray();
		for (int i=0;i<listaUsuario.size();i++) {
			JSONObject objetoUsuario = new JSONObject();
			objetoUsuario.put("id:",listaUsuario.get(i).getId());
			objetoUsuario.put("NombreUsuario",listaUsuario.get(i).getNombreUsuario());
			objetoUsuario.put("email:",listaUsuario.get(i).getEmail());
			objetoUsuario.put("nombre:",listaUsuario.get(i).getNombre());
			objetoUsuario.put("Apellido:",listaUsuario.get(i).getApellido());
			objetoUsuario.put("dia:",listaUsuario.get(i).getDia());
			objetoUsuario.put("mes:",listaUsuario.get(i).getMes());
			objetoUsuario.put("anio:",listaUsuario.get(i).getAnio());
			objetoUsuario.put("Contrasenia:",listaUsuario.get(i).getContrasenia());
			objetoUsuario.put("FechaAlta:",listaUsuario.get(i).getFechaAlta());
			objetoUsuario.put("FotoPerfil:",listaUsuario.get(i).getFotoPerfil());
			JSONArray listaJsonOf = new JSONArray();
			listaJsonUsuario.add(objetoUsuario);
			try {
			FileWriter file=new FileWriter(this.ruta);
			file.write(listaJsonUsuario.toJSONString());
			file.flush();
			file.close();
			}catch(IOException e) {
			}
		}
	}
	
	public ArrayList<usuario> cargarObjeto(){
		JSONParser parser= new JSONParser();
		ArrayList<usuario> usuarios= new ArrayList <usuario>();
		try {
			Object obj=parser.parse(new FileReader(this.ruta));
			JSONArray listaJsonUsuario=(JSONArray) obj;
			for (int i=0;i<listaJsonUsuario.size();i++) {
				JSONArray listaJson1=(JSONArray)listaJsonUsuario.get(i);
				JSONObject usuario=(JSONObject)listaJson1.get(0);
				int id=(int)usuario.get("id");
				String NombreUsuario=(String)usuario.get("NombreUsuario");
				String email=(String)usuario.get("email");
				String nombre=(String)usuario.get("nombre");
				String apellido=(String)usuario.get("apellido");
				int dia=(int)usuario.get("dia");
				int mes=(int)usuario.get("mes");
				int anio=(int)usuario.get("anio");
				String Contrasenia=(String)usuario.get("Contrasenia");
				Date FechaAlta=(Date)usuario.get("FechaAlta");
				Image FotoPerfil=(Image)usuario.get("FotoPerfil");
				
				usuario Usuario=new usuario(NombreUsuario,email,nombre,apellido,dia,mes,anio,Contrasenia); 
				Usuario.setId(id);
				Usuario.setFechaAlta(FechaAlta);
				Usuario.setFotoPerfil(FotoPerfil);
				usuarios.add(Usuario);
		
			}
		}
		catch(FileNotFoundException e) {}
		catch(IOException e) {}
		catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuarios;
	}
}
