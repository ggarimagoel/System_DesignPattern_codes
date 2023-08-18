package Factory_pattern;

public class Flutter_2 {
    public void setTheme(){

    }
    public void setRefreshRate(){

    }
    UIfactory_2 createUIFactory(SupportedPlatform_2 platform){
        return UIFactoryCreator_2.getUIFactoryForPlatform(platform);
    }
}
