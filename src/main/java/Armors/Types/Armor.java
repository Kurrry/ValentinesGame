package Armors.Types;


import Armors.Slots.IGearSlot;
import Armors.Stats.Modifiers.Defense.IDefenseModifier;
import Armors.Stats.Modifiers.Upgrade.IUpgradeLevel;

import java.math.BigDecimal;

public abstract class Armor {

    private IDefenseModifier defMod;
    private IUpgradeLevel upgradeLevel;
    private IGearSlot gearSlot;

    public BigDecimal getDefMod() {
        return defMod.getDefField();
    }

    protected void setDefMod(IDefenseModifier defMod) {
        this.defMod = defMod;
    }

    public int getUpgradeLevel() {
        return upgradeLevel.getUpField();
    }

    protected void setUpgradeLevel(IUpgradeLevel upgradeLevel) {
        this.upgradeLevel = upgradeLevel;
    }

    public String getGearSlot() {
        return gearSlot.getGearField();
    }

    public void setGearSlot(IGearSlot gearSlot) {
        this.gearSlot = gearSlot;
    }
}
