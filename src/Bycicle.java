public class Bycicle extends Vehicle {
    int id;

    Bycicle(){}

    public void setId(int id){
        this.id=id;
    }

    @Override
    public void move(int id) {
        System.out.println("Велосипед № " + id + " - выехал.");
    }
}
