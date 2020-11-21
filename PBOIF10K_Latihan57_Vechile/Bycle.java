/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Vechile
 */

public class Bicycle extends Vehicle {
    private int myGearCount;
    
    public Bicycle() {
        System.out.println("Bicycle");
    }
    
    public int getGearCount() {
        return myGearCount;
    }
    
    public void setGearCount(int gearCount) {
        this.myGearCount = gearCount;
    }
}