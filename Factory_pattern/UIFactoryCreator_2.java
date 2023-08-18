package Factory_pattern;

public class UIFactoryCreator_2 {
    public static UIfactory_2 getUIFactoryForPlatform(SupportedPlatform_2 platform){

        if(platform ==SupportedPlatform_2.ANDROID){
            return new AndroidUIFactory_2();
        }
        else{
            return new  IosUIFactory_2();
        }
    }
}
