package game;

public class Ship {
    int size;
    int hits;

    public Ship (int size){
        this.size = size;
        hits = 0;
    }

    public void takeHit (){
        hits += 1;
    }

    public boolean sank (){
        return (hits == size);
    }
}
