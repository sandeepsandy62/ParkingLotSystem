# 🚗 Parking Lot System

A simple, object-oriented Parking Lot System built in Java. The system supports multiple levels, various vehicle types, and real-time parking spot tracking.

---

## 📋 Requirements

- The parking lot has **multiple levels**, each with a specific number of parking spots.
- It supports different types of vehicles: **Cars**, **Motorcycles**, and **Trucks**.
- Each parking spot is designed to accommodate a specific **vehicle type**.
- Upon vehicle **entry**, the system assigns an available and appropriate spot.
- Upon **exit**, the system releases the parking spot.
- It tracks parking spot **availability in real-time** and provides this information to customers.
- The system handles **multiple entry and exit points** and supports **concurrent access** using thread-safe operations.

---

## 🚀 How to Run the Project

Make sure you have Maven installed. Then, from the project root directory, run:

```mvn exec:java -Dexec.mainClass="parkinglot.ParkingLotDemo"```

## Project Structure
```
parkinglot/
├── Level.java
├── ParkingLot.java
├── ParkingLotDemo.java
├── ParkingSpot.java
└── vehicletype/
    ├── Car.java
    ├── MotorCycle.java
    ├── Truck.java
    ├── Vehicle.java
    └── VehicleType.java
```
