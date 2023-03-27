package Armors.Types.Heavy;


import Armors.Stats.Modifiers.Defense.HeavyDefenseModifier;
import Armors.Stats.Modifiers.SetBonuses.SetBonus;
import Armors.Stats.Modifiers.Upgrade.NoUpgrade;
import Armors.Types.Armor;
import Text.ArmorTypes;

import java.math.BigDecimal;

public class CarapaceArmor extends Armor {

    public CarapaceArmor() {
        super.setArmorType(ArmorTypes.carapace);
        super.setDefMod(new HeavyDefenseModifier());
        super.setUpgradeLevel(new NoUpgrade());
        super.setTwoEquip(new SetBonus(new BigDecimal("0.05"), 2));
        super.setFourEquip(new SetBonus(new BigDecimal("0.05"), 4));
        super.setHasTwoEquip(false);
        super.setHasFourEquip(false);
    }

}
// SetBonus object can be assigned per armor type, as not all armors have a set bonus
// need to figure out how to monitor set bonus status in real time
// research enum

// probably easier to make this a db entry and have armor creation done through Armor super class
// need to make db for above idea