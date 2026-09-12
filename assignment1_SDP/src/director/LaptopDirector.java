package director;

import builder.LaptopBuilder;
import model.CoolingType;
import model.StorageType;

public class LaptopDirector {

    public void buildGaming(LaptopBuilder builder) {
        builder.reset();
        builder.setCpu("Intel Core i7-13650HX")
                .setRam(16)
                .setStorage(StorageType.SSD, 1024)
                .setGpu("NVIDIA GeForce RTX 4060")
                .setDisplay(18.0, 240)
                .setPower(280)
                .setCooling(CoolingType.LIQUID);
    }

    public void buildOffice(LaptopBuilder builder) {
        builder.reset();
        builder.setCpu("Intel Core i3-7100U")
                .setRam(8)
                .setStorage(StorageType.HDD, 256)
                .setGpu("Intel HD Graphics")
                .setDisplay(14.0, 60)
                .setPower(65)
                .setCooling(CoolingType.FAN);
    }
}