package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	
		Empleado empleado1 = new Empleado("Omaira Zheng", 85000, 1990, 12, 17);
		Empleado empleado2 = new Empleado("Ana Lopez", 95000, 1995, 06, 02);
		Empleado empleado3 = new Empleado("Maria Martín", 105000, 2002, 03, 15);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		
		System.out.println("Nombre: "+ empleado1.dameNombre() + "\nsueldo: " + empleado1.dameSueldo()+ "\nFecha de Alta: " + empleado1.dameFechaContrato());
		System.out.println("Nombre: "+ empleado2.dameNombre() + "\nsueldo: " + empleado2.dameSueldo()+ "\nFecha de Alta: " + empleado2.dameFechaContrato());
		System.out.println("Nombre: "+ empleado3.dameNombre() + "\nsueldo: " + empleado3.dameSueldo()+ "\nFecha de Alta: " + empleado3.dameFechaContrato());
*/
		
		/*------------Almacenamiento En Formato Array y luego la recogo con un " For "--------------*/
		
		
		Empleado [] misEmpleados = new Empleado[3];
			
		misEmpleados [0]= new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		misEmpleados [1]= new Empleado(" Ana Lopez", 95000, 1995, 6, 02);
		misEmpleados [2]= new Empleado("Maria Martín", 105000, 2002, 03, 15);
		
		
		for(int i =0; i < 3; i++) {
			
			misEmpleados[i].subeSueldo(i);
			
		}
		
		for(int i=0; i <3 ;i++) {
			
			System.out.println(""); // Salto de Linea
			
			System.out.println("Nombre: "+ misEmpleados[i].dameNombre() + "\nSueldo: " + misEmpleados[i].dameSueldo() + "\nFecha de Alta: " + misEmpleados[i].dameFechaContrato() );
		
		}
		
	}

}

class Empleado{
	
	public  Empleado(String nom, double sue, int agno, int mes , int dia) {
		
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
		
		altaContratoDate = calendario.getTime();
			
	}
	
	/*-------------------------------------------------------------------------*/
	public String dameNombre() {
		
		return nombre;
	}
	
	/*-------------------------------------------------------------------------*/
	public double dameSueldo() {
		
		return sueldo;
	}
	
	/*-------------------------------------------------------------------------*/
	public Date dameFechaContrato() {
		
		return altaContratoDate;
	}
	/*-------------------------------------------------------------------------*/
	public void subeSueldo(double porcentaje) {
		
		double aumento = sueldo*porcentaje/100;
		
		sueldo +=aumento;
		
	}
	
	/*-------------------------------------------------------------------------*/
	
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContratoDate;
	
}
