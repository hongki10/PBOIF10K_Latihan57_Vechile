/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Vechile
 */

 public class Skateboard extends Vehicle {
    private double myBoardLength;
    
    public Skateboard() {
        System.out.println("Skateboard");
    }
    
    public double getBoardLength() {
        return myBoardLength;
    }
    
    public void setBoardLength(double boardLength) {
        this.myBoardLength = boardLength;
    }
}
