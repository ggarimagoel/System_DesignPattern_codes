package Factory_pattern;

public class AndroidUIFactory_2 implements UIfactory_2{
    public Button_2 createButton(){
        return new AndroidButton_2();
    }
    public Menu_2 createMenu(){
        return new AndroidMenu_2();
    }
}
