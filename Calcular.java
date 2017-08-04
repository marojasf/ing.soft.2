package software2.calculadora;

import java.util.Scanner;

public class Calcular {
	
	public double sumar(double a, double b){
		return a + b;
	}
	
	public double restar(double a, double b){
		return a - b;
	}
	
	public double multiplicar(double a, double b){
		return a * b;
	}
	
	public double dividir(double a, double b){
		return a / b;
	}
	
	public double operacion(String operacion){
		String[] numeros = operacion.split("[*,/,+,-]");
		String[] operadores = operacion.split("[0-9]");
		int[] number = new int[50];
		for(int i = 0; i < numeros.length; i++ ){
			number[i] = Integer.parseInt(numeros[i]);
		}
		double total = number[0];
		int i =1;
		for(int j = 0; j < operadores.length; j++){
			if(operadores[j].equals("+")){
				total = sumar(total, number[i]);
				i++;
			}else if(operadores[j].equals("-")){
				total = restar(total, number[i]);
				i++;
			}else if(operadores[j].equals("*")){
				total = multiplicar(total, number[i]);
				i++;
			}else if(operadores[j].equals("/")){
				total = dividir(total, number[i]);
				i++;
			}
		}
		System.out.println("El resultado es: " + total);
		return total;
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System .in);
		Calcular c = new Calcular();
		System.out.println("Ingrese la operaci�n a realizar.");
		String operar = sc.next();
		System.out.println(c.operacion(operar));
		sc.close();
	}
}
