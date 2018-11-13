package datos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import cliente.Estado;
import cliente.Tipo_mascota;
import cliente.mascota;

public class mascotaJSON {
	String ruta;
	public mascotaJSON(String r) {
		this.ruta=r;
	}
	public void setRuta(String archivo) {
		this.ruta=archivo;
	}
	public String getRuta(){
		return this.ruta;
	}

	@SuppressWarnings("unchecked")
	public void guardarObjeto(ArrayList<mascota>listaMascota) {
		JSONArray listaJsonMascota= new JSONArray();
		for (int i=0;i<listaMascota.size();i++) {
			JSONObject objetoMascota = new JSONObject();
			objetoMascota.put("id:",listaMascota.get(i).getId());
			objetoMascota.put("nombre:",listaMascota.get(i).getNombre());
			objetoMascota.put("edad:",listaMascota.get(i).getEdad());
			objetoMascota.put("tipo:",listaMascota.get(i).getTipo());
			objetoMascota.put("estado:",listaMascota.get(i).getEstado());
			JSONArray listaJsonOf = new JSONArray();
			listaJsonMascota.add(objetoMascota);
			try {
			FileWriter file=new FileWriter(this.ruta);
			file.write(listaJsonMascota.toJSONString());
			file.flush();
			file.close();
			}catch(IOException e) {
			}
		}
	}
	
	public ArrayList<mascota> cargarObjeto(){
		JSONParser parser= new JSONParser();
		ArrayList<mascota> mascotas= new ArrayList <mascota>();
		try {
			System.out.println(this.ruta);
			Object obj=parser.parse(new FileReader(this.ruta));
			JSONArray listaJsonMascota=(JSONArray) obj;
			for (int i=0;i<listaJsonMascota.size();i++) {
				JSONArray listaJson1=(JSONArray)listaJsonMascota.get(i);
				JSONObject mascota=(JSONObject)listaJson1.get(0);
				int id=(int)mascota.get("id");
				String nombre=(String)mascota.get("nombre");
				int edad=(int)mascota.get("edad");
				Tipo_mascota tipo=(Tipo_mascota)mascota.get("tipo");
				Estado estado=(Estado)mascota.get("estado");
				
				mascota Mascota=new mascota(nombre,edad,tipo,estado); 
				Mascota.setId(id);
				mascotas.add(Mascota);
				
			}
		}
		catch(FileNotFoundException e) {}
		catch(IOException e) {} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mascotas;
	}
}
