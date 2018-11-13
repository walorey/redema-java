package cliente;

import java.sql.Date;

public class comentario {
	int id;
	String descripcion;
	Date fecha;
	int idUsuario;
	
	static int generadorID=1;
	
	public comentario(String d) {
		this.descripcion=d;
		this.id=comentario.generadorID++;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(java.util.Date fecha2) {
		this.fecha = (Date) fecha2;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public String toString() {
		return descripcion;
	}
}
