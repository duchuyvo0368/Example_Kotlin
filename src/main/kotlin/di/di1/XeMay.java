package di.di1;

public class XeMay {
    private DongCo dongco;

    public XeMay(DongCo dongco) {
        this.dongco = dongco;
    }
    public XeMay(){

    }

    public DongCo getDongco() {
        return dongco;
    }
}
