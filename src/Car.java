public class Car extends Vehicle{
    int id;
    Car(){
    }

    public void setID(int id){
        this.id=id;
    }

    @Override
    public void move(int id) {
        System.out.println("Автомобиль № " + id + " - выехал.");
    }


}
