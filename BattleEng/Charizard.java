import java.util.ArrayList;


final public class Charizard implements PokemonInterface {
    public double height = 1.7;
    public double weight = 90.5;
    public int speed = 100;
    public int hp = 78;
    public int attack = 84;
    public int specialAttak = 109;
    public int defence = 78;
    public int SpecialDefense = 85;
    public ArrayList<Move> moves = new ArrayList<Move>();
    public ArrayList<Ability> abilities = new ArrayList<Ability>();
    public ArrayList<Type> type = new ArrayList<Type>();
    
    public Charizard() {
        moves.add(new Growl()); 
        //moves.add(new Scratch()); 
        //moves.add(new Ember()); 
        //moves.add(new Leer()); 
    }

}
