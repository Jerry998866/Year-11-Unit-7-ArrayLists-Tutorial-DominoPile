import java.util.ArrayList;
import java.util.Random;
public class DominoPile {
    private Random rand = new Random();
    private ArrayList<Domino> pile ;

    public ArrayList<Domino> getPile(){
        return pile;
    }
    public DominoPile(){
        pile = new ArrayList<>();
    }

    public void newStack6(){
        for (int i = 0; i<=6; i++){
            for (int j =i; j<=6; j++){
                Domino domino = new Domino(i,j);
                pile.add(domino);
            }
        }
    }

    public void shuffle(){
        ArrayList<Domino> newPile = new ArrayList<>();
        int newIndex = rand.nextInt(0,pile.size());
        int previousIndex = -1;
        for (int i = 0; i<pile.size();i++){
            if (newIndex != previousIndex) {
                newPile.add(pile.get(newIndex));
                previousIndex = newIndex;
            }
        }
    }
}