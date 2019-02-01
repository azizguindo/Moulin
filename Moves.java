import java.util.ArrayList;

public class Moves {
    public ArrayList<Move> moves;

    public Moves(ArrayList<Move> moves) {
        this.moves = moves;
    }

    public void add(Move move){
        moves.add(move);
    }
}
