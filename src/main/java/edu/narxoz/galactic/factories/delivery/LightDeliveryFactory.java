package edu.narxoz.galactic.factories.delivery;

import edu.narxoz.galactic.bodies.CelestialBody;
import edu.narxoz.galactic.cargo.Cargo;
import edu.narxoz.galactic.drones.Drone;
import edu.narxoz.galactic.factories.drone.DroneCreator;
import edu.narxoz.galactic.factories.drone.LightDroneCreator;
import edu.narxoz.galactic.task.DeliveryTask;

public class LightDeliveryFactory implements DeliveryFactory {

    private final DroneCreator creator = new LightDroneCreator();

    @Override
    public Drone createDrone(String id) {
        // у light дрона допустим маленькая грузоподъёмность (пример)
        return creator.newDrone(id, 10);
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
