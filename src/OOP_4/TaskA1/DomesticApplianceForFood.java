package OOP_4.TaskA1;

public class DomesticApplianceForFood extends DomesticAppliance {
    private final String interactionWithFood;

    public DomesticApplianceForFood(String nameOfTechnique, String brandAndModel, boolean activateMode, String interactionWithFood) {
        super(nameOfTechnique, brandAndModel, activateMode);
        this.interactionWithFood = interactionWithFood;
    }

    public void interact() {
        if (this.activateMode) {
            System.out.println("К еда применена функция: " + interactionWithFood);
        } else {
            System.out.println("Ваша техника не включена, включите её, чтобы применить функцию");
        }
    }

}
