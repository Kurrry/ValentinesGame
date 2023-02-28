package Armors.Stats.Modifiers.Defense;

import java.math.BigDecimal;

public class HeavyDefenseModifier implements IDefenseModifier {
    private final BigDecimal defMod;

    public HeavyDefenseModifier() {
        this.defMod = new BigDecimal("0.125");
    }

    @Override
    public BigDecimal getDefField() {
        return defMod;
    }
}
