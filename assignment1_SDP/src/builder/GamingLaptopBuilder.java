package builder;

import model.CoolingType;
import model.Laptop;
import model.StorageType;

public class GamingLaptopBuilder implements LaptopBuilder {
    private Laptop laptop;

    public GamingLaptopBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.laptop = new Laptop();
        this.laptop.setCooling(CoolingType.LIQUID);
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
        if (laptop.getGpu() == null || laptop.getGpu().isBlank()) {
            throw new IllegalStateException("Gaming laptop requires dedicated GPU");
        }
        if (laptop.getRam() < 16) {
            throw new IllegalStateException("Gaming laptop needs at least 16 GB RAM");
        }
        if (laptop.getHz() < 144) {
            throw new IllegalStateException("Display refresh rate must be 144 Hz or higher");
        }
        if (laptop.getPower() < 200) {
            throw new IllegalStateException("Power adapter must be at least 200W");
        }
    }
}