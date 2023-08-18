package builderPattern;

public class computer_2 {
    private String cpu;
    private int ram;
    private int storage;

    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public static Builder getBuilder(){
        return new Builder();
    }
    public String toString(){
        return " CPU =  " + cpu + " RAM =  " + ram + "Storage =  " + storage;
    }
   private computer_2(Builder builder ){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage =  builder.storage;
   }
    public static class Builder {
        private String cpu;
        private int ram;
        private int storage;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }
        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public computer_2 build() {
            if (isValidRam(this.ram) == false) {
                throw new IllegalArgumentException("invalid ram input");
            }
            return new computer_2(this);
        }

        private boolean isValidRam(int ram) {
            if (ram < 4 || ram > 128) {
                return false;
            }
            return true;
        }
    }
}
