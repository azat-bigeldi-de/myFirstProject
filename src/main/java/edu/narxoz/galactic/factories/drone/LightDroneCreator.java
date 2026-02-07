package edu.narxoz.galactic.factories.drone;

import edu.narxoz.galactic.drones.Drone;
import edu.narxoz.galactic.drones.LightDrone;

public class LightDroneCreator extends DroneCreator {

    @Override
    public Drone createDrone(String id, double maxPayloadKg) {
        return new LightDrone(id, maxPayloadKg);
    }
}
