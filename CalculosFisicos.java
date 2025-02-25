package fisicaJava;

import java.util.Scanner;

public class CalculosFisicos {
   public CalculosFisicos() {
   }

   public static double multiplicar(double var0, double var2) {
      return var0 * var2;
   }
   
   public static double dividir(double var0, double var2) {
      return var0 / var2;
   }

   public static double calcularAreaTriangulo(double var0, double var2) {
      return var0 * var2 / 2.0;
   }

   public static void main(String[] args) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("\nEscolha uma opção:");
      System.out.println("1 - Calcular velocidade média");
      System.out.println("2 - Calcular aceleração média");
      System.out.println("3 - Calcular força resultante");
      System.out.println("4 - Calcular tensão");
      System.out.println("5 - Calcular potência elétrica");
      System.out.println("6 - Calcular energia elétrica");
      System.out.print("Opção: ");
      
      String opcao = var1.nextLine();
      
      // Variáveis para armazenar entradas e resultados
      double valor1, valor2, total;

      switch (opcao) {
         case "1":
            System.out.print("Digite variação do espaço: ");
            valor1 = Double.parseDouble(var1.nextLine());
            System.out.print("Digite a variação do tempo: ");
            valor2 = Double.parseDouble(var1.nextLine());

            total = dividir(valor1, valor2);
            System.out.printf("A velocidade média é: %.2f m/s\n", total);
            break;

         case "2":
            System.out.print("Digite variação da velocidade: ");
            valor1 = Double.parseDouble(var1.nextLine());
            System.out.print("Digite a variação do tempo: ");
            valor2 = Double.parseDouble(var1.nextLine());

            total = dividir(valor1, valor2);
            System.out.printf("A aceleração média é: %.2f m/s²\n", total);
            break;

         case "3":
            System.out.print("Digite a massa (kg): ");
            valor1 = Double.parseDouble(var1.nextLine());
            System.out.print("Digite a aceleração (m/s²): ");
            valor2 = Double.parseDouble(var1.nextLine());

            total = multiplicar(valor1, valor2);
            System.out.printf("A força resultante é: %.2f N\n", total);
            break;

         case "4":
            System.out.print("Digite a resistência (Ω): ");
            valor1 = Double.parseDouble(var1.nextLine());
            System.out.print("Digite a corrente (A): ");
            valor2 = Double.parseDouble(var1.nextLine());

            total = multiplicar(valor1, valor2);
            System.out.printf("A tensão é: %.2f V\n", total);
            break;

         case "5":
            System.out.print("Digite a tensão (V): ");
            valor1 = Double.parseDouble(var1.nextLine());
            System.out.print("Digite a corrente (A): ");
            valor2 = Double.parseDouble(var1.nextLine());

            total = multiplicar(valor1, valor2);
            System.out.printf("A potência elétrica é: %.2f W\n", total);
            break;

         case "6":
            System.out.print("Digite a potência (W): ");
            valor1 = Double.parseDouble(var1.nextLine());
            System.out.print("Digite o tempo (s): ");
            valor2 = Double.parseDouble(var1.nextLine());

            total = multiplicar(valor1, valor2);
            System.out.printf("A energia elétrica é: %.2f J\n", total);
            break;

         default:
            System.out.println("Opção inválida! Tente novamente.");
      }

      var1.close();
   }
}