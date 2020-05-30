public class Main {
    public static void main(String[] args) {

        int size = 5;
        int limitVehicle = 10;
        Server server = new Server(size,limitVehicle);

        while (server.getCurrentCountVehicle() < server.getLimitVehicle())
        {
            int number = (int) (Math.random()*size);
            switch(number)
            {
                case 0:{
                    server.addTransport(0, new Car());
                }
                case 1:{
                    server.addTransport(1, new Bycicle());
                }
                case 2:{
                    server.addTransport(2, new RollerScates());
                }
                case 3:{
                    server.addTransport(3, new Jumpers());
                }
            }
        }
        System.out.println();
        int[] countVehicles = server.getCountVehicles();

        for(int i = 0; i < 5; i++)
        {
            switch(i)
            {
                case 0:{
                    System.out.println("Машин -  " + countVehicles[i]);
                    break;
                }
                case 1:{
                    System.out.println("Велосипедов - " + countVehicles[i]);
                    break;
                }
                case 2:{
                    System.out.println("Человеков на роликах - " + countVehicles[i]);
                    break;
                }
                case 3:{
                    System.out.println("Джамперов - " + countVehicles[i]);
                    break;
                }
            }
        }
    }
}
