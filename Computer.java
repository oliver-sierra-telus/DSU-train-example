import java.util.Random;

public class Computer extends Player{

    private int[] opciones ={1,2,5};

    public Computer(String name, int id) {
        super(name, id);
        //TODO Auto-generated constructor stub
    }

    @Override
    public int getMenuOption() {
        Random rn = new Random();
        int tmp = opciones[rn.nextInt(3)];
        System.out.println("tmp "+tmp);
        return tmp;
    }

}

