package edu.narxoz.galactic.task;

import edu.narxoz.galactic.bodies.CelestialBody;
import edu.narxoz.galactic.cargo.Cargo;
import edu.narxoz.galactic.drones.Drone;

public class DeliveryTask {
    private CelestialBody origin;
    private CelestialBody destination;
    private Cargo cargo;

    private TaskState state;
    private Drone assignedDrone;

    public DeliveryTask(CelestialBody origin, CelestialBody destination, Cargo cargo) {
        if (origin == null || destination == null || cargo == null)
            throw new IllegalArgumentException("origin/destination/cargo cannot be null");

        this.origin = origin;
        this.destination = destination;
        this.cargo = cargo;

        this.state = TaskState.CREATED;
        this.assignedDrone = null;
    }

    public CelestialBody getOrigin() { 
        return origin; 
    }
    public CelestialBody getDestination() { 
        return destination; 
    }
    public Cargo getCargo() { 
        return cargo; 
    }
    public TaskState getState() { 
        return state; 
    }
    public Drone getAssignedDrone() { 
        return assignedDrone; 
    }

    public double estimateTime() {
        if (assignedDrone == null) throw new IllegalStateException("assignedDrone is null");
        return origin.distanceTo(destination) / assignedDrone.speedKmPerMin();
    }

    public void attachDrone(Drone drone) { this.assignedDrone = drone; }
    public void changeState(TaskState newState) { this.state = newState; }
}
