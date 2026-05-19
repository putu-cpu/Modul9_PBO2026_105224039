public class KomputerServer {
    String nama; 
    Hardisk hardisk; 
    Monitor monitor;
    
    KomputerServer (String nama, Hardisk hardisk , Monitor monitor) {
        this.nama = nama; 
        this.hardisk = hardisk; 
        this.monitor = monitor; 
    }

    void tampilkan () {
        System.out.println("Server :" + nama);
        System.out.println("Hardisk :" + hardisk);
        System.out.println("Monitor :" + monitor);
    }

}
