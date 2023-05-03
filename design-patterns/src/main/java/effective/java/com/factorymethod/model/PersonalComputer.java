package effective.java.com.factorymethod.model;

public class PersonalComputer extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public PersonalComputer(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String getCPU() {
        return cpu;
    }
}