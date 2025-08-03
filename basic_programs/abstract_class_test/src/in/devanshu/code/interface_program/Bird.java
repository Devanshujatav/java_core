package in.devanshu.code.interface_program;

public abstract class Bird implements Flyable {
    private final String breed;

    // Constructor
    public Bird(String breed){
        this.breed = breed;
    }

    // Getter
    public String getBreed(){
        return this.breed;
    }
}
