package HomeTaskTwelve;

public abstract class Animal {
   private String name;

    public Animal(String name) {
        this.name = name;
    }

    public static void hello (String name) {
        System.out.println("Hello!! I am an animal, my name is " + name);
    }
    public abstract void move();
   public abstract void moveSpeed();
   public abstract void run();
   public abstract void runSpeed();

   public String getName () {
       return name;
    }
 }
