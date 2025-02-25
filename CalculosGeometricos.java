// Source code is decompiled from a .class file using FernFlower decompiler.
package fisicaJava;

import java.util.Scanner;

public class CalculosGeometricos {
   public CalculosGeometricos() {
   }

   public static double calcularHipotenusa(double var0, double var2) {
      return Math.sqrt(Math.pow(var0, 2.0) + Math.pow(var2, 2.0));
   }

   public static double calcularAreaCirculo(double var0) {
      return Math.PI * var0 * var0;
   }

   public static double calcularAreaTriangulo(double var0, double var2) {
      return var0 * var2 / 2.0;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("\nEscolha uma op\u00e7\u00e3o:");
      System.out.println("H - Calcular hipotenusa");
      System.out.println("C - Calcular \u00e1rea do c\u00edrculo");
      System.out.println("T - Calcular \u00e1rea do triangulo");
      System.out.print("Op\u00e7\u00e3o: ");
      switch (var1.nextLine()) {
         case "H":
            System.out.print("Digite o valor do cateto a (cm): ");
            double var5 = Double.parseDouble(var1.nextLine());
            System.out.print("Digite o valor do cateto b (cm): ");
            double var7 = Double.parseDouble(var1.nextLine());
            double var9 = calcularHipotenusa(var5, var7);
            System.out.printf("A hipotenusa \u00e9: %.2f cm\u00b2\n", var9);
            break;
         case "C":
            System.out.print("Digite o raio do c\u00edrculo (cm): ");
            double var11 = Double.parseDouble(var1.nextLine());
            double var13 = calcularAreaCirculo(var11);
            System.out.printf("A \u00e1rea do c\u00edrculo \u00e9: %.2f cm\u00b2\n", var13);
            break;
         case "T":
            System.out.print("Digite a base do triangulo (cm): ");
            double var15 = Double.parseDouble(var1.nextLine());
            System.out.print("Digite a altura do triangulo (cm): ");
            double var17 = Double.parseDouble(var1.nextLine());
            double var19 = calcularAreaTriangulo(var15, var17);
            System.out.printf("A \u00e1rea do triangulo \u00e9: %.2f cm\u00b2\n", var19);
            break;
         default:
            System.out.println("Op\u00e7\u00e3o inv\u00e1lida! Tente novamente.");
      }

      var1.close();
   }
}
