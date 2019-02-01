public class Board {

    private Moves moves;
    private Graph graph;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private boolean tour;
    public Board(){
        this.graph =  new Graph();
        player1 = new Player(9);
        player2 = new Player(9);
        tour = false;
    }
    public Moves getMoves(){
        return moves;
    }
    public void makeMove(){
        tour = !tour;
    }
    public void evaluate(){

    }

    public void currentPlayer(){
        if(tour){
            currentPlayer = player1;
        }
        else currentPlayer = player2;
    }

    public void setBoard(){
        graph.add(new Node("A"));
        graph.add(new Node("B"));
        graph.add(new Node("C"));
        graph.add(new Node("D"));
        graph.add(new Node("E"));
        graph.add(new Node("F"));
        graph.add(new Node("G"));
        graph.add(new Node("H"));
        graph.add(new Node("I"));
        graph.add(new Node("J"));
        graph.add(new Node("K"));
        graph.add(new Node("L"));
        graph.add(new Node("M"));
        graph.add(new Node("N"));
        graph.add(new Node("O"));
        graph.add(new Node("P"));
        graph.add(new Node("Q"));
        graph.add(new Node("R"));
        graph.add(new Node("S"));
        graph.add(new Node("T"));
        graph.add(new Node("U"));
        graph.add(new Node("V"));
        graph.add(new Node("W"));
        graph.add(new Node("X"));
    }

    public boolean isGameOver(){
        boolean gameOver = false;
        if(player1.getNbPions()==2 || player2.getNbPions()==2){
            gameOver = true;
        }
        return gameOver;
    }


}
