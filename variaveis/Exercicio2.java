/*
1. Crie uma variável que armazena o valor de uma laranja;
2. Crie uma variável que informa o valor de uma uva;
3. Some o valor da laranja com a uva;
*/
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Escreva seu código aqui ⬇️
        double l = sc.nextDouble();
        double u = sc.nextDouble();
        double t;
        t = l + u;
        System.out.println("Uva:"+u);
        System.out.println("Laranja:"+l);
        System.out.println(t);
        
//Recebam duas idades e faça a soma
        int idade1 = sc.nextInt();
        int idade2 = sc.nextInt();
        int idade3 = 0;
        idade3 = idade2 + idade1;
        System.out.println("Soma das idades é:"+idade3);

    }
}
