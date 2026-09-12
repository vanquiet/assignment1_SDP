import builder.GamingLaptopBuilder;
import builder.LaptopBuilder;
import builder.OfficeLaptopBuilder;
import director.LaptopDirector;
import model.CoolingType;
import model.Laptop;
import model.StorageType;

public class Client {
    public static void main(String[] args) {
        LaptopDirector director = new LaptopDirector();

        LaptopBuilder gamingBuilder = new GamingLaptopBuilder();
        director.buildGaming(gamingBuilder);
        Laptop gaming = gamingBuilder.build();
        System.out.println(gaming);

        LaptopBuilder officeBuilder = new OfficeLaptopBuilder();
        director.buildOffice(officeBuilder);
        Laptop office = officeBuilder.build();
        System.out.println(office);

        Laptop scar = new GamingLaptopBuilder()
                .setCpu("Intel Core Ultra 9 285HX")
                .setRam(64)
                .setGpu("NVIDIA GeForce RTX 5090")
                .setStorage(StorageType.SSD, 2048)
                .setDisplay(18.0, 240)
                .setPower(330)
                .setCooling(CoolingType.LIQUID)
                .build();

        System.out.println(scar);

        try {
            new GamingLaptopBuilder()
                    .setCpu("Intel Core i7-13650HX")
                    .setRam(16)
                    .setDisplay(18.0, 240)
                    .setPower(280)
                    .build();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}