public class Pszczola extends Owad{
    private int zebranyNektar;

    private Pszczola(){
        this.szybkoscPoruszania = 2;
    }

    public int getZebranyNektar() {
        return zebranyNektar;
    }
    
    public void setZebranyNektar(int nektar) { //tutaj gdy pszczola zbiera nektar z kwiatu to sumujemy to co zebrala
        zebranyNektar += nektar;
    }
    
    public void zerujNektar(){   //zerowanie nektaru po tym jak pszczola zostawi go w ulu
        zebranyNektar = 0;
    }
}
