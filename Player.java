
public abstract class Player {

    private String name;
    private int id;
    protected Train train;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }



    @Override
    public String toString() {
        return "Player [name=" + name + ", id=" + id + "]";
    }



    public void setTrain(Train train) {
        this.train = train;
    }

    
    public void stop() {
        train.brake();
    }

    
    public void forward() {
        train.accelerate();
    }



    public abstract int getMenuOption();

    

}
