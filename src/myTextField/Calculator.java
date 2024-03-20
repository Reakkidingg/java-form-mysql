/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myTextField;

import java.util.Scanner;

/**
 *
 * @author Reakkidingg_
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = calculate(num1, num2, operator);

        System.out.println("Result: " + result);

        scanner.close();
    }

    // Importing functions from CalculatorFunctions class
    public static double calculate(double num1, double num2, char operator) {
        return CalculatorFunctions.calculate(num1, num2, operator);
    }
}
