
public class Train {
    private MainWagon mainWagon;
    private Wagon[] wagons = new Wagon[5];
    private char trainCharacter;
    private int position;

    public Train(MainWagon mainWagon, char trainCharacter) {
        this.mainWagon = mainWagon;
        this.trainCharacter = trainCharacter;
    }

    public void setup() {
        position = 0 ;
        wagons[0] = new PassengerWagon(2);
        wagons[1] = new PayloadWagon(4);
        wagons[2] = new PassengerWagon(2);
        wagons[3] = new PayloadWagon(4);
        wagons[4] = new PassengerWagon(2);
    }

    public void accelerate() {
        int totalAccel = mainWagon.getMotorPower() - getTotalSlowDown();
        position += totalAccel;
        System.out.println("avanzamos "+totalAccel);
    }

    private int getTotalSlowDown(){
        int totalSlowDown = 0;
        for (int i = 0; i < wagons.length; i++) {   
            totalSlowDown+= wagons[i].getSlowDown();
        }
        return totalSlowDown;
    }

    public void brake() {
        System.out.println("frenando");
    }

    public int getPosition() {
        return this.position;
    }

    public String getCharacter() {
        String representation = "";
        for (int i = 0; i < wagons.length; i++) {
            representation+="o";
        }
        representation+=this.trainCharacter;
        return representation;
    }

}
