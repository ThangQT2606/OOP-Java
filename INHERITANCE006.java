class Animal 
{
    protected int numberOfLegs;
   
    public void walk() 
    {
        System.out.println("This animal walks on " + numberOfLegs + " legs.");
    }
    public void eat() 
    {
        
    }
}
class Spider extends Animal 
{
    
    public Spider() 
    {
        numberOfLegs = 8;
    }

    public void eat() 
    {
        System.out.println("The spider eats a fly.");
    }
}


class Cat extends Animal 
{
   
    public Cat() 
    {
        numberOfLegs = 4;
    }    
    public void play() 
    {
        System.out.println("Fluffy likes to play with string.");
    } 
    public void eat() 
    {
        System.out.println("Cats like to eat spiders and mice.");
    }
}
class Fish extends Animal 
{
    public Fish() 
    {
        numberOfLegs = 0;
    }
    public void walk() 
    {
        System.out.println("Fish, of course, can't walk; they swim.");
    }
    public void eat() 
    {
        System.out.println("Fish eat pond scum.");
    }    
    public void swim() 
    {
        System.out.println("Fish swim in their tanks all day.");
    }
}
public class INHERITANCE006 
{
    public static void main(String[] args)
    {
        Fish fish = new Fish();
        fish.swim();

        Animal animal = new Animal();
        animal.walk();

        fish.walk();

        Cat cat = new Cat();
        cat.play();

        cat.eat();

        Spider spider = new Spider();
        spider.eat();

        Cat cat2 = new Cat();
        cat2.walk();

        Spider spider2 = new Spider();
        spider2.walk();
    }
}