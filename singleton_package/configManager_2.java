package singleton_package;

public class configManager_2 {
    private  static configManager_2 instance;
    private String config;

    private configManager_2(){
        config = "default configuration";
    }

    public static synchronized configManager_2 getInstance() {
        if(instance == null){
            instance = new configManager_2();
        }
        return instance;
    }
    public String getConfig(){
        return config ;
    }

}
