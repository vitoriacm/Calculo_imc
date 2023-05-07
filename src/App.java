import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
       System.out.println("Sistema de diagnostico de IMC");
        
       // Entradas 
       Scanner scanner = new Scanner(System.in);

       String nome = lerNome(scanner);
       double altura = lerAltura(scanner);
       double peso = lerPeso(scanner);

       scanner.close();
       // Processamento
       // imc divide-se o peso do paciente pela sua altura elevado ao quadrado 
       
       double imc = calcularImc(altura, peso);
       
       // Diagnostico 
       String classificacao = calcularClassificacao(imc);
       int grauObesidade = calcularGrauObesidade(imc);

      // Saídas
       System.out.printf(" O funcionario %s, da altura %2.2f e peso %3.2f tem o IMC = %2.2f com diagnóstico %s %d",nome,altura, peso,imc, classificacao,grauObesidade);
    }

    private static double lerPeso(Scanner scanner) {
        System.out.print("Digite seu peso: ");
           double peso = scanner.nextDouble();
           System.out.println("");
        return peso;
    }

    private static double lerAltura(Scanner scanner) {
        System.out.print("Digite sua altura: ");
           double altura = scanner.nextDouble();
           System.out.println("");
        return altura;
    }

    private static String lerNome(Scanner scanner) {
        System.out.print("Entre com o nome: ");
           String nome = scanner.nextLine();
           System.out.println("");
        return nome;
    }

    private static double calcularImc(double altura, double peso) {
        double imc = peso / Math.pow (altura,2);
        return imc;
    }

    private static String calcularClassificacao(double imc) {
        String classificacao;
        if (imc < 18.5) {
            classificacao = "Magreza";
          
            } else if (imc >= 18.5 && imc < 25){
            classificacao = "NORMAL";
          
            } else if (imc >= 25.0 && imc < 30){
            classificacao = "SOBREPESO";
            
            } else if (imc >= 30 && imc < 40){
            classificacao = "OBESIDADE";
            
            } else {
            classificacao = "OBESIDADE GRAVE";
           
           }
        return classificacao;
    }

    private static int calcularGrauObesidade(double imc) {
        int grauObesidade;
        if (imc < 18.5) {
            grauObesidade = 0;
            } else if (imc >= 18.5 && imc < 25){
            grauObesidade = 0;
            } else if (imc >= 25.0 && imc < 30){
            grauObesidade = 1;
            } else if (imc >= 30 && imc < 40){
            grauObesidade = 2;
            } else {
            grauObesidade = 3;
           }
        return grauObesidade;
    }
}
