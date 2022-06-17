package OOP_4.TaskA1;

public class DomesticApplianceForClothes extends DomesticAppliance {
    private String interactionWithClothes;

    public DomesticApplianceForClothes(String nameOfTechnique, String brandAndModel, boolean activateMode, String interactionWithClothes) {
        super(nameOfTechnique, brandAndModel, activateMode);
        this.interactionWithClothes = interactionWithClothes;
    }

    public void interact() {
        if (this.activateMode) {
            System.out.println("К одежде применена функция: " + interactionWithClothes);
        } else {
            System.out.println("Ваша техника не включена, включите её, чтобы применить функцию");
        }
    }
}
