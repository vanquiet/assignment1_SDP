package model;

public class Laptop {
    private String cpu;
    private int ram;
    private StorageType storageType;
    private int storageSize;
    private String gpu;
    private double screen;
    private int hz;
    private int power;
    private CoolingType cooling;

    public Laptop() {
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(StorageType storageType, int storageSize) {
        this.storageType = storageType;
        this.storageSize = storageSize;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setDisplay(double screen, int hz) {
        this.screen = screen;
        this.hz = hz;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setCooling(CoolingType cooling) {
        this.cooling = cooling;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public StorageType getStorageType() {
        return storageType;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public String getGpu() {
        return gpu;
    }

    public double getScreen() {
        return screen;
    }

    public int getHz() {
        return hz;
    }

    public int getPower() {
        return power;
    }

    public CoolingType getCooling() {
        return cooling;
    }

    @Override
    public String toString() {
        return "Laptop:\n" +
                "  CPU: " + cpu + "\n" +
                "  RAM: " + ram + " GB\n" +
                "  Storage: " + storageSize + " GB " + (storageType != null ? storageType : "SSD") + "\n" +
                "  GPU: " + (gpu != null ? gpu : "Integrated") + "\n" +
                "  Display: " + screen + "\" (" + hz + " Hz)\n" +
                "  Power: " + power + " W\n" +
                "  Cooling: " + (cooling != null ? cooling.getName() : "None") + "\n";
    }
}