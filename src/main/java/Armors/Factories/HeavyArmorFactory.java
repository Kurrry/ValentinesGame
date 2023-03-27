package Armors.Factories;

import Armors.Slots.IGearSlot;
import Armors.Types.Armor;
import Armors.Types.Heavy.CarapaceArmor;
import Text.ArmorTypes;

public class HeavyArmorFactory implements IArmorFactory {
    @Override
    public Armor createArmor(String type, IGearSlot slot) {
        if (type == null) {
            return null;
        }

        switch (type) {
            case ArmorTypes.carapace:
                return new CarapaceArmor();
        }

        return null;
    }
}
