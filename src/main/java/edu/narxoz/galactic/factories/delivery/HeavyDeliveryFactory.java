package edu.narxoz.galactic.factories.delivery;

import edu.narxoz.galactic.bodies.CelestialBody;
import edu.narxoz.galactic.cargo.Cargo;
import edu.narxoz.galactic.drones.Drone;
import edu.narxoz.galactic.factories.drone.DroneCreator;
import edu.narxoz.galactic.factories.drone.HeavyDroneCreator;
import edu.narxoz.galactic.task.DeliveryTask;

public class HeavyDeliveryFactory implements DeliveryFactory {

    private final DroneCreator creator = new HeavyDroneCreator();

    @Override
    public Drone createDrone(String id) {
        return creator.newDrone(id, 50);
    }

    @Override
    public Cargo createCargo(double weightKg, String description) {
        return new Cargo(weightKg, description);
    }

    @Override
    public DeliveryTask createTask(CelestialBody origin, CelestialBody destination, Cargo cargo) {
        return new DeliveryTask(origin, destination, cargo);
    }
}
