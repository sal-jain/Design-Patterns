package builderPattern;

public class VehicleClient {
    public static void main(String[] args) {
        Vehicle car = new Vehicle.VehicleBuilder("150cc", 4).setAirbags(4).build();
        Vehicle bike = new Vehicle.VehicleBuilder("300cc",2).build();
        System.out.println("Vehicle Engine: "+car.getEngine());
        System.out.println("No. of wheels: "+car.getWheel());
        System.out.println("No. of airbags available: "+car.getAirbags());
        System.out.println("Vehicle Engine: "+bike.getEngine());
        System.out.println("No. of wheels: "+bike.getWheel());
        System.out.println("No. of airbags available: "+bike.getAirbags());
    }
}
