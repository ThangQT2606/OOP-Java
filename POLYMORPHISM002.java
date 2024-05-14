import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
interface Moveable {
    void move(int dx, int dy);
}

class Organism implements Moveable {
    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "x:" + this.x + ";y:" + this.y;
    }
}

class Herd {
    private List<Organism> organisms;

    public Herd() {
        this.organisms = new ArrayList<>();
    }

    public void addToHerd(Moveable moveable) {
        if (moveable instanceof Organism) {
            this.organisms.add((Organism) moveable);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Organism organism : this.organisms) {
            result.append(organism.toString());
        }
        return result.toString();
    }

    public void move() {
        for (Organism organism : this.organisms) {
            organism.move(1, 1);
        }
    }
}

public class POLYMORPHISM002 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- >0) 
        {
            Herd herd = new Herd();
            int x = sc.nextInt();
            int y = sc.nextInt();
            Organism organism = new Organism(x, y);
            herd.addToHerd(organism);
            herd.move();
            System.out.println(herd.toString());
        }
    }
}



