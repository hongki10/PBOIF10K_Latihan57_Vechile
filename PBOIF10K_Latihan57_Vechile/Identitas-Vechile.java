/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Vechile
 */

 public class Latihan57IdentintasVehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setBrand("Trek Bike");
        bicycle.setModel("7.4FX");
        bicycle.setGearCount(23);
        
        System.out.println("Brand : " + bicycle.getBrand());
        System.out.println("Model : " + bicycle.getModel());
        System.out.println("Jumlah Gear : " + bicycle.getGearCount());
        
        System.out.println();
        
        Skateboard skateboard = new Skateboard();
        skateboard.setBrand("Ally Skate");
        skateboard.setModel("Rocket");
        skateboard.setBoardLength(54.5);
        
        System.out.println("Brand : " + skateboard.getBrand());
        System.out.println("Model : " + skateboard.getModel());
        System.out.println("Jumlah Gear : " + skateboard.getBoardLength());
    }
    
}