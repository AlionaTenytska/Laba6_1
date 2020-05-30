public class RollerScates extends Vehicle {
    int id;

    RollerScates(){ }

    public void setId(int id){
        this.id=id;
    }

    @Override
    public void move(int id) { System.out.println("Человек на роликах № " + id + " - выехал."); }
}
