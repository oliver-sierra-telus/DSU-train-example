public class Track {
    private Train train;
    private int size;

    public Track(int size) {
        this.size = size;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public void paint() {
        int trainPosition = train.getPosition();
        for (int i = 0; i < size; i++) {
            if (trainPosition == i){
                System.out.print(train.getCharacter());
            }
            else{
                System.out.print("_");
            }
        }
    }
    
}

