import javafx.geometry.Point3D;

/**
 * This class represents an abstract prototype & defines the clone method
 */

public abstract class GameUnit implements Cloneable{

    private Point3D position;
    private String value = "original";

    public String getValue() {
        return value;
    }

    public GameUnit(){
        this.position = Point3D.ZERO;
    }

    public GameUnit(float x, float y, float z){
        this.position = new Point3D(x,y,z);
    }

    public void move(Point3D direction, float distance){
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    public Point3D getPosition() {
        return position;
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit) super.clone();
        unit.initialize();
        unit.reset();
        unit.value = "clone";
        return unit;
    }

    public void initialize(){
        this.position = Point3D.ZERO;
    }

    abstract void reset();

}
