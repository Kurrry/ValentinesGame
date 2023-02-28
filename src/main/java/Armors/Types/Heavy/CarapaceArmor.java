package Armors.Types.Heavy;


import Armors.Stats.Modifiers.Defense.HeavyDefenseModifier;
import Armors.Stats.Modifiers.Upgrade.NoUpgrade;
import Armors.Types.Armor;

public class CarapaceArmor extends Armor {

    public CarapaceArmor() {
        super.setDefMod(new HeavyDefenseModifier());
        super.setUpgradeLevel(new NoUpgrade());
    }
}
// SetBonus object can be assigned per armor type, as not all armors have a set bonus
// need to figure out how to monitor set bonus status in real time
// research enum