package Factory_pattern;

public class factoryClient_2 {
    public static void main(String[] args) {
    Flutter_2 f = new Flutter_2();
    UIfactory_2 ui = f.createUIFactory(SupportedPlatform_2.IOS);

    Button_2 b  = ui.createButton();
    Menu_2 m = ui.createMenu();
    }
}
