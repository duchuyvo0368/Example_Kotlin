package di.di1;

public class Main {
    public static void main(String[] args) {
        DogCoTrungQuoc dogCoTrungQuoc=new DogCoTrungQuoc();
        XeMay may=new XeMay(dogCoTrungQuoc);
        may.getDongco().NoMay();
    }
}
