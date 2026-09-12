package builder;

import model.CoolingType;
import model.Laptop;
import model.StorageType;

public interface LaptopBuilder {
    void reset();
    LaptopBuilder setCpu(String cpu);
    LaptopBuilder setRam(int ram);
    LaptopBuilder setStorage(StorageType type, int size);
    LaptopBuilder setGpu(String gpu);
    LaptopBuilder setDisplay(double screen, int hz);
    LaptopBuilder setPower(int power);
    LaptopBuilder setCooling(CoolingType cooling);
    Laptop build();
}