package edu.narxoz.galactic.factories.drone;

import edu.narxoz.galactic.drones.Drone;

public abstract class DroneCreator {

    // Factory Method
    public abstract Drone createDrone(String id, double maxPayloadKg);

    public Drone newDrone(String id, double maxPayloadKg) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("id is empty");
        }
        return createDrone(id, maxPayloadKg);
    }
}
