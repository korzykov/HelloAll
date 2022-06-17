package OOP_4.TaskA1;

public class DomesticAppliance {
    private String nameOfTechnique;
    private String brandAndModel;
    public boolean activateMode;

    public DomesticAppliance(String nameOfTechnique, String brandAndModel, boolean activateMode) {
        this.nameOfTechnique = nameOfTechnique;
        this.brandAndModel = brandAndModel;
        this.activateMode = activateMode;
    }

    public void turnOn() {
        this.activateMode = true;
        System.out.println(this.nameOfTechnique +" "+ this.brandAndModel + " включён");
    }

    public void turnOff() {
        this.activateMode = false;
        System.out.println(this.nameOfTechnique +" "+ this.brandAndModel + " выключён");
    }
}
