public class Jumpers extends Vehicle {
    int id;

    Jumpers(){}

    public void setId(int id){
        this.id=id;
    }

    @Override
    public void move(int id) { System.out.println("Джампер № " + id + " - выехал."); }
}
