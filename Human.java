public class Human extends Player {

    public Human(String name, int id) {
        super(name, id);
    }

    

    @Override
    public int getMenuOption() {
        
        return Console.getInt("Ingrese la opcion:");
    }
    

}
