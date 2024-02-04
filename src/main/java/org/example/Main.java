package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese su nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese sus apellidos: ");
                String apellidos = scanner.nextLine();
                System.out.print("Ingrese su edad: ");
                int edad = scanner.nextInt();
                System.out.print("Ingrese el número de usos de la tarjeta durante el último mes: ");
                int usos = scanner.nextInt();
                System.out.print("Ingrese el monto en pesos de compras de productos de aseo: ");
                double aseo = scanner.nextDouble();
                System.out.print("Ingrese el monto en pesos de compras de productos alimenticios: ");
                double alimentos = scanner.nextDouble();
                System.out.print("Ingrese el monto de otros productos comprados con la tarjeta: ");
                double otros = scanner.nextDouble();
                double deudaTotal = aseo + alimentos + otros;
                System.out.println("--------------------------------------------------");
                System.out.println("SU DEUDA TOTAL ES: $" + String.format("%.2f", deudaTotal));
                System.out.println("--------------------------------------------------");
                System.out.println("PUNTAJE DE CRÉDITO: ");
                double puntaje = Math.random() * 10.0;
                if (puntaje < 1) {
                    System.out.println("Puntaje 1: Auxilio del 25% de la deuda TOTAL");
                    double auxilio = deudaTotal * 0.25;
                    System.out.println("El auxilio es de: $" + String.format("%.2f", auxilio));
                    deudaTotal -= auxilio;
                    System.out.println("Su deuda total después del auxilio es: $" + String.format("%.2f", deudaTotal));
                } else if (puntaje < 2) {
                    System.out.println("Puntaje 2: Auxilio del 20% de la deuda TOTAL");
                    double auxilio = deudaTotal * 0.20;
                    System.out.println("El auxilio es de: $" + String.format("%.2f", auxilio));
                    deudaTotal -= auxilio;
                    System.out.println("Su deuda total después del auxilio es: $" + String.format("%.2f", deudaTotal));
                } else if (puntaje < 3) {
                    System.out.println("Puntaje 3: Auxilio del 15% de la deuda TOTAL");
                    double auxilio = deudaTotal * 0.15;
                    System.out.println("El auxilio es de: $" + String.format("%.2f", auxilio));
                    deudaTotal -= auxilio;
                    System.out.println("Su deuda total después del auxilio es: $" + String.format("%.2f", deudaTotal));
                } else if (puntaje < 4) {
                    System.out.println("Puntaje 4: Auxilio del 10% de la deuda TOTAL");
                    double auxilio = deudaTotal * 0.10;
                    System.out.println("El auxilio es de: $" + String.format("%.2f", auxilio));
                    deudaTotal -= auxilio;
                    System.out.println("Su deuda total después del auxilio es: $" + String.format("%.2f", deudaTotal));
                } else {
                    System.out.println("Puntaje 5, 6, 7, 8 o 9: No recibe beneficio");
                }
           
    }
}