public class Ul {
    private int sumaNektaru = 0;
    public int liczbaPszczol;

    private void liczNektar(){
        if(sumaNektaru >= 50){
            tworzeniePszczoly();
            sumaNektaru -= 50;
        }
    }
    private void tworzeniePszczoly(){

    }
    public void setSumaNektaru(int nowyNektar) {
        sumaNektaru += nowyNektar;
    }
    
}
