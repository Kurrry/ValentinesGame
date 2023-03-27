package Armors.Types;


import Armors.Slots.IGearSlot;
import Armors.Stats.Modifiers.Defense.IDefenseModifier;
import Armors.Stats.Modifiers.SetBonuses.SetBonus;
import Armors.Stats.Modifiers.Upgrade.IUpgradeLevel;

import java.math.BigDecimal;

public abstract class Armor {

    private String armorType;
    private IDefenseModifier defMod;
    private IUpgradeLevel upgradeLevel;
    private IGearSlot gearSlot;
    private SetBonus twoEquip;
    private SetBonus fourEquip;
    private boolean hasTwoEquip;
    private boolean hasFourEquip;
    private int equipCount;

    public String getArmorType() {
        return armorType;
    }

    protected void setArmorType(String armorType) {
        this.armorType = armorType;
    }

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

    protected void setGearSlot(IGearSlot gearSlot) {
        this.gearSlot = gearSlot;
    }

    public SetBonus getTwoEquip() {
        return twoEquip;
    }

    protected void setTwoEquip(SetBonus twoEquip) {
        this.twoEquip = twoEquip;
    }

    public SetBonus getFourEquip() {
        return fourEquip;
    }

    protected void setFourEquip(SetBonus fourEquip) {
        this.fourEquip = fourEquip;
    }

    public boolean isHasTwoEquip() {
        return hasTwoEquip;
    }

    protected void setHasTwoEquip(boolean hasTwoEquip) {
        this.hasTwoEquip = hasTwoEquip;
    }

    public boolean isHasFourEquip() {
        return hasFourEquip;
    }

    protected void setHasFourEquip(boolean hasFourEquip) {
        this.hasFourEquip = hasFourEquip;
    }

    public int getEquipCount() {
        return equipCount;
    }

    public void changeEquipCount(boolean equipped) {
        equipCount += equipped ? 1 : -1;
    }

//    public void setHasEquip() {
//        if (getEquipCount() == 4) {
//            hasTwoEquip = true;
//            hasFourEquip = true;
//        } else if (getEquipCount() >= 2 && getEquipCount() < 4) {
//            hasTwoEquip = true;
//            hasFourEquip = false;
//        } else {
//            hasFourEquip = false;
//            hasTwoEquip = false;
//        }
//    }
}
