import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       System.out.flush();
       System.out.println("Sistema de diagnostico de IMC");
        // Entradas 
       // Nome, altura e Peso de uma pessoa

       Scanner scanner = new Scanner(System.in);

       System.out.print("Entre com o nome: ");
       String nome = scanner.nextLine();
       System.out.println("");

       System.out.print("Digite sua altura: ");
       double altura = scanner.nextDouble();
       System.out.println("");

       System.out.print("Digite seu peso: ");
       double peso = scanner.nextDouble();
       System.out.println("");
       scanner.close();


       // Processamento
       // imc divide-se o peso do paciente pela sua altura elevado ao quadrado 
       
       double imc = peso / (altura * altura);
       // Diagnostico 
       String classificacao = "";
       int grauObesidade = 0;

       if (imc < 18.5) {
        classificacao = ("Magreza");
        grauObesidade = 0;
        } else if (imc >= 18.5 && imc < 25){
        classificacao = ("NORMAL");
        grauObesidade = 0;
        } else if (imc >= 25.0 && imc < 30){
        classificacao = ("SOBREPESO");
        grauObesidade = 1;
        } else if (imc >= 30 && imc < 40){
        classificacao = ("OBESIDADE");
        grauObesidade = 2;
        } else {
        classificacao = ("OBESIDADE GRAVE");
        grauObesidade = 3;
       }

       // Saídas
       System.out.printf(" O funcionario %s, da altura %2.2f e peso %3.2f tem o IMC = %2.2f com diagnóstico %s %d",nome,altura, peso,imc, classificacao,grauObesidade);
    }
}
