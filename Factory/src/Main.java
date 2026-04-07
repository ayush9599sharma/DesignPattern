import factories.OperatingSystem;

public class Main {
    public static void main(String[] args) {
        String osType = "Linux";
        String version = "1";
        String architecture = "amd64";

        OperatingSystem obj = OperatingSystemFactory.getOperatingSystemInstance(osType,version,architecture);
        obj.changeDir("Sample Dir");
        obj.removeDir("Sample Dir");

    }
}