package parkinglot;

import java.util.ArrayList;
import java.util.List;

import parkinglot.vehicletype.Vehicle;
import parkinglot.vehicletype.VehicleType;

public class Level {
     private final int floor ;
     private final List<ParkingSpot>parkingSpots;

     public Level(int floor , int numSpots){
        this.floor = floor ;
        parkingSpots = new ArrayList<>(numSpots);

        double spotsForBikes = 0.50;
        double spotForCars = 0.40;

        int numBikes = (int) (numSpots*spotsForBikes);
        int numCars = (int) (numSpots*spotForCars);

        for(int i = 1 ; i <= numBikes ; i++) parkingSpots.add(new ParkingSpot(i, VehicleType.MOTORCYCLE));
        for(int i = numBikes+1 ; i <= numBikes+numCars ; i++) parkingSpots.add(new ParkingSpot(i, VehicleType.CAR));
        for(int i = numBikes+numCars+1 ; i <= numSpots ; i++) parkingSpots.add(new ParkingSpot(i, VehicleType.TRUCK));
     }

     public boolean parkVehicle(Vehicle vehicle){
        for(ParkingSpot spot : parkingSpots){
            if(spot.isAvailable() && spot.getVehicleType() == vehicle.getVehicleType()){
                spot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
     }

     public boolean unparkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isAvailable() && spot.getParkedVehicle().equals(vehicle)) {
                spot.unparkVehicle();
                return true;
            }
        }
        return false;
    }
    public void displayAvailability() {
        System.out.println("Level " + floor + " Availability:");
        for (ParkingSpot spot : parkingSpots) {
            System.out.println("Spot " + spot.getSpotNumber() + ": " + (spot.isAvailable() ? "Available For"  : "Occupied By ")+" "+spot.getVehicleType());
        }
    }

}
