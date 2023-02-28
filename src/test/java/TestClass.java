import Armors.Factories.HeavyArmorFactory;
import Armors.Slots.HeadSlot;
import Armors.Types.Armor;
import Services.FactoryMethods;
import Text.ArmorTypes;
import Text.GearSlots;

public class TestClass {
    public static void main(String[] args) {
        FactoryMethods factoryMethods = new FactoryMethods();
        Armor testArmor =
                factoryMethods
                .getHeavyArmorFactory()
                .createArmor(ArmorTypes.carapace);

        testArmor
                .setGearSlot(factoryMethods
                                .getSlotFactory()
                                .createGearSlot(GearSlots.head));

        System.out.println(testArmor.getDefMod());
        System.out.println(testArmor.getUpgradeLevel());
        System.out.println(testArmor.getGearSlot());


    }


}
