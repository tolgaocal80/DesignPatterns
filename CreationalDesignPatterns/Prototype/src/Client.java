import javafx.geometry.Point3D;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Swordsman swordsman = new Swordsman();
        swordsman.move(new Point3D(12,543,32),10);
        swordsman.attack();

        System.out.println(swordsman);

        Swordsman swordsman1 = (Swordsman) swordsman.clone();
        System.out.println(swordsman1);


    }
}
