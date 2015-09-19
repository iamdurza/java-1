import java.util.ArrayList;


public abstract interface PokemonInterface { 
    public double height = 0;
    public double weight = 0;
    public int speed = 0;
    public int hp = 0;
    public ArrayList<Type> type = new ArrayList<Type>();
    public int attack = 0;
    public int specialAttak = 0;
    public int defence = 0;
    public int SpecialDefense = 0;
    public ArrayList<Move> moves = new ArrayList<Move>();
    public ArrayList<Ability> abilities = new ArrayList<Ability>();


}
