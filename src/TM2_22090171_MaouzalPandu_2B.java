import java.util.ArrayList;
public class TM2_22090171_MaouzalPandu_2B {
    public static void fibonacci(int number){
        ArrayList<Integer> bilanganfibonacci = new ArrayList<>();
        bilanganfibonacci.add(0);
        bilanganfibonacci.add(number);
        int indexA = 1;
        int indexB = 0;
        if(bilanganfibonacci.get(indexA) % 2 == 0) {
            System.out.println("### Genap ###");
            System.out.println("### Bilangan Fibonacci dari " + number + "-4500 ###");
            for(int indexC = 0; indexC < bilanganfibonacci.size(); indexC++){
                while (bilanganfibonacci.get(indexB) + bilanganfibonacci.get(indexA) <= 4500) {
                    bilanganfibonacci.add(bilanganfibonacci.get(indexB) + bilanganfibonacci.get(indexA));
                    indexA++;
                    indexB++;
                }
                System.out.print(bilanganfibonacci.get(indexC) + ", ");
            }
            System.out.println();
            System.out.println("### Ada " + bilanganfibonacci.size() + " Bilangan Fibonacci ###");
        }else{
            System.out.println("### ERORR ###");
            System.out.println("### Ganjil ###");
        }
    }
    public static void main(String[] args) {
        fibonacci(10);//Masukan nilai genap pada parameter
    }
}
