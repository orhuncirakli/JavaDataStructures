public class Recursive {

    static int Topla(int sayi) {
        int toplam = 0;
        if (sayi > 0) {
            toplam = sayi + Topla(sayi - 1);
            return toplam;
        } else if (sayi == 1)
            return 1;
        return toplam;
    }

    static int UsAl(int taban, int us){
        if(us == 0){
            return 1;
        }
        else if(us % 2 == 0) {
            return UsAl(taban, us / 2) * UsAl(taban, us / 2);
        }
        else
            return taban * UsAl(taban, us - 1);
    }


    public static void main(String[] args){
        System.out.println(Topla(3));
        System.out.print(UsAl(3,4));
    }

}
