package parkinglot.vehicletype;

public abstract class Vehicle {
    protected String licensePlate ;
    protected VehicleType type ;

    public Vehicle(String licensePlate , VehicleType type){
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public VehicleType getVehicleType(){
        return this.type;
    }
}
