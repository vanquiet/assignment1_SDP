package builder;

import model.CoolingType;
import model.Laptop;
import model.StorageType;

public class OfficeLaptopBuilder implements LaptopBuilder {
    private Laptop laptop;

    public OfficeLaptopBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.laptop = new Laptop();
        this.laptop.setCooling(CoolingType.FAN);
        this.laptop.setGpu("Integrated Graphics");
    }

    @Override
    public LaptopBuilder setCpu(String cpu) {
        laptop.setCpu(cpu);
        return this;
    }

    @Override
    public LaptopBuilder setRam(int ram) {
        laptop.setRam(ram);
        return this;
    }

    @Override
    public LaptopBuilder setStorage(StorageType type, int size) {
        laptop.setStorage(type, size);
        return this;
    }

    @Override
    public LaptopBuilder setGpu(String gpu) {
        laptop.setGpu(gpu);
        return this;
    }

    @Override
    public LaptopBuilder setDisplay(double screen, int hz) {
        laptop.setDisplay(screen, hz);
        return this;
    }

    @Override
    public LaptopBuilder setPower(int power) {
        laptop.setPower(power);
        return this;
    }

    @Override
    public LaptopBuilder setCooling(CoolingType cooling) {
        laptop.setCooling(cooling);
        return this;
    }

    @Override
    public Laptop build() {
        validate();
        Laptop result = this.laptop;
        this.reset();
        return result;
    }

    private void validate() {
        if (laptop.getCpu() == null || laptop.getCpu().isBlank()) {
            throw new IllegalStateException("CPU is required");
        }
        if (laptop.getRam() < 8) {
            throw new IllegalStateException("Office laptop needs at least 8 GB RAM");
        }
        if (laptop.getPower() < 45) {
            throw new IllegalStateException("Power adapter must be at least 45W");
        }
    }
}