package Armors.Types.Unequipped;

import Armors.Stats.Modifiers.Defense.NoDefenseModifier;
import Armors.Stats.Modifiers.Upgrade.NoUpgrade;
import Armors.Types.Armor;

import java.math.BigDecimal;

public class Unequipped extends Armor {

    public Unequipped() {
        super.setDefMod(new NoDefenseModifier());
        super.setUpgradeLevel(new NoUpgrade());
    }
}
