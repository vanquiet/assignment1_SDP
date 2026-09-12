package model;

public enum CoolingType {
    FAN("Fan"),
    LIQUID("Liquid Metal");

    private final String name;

    CoolingType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}