
/* OJO!!! Aqui tengo todo junto tanto la clase normal como la clase main!!!!!!!
 * 
 * En esta clase he declarado la variables como Final! Por eso sale un error. 
 * */

package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Empleados trabajador1 = new Empleados ("Paco");
	
	Empleados trabajador2 = new Empleados ("Ana");
	
	trabajador1.cambiarSeccion("RRHH");
	trabajador1.cambiarNombre("Maria");
	
	
	System.out.println(trabajador1.devuelveDatos());
	System.out.println(trabajador2.devuelveDatos());
	//
		
		
		
		

	}

}

class Empleados {
	
	//------------------Constructor-----------------------------------------------------------------------------------------------

	public Empleados (String nom){
		
		nombre = nom;
		
		seccion = "Administracion";
		
	}
	
	public void cambiarSeccion(String seccion) {
		
		this.seccion=seccion;
	}
	
	
	public String devuelveDatos() {
		
		return "El nombre es: "+ nombre + " y la seccion es " + seccion;
		
	}
	
	public void cambiarNombre(String nombre) {
		
		this.nombre=nombre;
	}
	
//--------------------Declarion de Variables---------------------------------------------------------------------------------------------	
	private final  String nombre;
	
	private String seccion;
	
	
	
	
	
	
}