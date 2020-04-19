import java.util.ArrayList;

public class Board {

    private ArrayList<Square> squares;

    public Board(){
        squares = new ArrayList<>(40);
        squares.add(new GoSquare("Go", 0));
        for(int i = 1; i < 40; ++i){
            // TODO generate all types of squares
            squares.add(new RegularSquare("Square "+i, i));
        }
    }

    public Square getSquare(Square oldLoc, int fvTot){
        if (oldLoc.getIndex() < 0 || oldLoc.getIndex()  > 39)
            throw new IndexOutOfBoundsException("oldLoc must be between 0 and 39 inclusive");
        if (fvTot < 2 || fvTot > 12)
            throw new IndexOutOfBoundsException("fvTot must be between 2 and 12 inclusive");

        Square s = squares.get((oldLoc.getIndex()  + fvTot) % 40);

        return squares.get((oldLoc.getIndex()  + fvTot) % 40);
    }

    /**
     * Return the first Square that is the "Go" Square
     * @return The "Go" Square
     */
    public Square getSquareByIndex(int index){
        if(index < 0 || index > 39){
            throw new IndexOutOfBoundsException("oldLoc must be between 0 and 39 inclusive");
        }

        return squares.get(index);
    }

}
