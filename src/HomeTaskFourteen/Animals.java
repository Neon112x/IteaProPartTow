package HomeTaskFourteen;

public enum Animals {
    DOG(3), FOX(7), SHARK(19), MANKY(2);
int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal " + super.toString() +
                ", age = " + age;
    }
}
