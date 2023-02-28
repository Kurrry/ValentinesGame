package Services;

import Armors.Factories.HeavyArmorFactory;
import Armors.Slots.Factory.SlotFactory;

public class FactoryMethods {
    private final HeavyArmorFactory heavyArmorFactory;
    private final SlotFactory slotFactory;

    public FactoryMethods() {
        heavyArmorFactory = new HeavyArmorFactory();
        slotFactory = new SlotFactory();
    }

    public HeavyArmorFactory getHeavyArmorFactory() {
        return heavyArmorFactory;
    }

    public SlotFactory getSlotFactory() {
        return slotFactory;
    }
}
