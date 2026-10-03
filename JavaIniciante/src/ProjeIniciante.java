import java.util.Scanner;

public class ProjeIniciante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("digite se nome");
        String nome = entrada.nextLine();

        System.out.println("digite sua idade");
        int idade = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite sua cidade:");
        String cidade = entrada.nextLine();

        double salario = 2000.50;
        double salarioAnual= salario * 12;

        System.out.println("nome:"+nome);
        System.out.println("idade:"+idade);
        System.out.println("cidade:"+cidade);
        System.out.println("salario R$:"+salario);
        System.out.println("salario anual:R$"+salarioAnual);


    }


}
