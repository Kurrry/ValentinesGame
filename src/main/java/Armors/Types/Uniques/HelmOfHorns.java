package Armors.Types.Uniques;

import Armors.Stats.Modifiers.Defense.HeavyDefenseModifier;
import Armors.Types.Armor;

import java.math.BigDecimal;

public class HelmOfHorns extends Armor {

    private final BigDecimal bonusDef;

    public HelmOfHorns() {
        super.setDefMod(new HeavyDefenseModifier());
        bonusDef = new BigDecimal("0.05");
    }
}
