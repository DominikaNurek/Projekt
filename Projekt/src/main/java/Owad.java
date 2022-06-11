public abstract class Owad {
    private int [][] wspolrzedne;

    protected int szerszenieWokol;
    protected int pszcczolyWokol;
    protected int liczbaGatunku;  //zmienna, która zlicza ile jest owadow danego gatunku
    protected byte szybkoscPoruszania;

    protected void ruch (byte szybkoscPoruszania){

    }
    protected void sprawdzOkolice(){
        
    }

    public int[][] getWspolrzedne() {
        return wspolrzedne;
    }
    public void setWspolrzedne(int[][] wspolrzedne) {
        this.wspolrzedne = wspolrzedne;
    }
    public byte getSzybkoscPoruszania() {
        return szybkoscPoruszania;
    }
    public int getLiczbaGatunku() {
        return liczbaGatunku;
    }
    public void setLiczbaGatunku(int liczbaGatunku) {
        this.liczbaGatunku = liczbaGatunku;
    }
}
