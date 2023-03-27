package Armors.Stats.Modifiers.Defense;

import java.math.BigDecimal;

public class NoDefenseModifier implements IDefenseModifier {
    private final BigDecimal defMod;

    public NoDefenseModifier() {
        this.defMod = new BigDecimal("0");
    }
    @Override
    public BigDecimal getDefField() {
        return defMod;
    }
}
