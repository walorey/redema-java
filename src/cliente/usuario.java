package cliente;

import java.awt.Image;
import java.util.Date;


public class usuario {
	int id;
	String NombreUsuario;
	String email;
	String Nombre;
	String Apellido;
	int dia;
	int mes;
	int anio;
	String Contrasenia;
	Date FechaAlta;
	Image FotoPerfil;
	
	static int generadorID=1;
	
	
	public usuario(String nu,String e,String n, String a, int d,int m,int an,String c) {
		id=usuario.generadorID++;
		this.NombreUsuario=nu;
		this.email=e;
		this.Nombre=n;
		this.Apellido=a;
		this.dia=d;
		this.mes=m;
		this.anio=an;
		this.Contrasenia=c;
		this.FechaAlta=new Date();
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombreUsuario() {
		return NombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		NombreUsuario = nombreUsuario;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getApellido() {
		return Apellido;
	}


	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getDia() {
		return dia;
	}


	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}


	public String getContrasenia() {
		return Contrasenia;
	}

	public Date getFechaAlta() {
		return FechaAlta;
	}


	public void setFechaAlta(Date fechaAlta) {
		FechaAlta = fechaAlta;
	}


	public Image getFotoPerfil() {
		return FotoPerfil;
	}


	public void setFotoPerfil(Image fotoPerfil) {
		FotoPerfil = fotoPerfil;
	}
	
	void imprimir() {
		System.out.println("Usuario número:"+this.id);
		System.out.println("Nombre de usuario:"+this.NombreUsuario);
		System.out.println("Nombre:"+this.Nombre+" "+this.Apellido);
		System.out.println("Fecha de nacimiento:"+this.dia+"/"+this.mes+"/"+this.anio);
		System.out.println("Fecha de alta:"+this.FechaAlta);
	}
}
