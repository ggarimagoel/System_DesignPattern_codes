package flyweight_pattern;
import java.util.HashMap;
import java.util.Map;


//Now, we create a Flyweight factory to manage the flyweight
// objects and ensure that we reuse existing objects when possible:
public class gameObjFactory {
private Map<String, flyweight_gameObj> characters = new HashMap<>();

public flyweight_gameObj getCharacter(String name , String image){
    if(!characters.containsKey(name) ){
        characters.put(name, new Character(name , image));
    }
    return characters.get(name);
}

}
