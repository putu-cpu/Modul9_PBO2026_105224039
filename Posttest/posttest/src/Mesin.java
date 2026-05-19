public class Mesin {
    String tipeMesin ; 
    int kapasitasCC; 

    public Mesin(String tipeMesin , int kapasitasCC) {
        this.tipeMesin = tipeMesin; 
        this.kapasitasCC = kapasitasCC; 
    }

    public void tampilkanMesin() {
        System.out.println("Mesin : " + tipeMesin + "" + kapasitasCC + "cc");
    }
}
