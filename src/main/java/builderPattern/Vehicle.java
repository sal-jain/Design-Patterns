package builderPattern;

public class Vehicle {

    //Required
    private String engine;
    private int wheel;

    //Optional parameter
    private int airbags;
    public String getEngine() {
        return engine;
    }

    public int getAirbags() {
        return airbags;
    }

    public int getWheel() {
        return wheel;
    }
    private Vehicle(VehicleBuilder vehicleBuilder){
        this.engine = vehicleBuilder.engine;
        this.wheel = vehicleBuilder.wheel;
        this.airbags = vehicleBuilder.airbags;
    }
    public static class VehicleBuilder{
        private String engine;
        private int wheel;

        public VehicleBuilder setAirbags(int airbags) {
            this.airbags = airbags;
            return this;
        }
        private int airbags;
        public VehicleBuilder(String engine , int wheel){
            this.engine = engine;
            this.wheel = wheel;
        }
        public Vehicle build(){
            return new Vehicle(this);
        }
    }
}
