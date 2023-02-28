package Armors.Stats.Modifiers.Defense;

import java.math.BigDecimal;

public class LightDefenseModifier implements IDefenseModifier {
    private final BigDecimal defMod;

    public LightDefenseModifier() {
        this.defMod = new BigDecimal("0.025");
    }
    @Override
    public BigDecimal getDefField() {
        return defMod;
    }
}
