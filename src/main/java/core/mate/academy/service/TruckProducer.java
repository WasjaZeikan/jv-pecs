package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("DAF", 440, 930_000));
        trucks.add(new Truck("MAN", 460, 445_000));
        trucks.add(new Truck("Volvo", 500, 130_000_0));
        return trucks;
    }
}