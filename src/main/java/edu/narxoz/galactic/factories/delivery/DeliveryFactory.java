package edu.narxoz.galactic.factories.delivery;

import edu.narxoz.galactic.bodies.CelestialBody;
import edu.narxoz.galactic.cargo.Cargo;
import edu.narxoz.galactic.drones.Drone;
import edu.narxoz.galactic.task.DeliveryTask;

public interface DeliveryFactory {
    Drone createDrone(String id);
    Cargo createCargo(double weightKg, String description);
    DeliveryTask createTask(CelestialBody origin, CelestialBody destination, Cargo cargo);
}
