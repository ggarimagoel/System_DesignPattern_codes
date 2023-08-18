package flyweight_pattern;


import com.sun.jdi.InconsistentDebugInfoException;

// we'll create a concrete implementation of the flyweight object,
// which represents the graphical representation of a character.
public class Character implements flyweight_gameObj{
    private String name;
    private String image;  // Assuming image path or graphic representation

    public Character(String name , String image){   // constructor
        this.name = name;
        this.image = image;
    }

    public void draw(int x , int y){
        // Here, we would render the character's image at the given x and y coordinates
        System.out.println("character   "  + name  + "  at  " + x  + "  ,  " + y );
        // ... render the character's image using the 'image' property ...
    }

}
