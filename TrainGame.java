public class TrainGame {

    private Player player;
    private Train train;
    private Track track;

    public void statistics() {
        System.out.println("final del juego");
        track.paint();
    }

    public void execute() {
        int menuOption = 0;
        while (menuOption != 5) {
            System.out.println("Turno del jugador \n");
            track.paint();
            System.out.println("\n");
            System.out.println("1). Adelante");            
            System.out.println("2). Freno");
            System.out.println("5). Exit");
            menuOption = player.getMenuOption();
            if (menuOption == 1) {
                player.forward();
            }
            if (menuOption == 2){
                player.stop();
            }
        }
    }

    public void setup() {
        //agregar comuninicacion con el usuario
        player = new Human("oliver", 3);
        train = new Train(new MainWagon(16),'O');
        train.setup();
        player.setTrain(train);
        track = new Track(30);
        track.setTrain(train);
    }

}
