package classroom;

public enum Tipo {

	DISCIPLINAR(10, "DISCIPLINAR"),FUNDAMENTACION(20, "FUNDAMENTACION"),ELECTIVA(30, "ELECTIVA");

	private int codigo;
	private String nombre;
	private Tipo(int codigo,String nombre) { //Solo private es permitido
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
