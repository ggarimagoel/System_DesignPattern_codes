package Factory_pattern;

public class IosUIFactory_2 implements UIfactory_2{
    public Button_2 createButton(){
        return new IosButton_2();
    }
    public Menu_2 createMenu(){
        return new IosMenu_2();
    }

}
