import java.util.Scanner;
class Questao5{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Escolha um de 1 a 7:");
    int num = input.nextInt();

    switch(num){
      case 1:
      System.out.println("Domingo");
        break;
        
      case 2:
      System.out.println("Segunda");
        break;
        
      case 3:
      System.out.println("Terça");
        break;
        
       case 4:
      System.out.println("Quarta");
        break;
        
       case 5:
      System.out.println("Quinta");
        break;
        
       case 6:
      System.out.println("Sexta");
        break;
        
       case 7:
      System.out.println("Sábado");
        break;
    }
  }
}
    