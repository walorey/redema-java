package cliente;

import java.awt.Image;
import java.sql.Date;
import java.util.ArrayList;

public class publicacion {
	
	int id=0;
	Image [] imagenes;
	Date fecha;
	int id_mascota;
	Tipo_publicacion tipo;
	int idUsuario;
	String titulo;
	String descripcion;
	Lugar lugar;
	ArrayList<comentario> comentarios=new ArrayList<>();
	
	static int generadorID=1;
	
	public publicacion(Tipo_publicacion t,String ti, String d,Lugar l) {
		this.tipo=t;
		this.titulo=ti;
		this.descripcion=d;
		this.lugar=l;
		this.id=publicacion.generadorID++;
		
	}
	
	public ArrayList<comentario> getComentarios() {
		return comentarios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Image[] getImagenes() {
		return imagenes;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Lugar getLugar() {
		return lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	public void setComentarios(ArrayList<comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public void setImagenes(Image[] imagenes) {
		this.imagenes = imagenes;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(java.util.Date fecha2) {
		this.fecha = (Date) fecha2;
	}

	public int getId_mascota() {
		return id_mascota;
	}

	public void setId_mascota(int id_mascota) {
		this.id_mascota = id_mascota;
	}

	public Tipo_publicacion getTipo() {
		return tipo;
	}

	public void setTipo(Tipo_publicacion tipo) {
		this.tipo = tipo;
	}

	void imprimir() {
		System.out.println(this.titulo +' '+this.tipo);
		System.out.println("Descripción:"+this.descripcion);
		for (int i = 0; i < comentarios.size(); i++){
			System.out.println(comentarios.get(i).toString());
			}
		System.out.println(this.lugar);
	}
	
	void mostrarComentarios(){
		for (int i = 0; i < comentarios.size(); i++){
			System.out.println(comentarios.get(i).toString());
			}
	}
	

	
//	private void For(Class<Integer> class1) {
//		// TODO Auto-generated method stub
//		
//	}
}
