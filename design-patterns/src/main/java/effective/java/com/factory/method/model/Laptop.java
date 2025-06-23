package effective.java.com.factory.method.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Laptop extends Computer {
    private final String ram;
    private final String hdd;
    private final String cpu;

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
