import java.util.Scanner;

class CTAtividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        System.out.println("Informe sua idade");
        idade = scanner.nextInt();
        
        if (idade < 16){
            System.out.println("Voce nao pode votar ainda");
        } else if (idade >= 18 && idade <= 65){
            System.out.println("Voce deve votar");
        } else {
            System.out.println("Caso queira, voce pode votar");
        }
    }
}
