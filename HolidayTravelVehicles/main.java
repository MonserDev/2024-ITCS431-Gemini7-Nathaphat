public class main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.serialNumber = "25GGE";
        vehicle.name = "Hondo Clivic";
        vehicle.model = "Supra4";
        vehicle.year = 2008;
        vehicle.manufacturer = "Hondo";
        vehicle.baseCost = 2500000.00;

        vehicle.displayInfo();
    }
}
