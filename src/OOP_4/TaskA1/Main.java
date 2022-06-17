package OOP_4.TaskA1;

public class Main {
    public static void main(String[] args) {
        DomesticApplianceForFood toaster = new DomesticApplianceForFood("Toaster", "Braun", false, "Поджарка");
        DomesticApplianceForFood fridge = new DomesticApplianceForFood("Fridge", "Atlant", false, "Хранение");
        DomesticApplianceForClothes washingMachine = new DomesticApplianceForClothes("Washing machine", "SAMSUNG", false, "Стирка");
        DomesticApplianceForClothes dryerMachine = new DomesticApplianceForClothes("Dryer machine", "Bosch", true, "Сушка");
        toaster.turnOn();
        toaster.interact();
        washingMachine.turnOn();
        washingMachine.turnOff();
        washingMachine.interact();
    }
}
