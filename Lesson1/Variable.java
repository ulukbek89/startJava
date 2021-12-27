public class Variable {
    public static void main(String[] args) {
        int modelCpu = 3600;
        byte coresCpu = 6;
        short threadsCpu = 12;
        long cpuProductId = 100000031;
        char familyCpu = 'F';
        float coreSpeed = 3949.08f;
        double coreVoltage = 1.352d;
        boolean unlockCpu = true;

        System.out.println("Proccessor model: " + modelCpu);
        System.out.println("Cores: " + coresCpu);
        System.out.println("Threads: " + threadsCpu);
        System.out.println("CPU Product ID: " + cpuProductId);
        System.out.println("Family CPU: " + familyCpu);
        System.out.println("Core Speed: " + coreSpeed);
        System.out.println("Core Voltage: " + coreVoltage);
        System.out.println("Unlock CPU: " + unlockCpu);
    }
}