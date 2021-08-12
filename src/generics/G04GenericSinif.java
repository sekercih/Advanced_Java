package generics;

//Generic class tanımlamasi

public class G04GenericSinif <T> {  //T: Type
    private T veri;

    //Default constructor
    public G04GenericSinif() {

    }

    //Parametreli constructor
    public G04GenericSinif(T veri) {
        this.veri = veri;
    }

    public T getVeri() {
        return veri;
    }

    public void setVeri(T veri) {
        this.veri = veri;
    }

    public static void main(String[] args) {
        //Generic sınıftan bir nesne türetelim

        G04GenericSinif <Integer> intVeri=new G04GenericSinif<>(25);

        System.out.println("intVeri_Test = " + intVeri.getVeri());

        G04GenericSinif<Double> doubleVeri=new G04GenericSinif<>();
        doubleVeri.setVeri(5.5);
        System.out.println("doubleVeri_Test = " + doubleVeri.getVeri());

        G04GenericSinif<String> strVeri=new G04GenericSinif<>("Merhaba Generic");
        System.out.println("strVeri_Test = " + strVeri.getVeri());

       // G04GenericSinif<T> strVri=new G04GenericSinif<>(34); //Derleme hatası ile kullanıcı uyarılır.
    }
}