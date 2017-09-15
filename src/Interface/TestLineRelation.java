
package Interface;

public class TestLineRelation {
    public static void main(String []args){
        //membuat 2 objek
        Line line = new Line(13,37,20,4);
        Line line2 = new Line(34,23,16,9);
        //lenght objek 1 dan 2
        System.out.println("Panjang Angka Objek 1 = "+line.getLength());
        System.out.println("Panjang Angka Objek 2 = "+line2.getLength());
        System.out.println("");
        //Perbandingan
        System.out.println("Perbandingan Objek 1 > Objek 2 = "+line.isGreater(line,line2));
        System.out.println("Perbandingan Objek 1 < Objek 2 = "+line.isLess(line,line2));
        System.out.println("Perbandingan Objek 1 = Objek 2 = "+line.isEqual(line,line2));
    }
}
