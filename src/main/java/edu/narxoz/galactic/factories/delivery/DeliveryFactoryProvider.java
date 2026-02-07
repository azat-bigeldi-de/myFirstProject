package edu.narxoz.galactic.factories.delivery;

public class DeliveryFactoryProvider {

    public static DeliveryFactory forCargoWeight(double weightKg) {
        if (weightKg <= 10) {
            return new LightDeliveryFactory();
        }
        return new HeavyDeliveryFactory();
    }
}
