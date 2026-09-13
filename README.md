# Laptop Configurator (Builder Pattern)

Console Java app demonstrating the Builder design pattern for custom laptop assembly.

## 1. Product
The `Laptop` product contains:
- CPU, RAM, GPU
- Storage (SSD or HDD)
- Display (size, refresh rate)
- Power adapter (watts)
- Cooling system (fan or liquid metal)

## 2. Structure
- `src/model/`: `Laptop`, `StorageType`, `CoolingType`
- `src/builder/`: `LaptopBuilder`, `GamingLaptopBuilder`, `OfficeLaptopBuilder`
- `src/director/`: `LaptopDirector`
- `src/Client.java`: Entry point

## 3. How to Build

### Using Director (Presets)
```java
LaptopDirector director = new LaptopDirector();

// Gaming
LaptopBuilder gamingBuilder = new GamingLaptopBuilder();
director.buildGaming(gamingBuilder);
Laptop gaming = gamingBuilder.build();

// Office
LaptopBuilder officeBuilder = new OfficeLaptopBuilder();
director.buildOffice(officeBuilder);
Laptop office = officeBuilder.build();
