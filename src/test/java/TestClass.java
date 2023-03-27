import Armors.Factories.HeavyArmorFactory;
import Armors.Slots.HeadSlot;
import Armors.Types.Armor;
import Armors.Types.Heavy.CarapaceArmor;
import Players.InventoryTypes.Equipment;
import Services.FactoryMethods;
import Text.ArmorTypes;
import Text.GearSlots;

public class TestClass {
    public static void main(String[] args) {
        FactoryMethods factoryMethods = new FactoryMethods();
        Armor testArmor =
                factoryMethods
                .getHeavyArmorFactory()
                .createArmor(ArmorTypes.carapace, factoryMethods.
                        getSlotFactory().
                        createGearSlot(GearSlots.head));

        CarapaceArmor testCarapaceArmor = (CarapaceArmor) testArmor;

        Equipment testEquipment = new Equipment();
        testEquipment.equipItem(GearSlots.head, testCarapaceArmor);
        testCarapaceArmor.changeEquipCount(true);

        System.out.println(testCarapaceArmor.getDefMod());
        System.out.println(testCarapaceArmor.getUpgradeLevel());
        System.out.println(testCarapaceArmor.getEquipCount());
        System.out.println(testEquipment.getEquippedItem(GearSlots.head).getTwoEquip());
        System.out.println(testEquipment.getEquippedItemString(GearSlots.head));

    }


}
