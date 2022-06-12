public class Pszczola extends Owad{
    private int zebranyNektar;

    public Pszczola(){
        this.szybkoscPoruszania = 2;
    }

    public int getZebranyNektar() {
        return zebranyNektar;
    }

    public void setZebranyNektar(int nektar) {
        zebranyNektar += nektar;
    }

    public void zerujNektar(){
        zebranyNektar = 0;
    }
}
