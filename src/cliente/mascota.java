package cliente;

public class mascota {
	
	private int id=0;
	String nombre="";
	int edad=0;
	Tipo_mascota tipo;
	Estado estado= Estado.adoptado;
	
	static int generadorID=1;
	
	public mascota(String n, int e, Tipo_mascota t, Estado es) {
		this.id=mascota.generadorID++;
		this.nombre=n;
		this.edad=e;
		this.tipo=t;
		this.estado=es;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Tipo_mascota getTipo() {
		return tipo;
	}

	public void setTipo(Tipo_mascota tipo) {
		this.tipo = tipo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	void imprimir() {
		System.out.println(this.nombre);
		System.out.println(this.edad);
		System.out.println(this.tipo);
		System.out.println(this.estado);
	}
}
