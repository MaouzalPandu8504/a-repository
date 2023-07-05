public class Calculating {
    public int getNumber1() {
        return Number1;
    }

    public void setNumber1(int number1) {
        Number1 = number1;
    }

    public int getNumber2() {
        return Number2;
    }

    public void setNumber2(int number2) {
        Number2 = number2;
    }
    public void AddAllNumber(){
        int hasil = Number1 + Number2;
        System.out.println(hasil);
    }
    public static void MultiplyNumber(int kali1, int kali2){
        int hasilkali = kali1 * kali2;
        System.out.println(hasilkali);
    }

    private int Number1;
    private int Number2;
    public static void main(String[]args){
        Calculating z = new Calculating();
        z.setNumber1(16);
        z.setNumber2(90);
        z.AddAllNumber();
        MultiplyNumber(z.getNumber1(), z.getNumber2());
    }
}
