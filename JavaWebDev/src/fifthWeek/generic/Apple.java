package fifthWeek.generic;

public class Apple implements Eatable {
	public String toString() {
        return "I am an apple.";
    }
    
    @Override
    public String eat() {
        return "It tastes so good!";
    }
}
