public class Matematik {

    public class Toplama {
        public int hesapla(int a, int b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        Matematik.Toplama toplama = new Matematik().new Toplama();
        int sonuc = toplama.hesapla(5, 12);
        System.out.println("Sonuç: " + sonuc);
    }
}