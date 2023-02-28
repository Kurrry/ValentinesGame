package Armors.Stats.Modifiers.Defense;

import java.math.BigDecimal;

public class MediumDefenseModifier implements IDefenseModifier {

    private final BigDecimal defMod;

    public MediumDefenseModifier() {
        this.defMod = new BigDecimal("0.3");
    }
    @Override
    public BigDecimal getDefField() {
        return defMod;
    }
}
