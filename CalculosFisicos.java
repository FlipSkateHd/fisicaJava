package fisicaJava;

import java.util.Scanner;

public class CalculosFisicos {

   public static double multiplicar(double var0, double var2) {
      return var0 * var2;
   }
   
   public static double dividir(double var0, double var2) {
      return var0 / var2;
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("\nEscolha uma opção:");
      System.out.println("1 - Calcular velocidade média (espaço / tempo)");
      System.out.println("2 - Calcular aceleração média (velocidade / tempo)");
      System.out.println("3 - Calcular força resultante (massa * aceleração)");
      System.out.println("4 - Calcular tensão (Lei de Ohm) (resistencia * corrente)");
      System.out.println("5 - Calcular potência elétrica (tensão * corrente)");
      System.out.println("6 - Calcular energia elétrica (potencia * tempo)");
      System.out.println("7 - Calcular energia cinética (massa * velocidade²)");
      System.out.println("8 - Calcular energia potencial gravitacional (massa * gravidade * referencia)");
      System.out.println("9 - Calcular trabalho de uma força (força * deslocamento * cos(angulo))");
      System.out.println("10 - Calcular calor sensível (massa * calor especifico * tempo");
      System.out.println("11 - Calcular calor específico (calor / (massa * tempo))");
      System.out.println("12 - Calcular velocidade de uma onda (comprimento / frequencia)");
      System.out.println("13 - Calcular pressão (força / área ");
      System.out.println("14 - Calcular densidade (massa/volume)");
      System.out.println("15 - Calcular impulso (Força/tempo)");
      System.out.print("Opção: ");
      
      String opcao = scanner.nextLine();
      double valor1, valor2, valor3, total;

      switch (opcao) {
         case "1": // Velocidade média
            System.out.print("Digite a variação do espaço (m): ");
            valor1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite a variação do tempo (s): ");
            valor2 = Double.parseDouble(scanner.nextLine());

            total = dividir(valor1, valor2);
            System.out.printf("A velocidade média é: %.2f m/s\n", total);
            break;

         case "2": // Aceleração média
            System.out.print("Digite a variação da velocidade (m/s): ");
            valor1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite a variação do tempo (s): ");
            valor2 = Double.parseDouble(scanner.nextLine());

            total = dividir(valor1, valor2);
            System.out.printf("A aceleração média é: %.2f m/s²\n", total);
            break;

         case "3": // Força resultante
            System.out.print("Digite a massa (kg): ");
            valor1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite a aceleração (m/s²): ");
            valor2 = Double.parseDouble(scanner.nextLine());

            total = multiplicar(valor1, valor2);
            System.out.printf("A força resultante é: %.2f N\n", total);
            break;

         case "4": // Tensão (Lei de Ohm)
            System.out.print("Digite a resistência (Ω): ");
            valor1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite a corrente (A): ");
            valor2 = Double.parseDouble(scanner.nextLine());

            total = multiplicar(valor1, valor2);
            System.out.printf("A tensão é: %.2f V\n", total);
            break;

         case "5": // Potência elétrica
            System.out.print("Digite a tensão (V): ");
            valor1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite a corrente (A): ");
            valor2 = Double.parseDouble(scanner.nextLine());

            total = multiplicar(valor1, valor2);
            System.out.printf("A potência elétrica é: %.2f W\n", total);
            break;

         case "6": // Energia elétrica
            System.out.print("Digite a potência (W): ");
            valor1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite o tempo (s): ");
            valor2 = Double.parseDouble(scanner.nextLine());

            total = multiplicar(valor1, valor2);
            System.out.printf("A energia elétrica é: %.2f J\n", total);
            break;

         case "7": // Energia cinética
            System.out.print("Digite a massa (kg): ");
            valor1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite a velocidade (m/s): ");
            valor2 = Double.parseDouble(scanner.nextLine());

            total = 0.5 * multiplicar(valor1, multiplicar(valor2, valor2));
            System.out.printf("A energia cinética é: %.2f J\n", total);
            break;

         case "8": // Energia potencial gravitacional
            System.out.print("Digite a massa (kg): ");
            valor1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite a altura (m): ");
            valor2 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite a gravidade (m/s²) [padrão: 9.8]: ");
            valor3 = Double.parseDouble(scanner.nextLine());

            total = multiplicar(valor1, multiplicar(valor2, valor3));
            System.out.printf("A energia potencial gravitacional é: %.2f J\n", total);
            break;

         case "9": // Trabalho de uma força
            System.out.print("Digite a força (N): ");
            valor1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite o deslocamento (m): ");
            valor2 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite o ângulo (graus) [0 para força paralela]: ");
            valor3 = Double.parseDouble(scanner.nextLine());

            total = multiplicar(valor1, multiplicar(valor2, Math.cos(Math.toRadians(valor3))));
            System.out.printf("O trabalho é: %.2f J\n", total);
            break;

         case "10": // Calor sensível
            System.out.print("Digite a massa (kg): ");
            valor1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite o calor específico (J/kg·K): ");
            valor2 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite a variação de temperatura (K): ");
            valor3 = Double.parseDouble(scanner.nextLine());

            total = multiplicar(valor1, multiplicar(valor2, valor3));
            System.out.printf("O calor sensível é: %.2f J\n", total);
            break;

         case "11": // Calor específico
            System.out.print("Digite o calor sensível (J): ");
            valor1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite a massa (kg): ");
            valor2 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite a variação de temperatura (K): ");
            valor3 = Double.parseDouble(scanner.nextLine());

            total = dividir(valor1, multiplicar(valor2, valor3));
            System.out.printf("O calor específico é: %.2f J/kg·K\n", total);
            break;

         case "12": // Velocidade de uma onda
            System.out.print("Digite o comprimento de onda (m): ");
            valor1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite a frequência (Hz): ");
            valor2 = Double.parseDouble(scanner.nextLine());

            total = multiplicar(valor1, valor2);
            System.out.printf("A velocidade da onda é: %.2f m/s\n", total);
            break;

         case "13": // Pressão
            System.out.print("Digite a força (N): ");
            valor1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite a área (m²): ");
            valor2 = Double.parseDouble(scanner.nextLine());

            total = dividir(valor1, valor2);
            System.out.printf("A pressão é: %.2f Pa\n", total);
            break;

         case "14": // Densidade
            System.out.print("Digite a massa (kg): ");
            valor1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite o volume (m³): ");
            valor2 = Double.parseDouble(scanner.nextLine());

            total = dividir(valor1, valor2);
            System.out.printf("A densidade é: %.2f kg/m³\n", total);
            break;

         case "15": // Impulso
            System.out.print("Digite a força (N): ");
            valor1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite o tempo (s): ");
            valor2 = Double.parseDouble(scanner.nextLine());

            total = multiplicar(valor1, valor2);
            System.out.printf("O impulso é: %.2f N·s\n", total);
            break;

         default:
            System.out.println("Opção inválida! Tente novamente.");
      }

      scanner.close();
   }
}