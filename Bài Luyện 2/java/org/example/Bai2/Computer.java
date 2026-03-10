package org.example.Bai2;

public class Computer {
    private String HDD;
    private String RAM;
    private boolean isBluethoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isBluethoothEnabled = builder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer: " +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", Bluethooth=" + isBluethoothEnabled +
                '}';
    }

    public static class ComputerBuilder{
        private String HDD;
        private String RAM;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }
        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
