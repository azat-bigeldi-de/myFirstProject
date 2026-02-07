package edu.narxoz.galactic.factories.drone;

import edu.narxoz.galactic.drones.Drone;
import edu.narxoz.galactic.drones.HeavyDrone;

public class HeavyDroneCreator extends DroneCreator {

    @Override
    public Drone createDrone(String id, double maxPayloadKg) {
        return new HeavyDrone(id, maxPayloadKg);
    }
}
