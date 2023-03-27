package Players.InventoryTypes;

import Armors.Types.Armor;
import Armors.Types.Unequipped.Unequipped;
import Text.GearSlots;

import java.util.HashMap;

public class Equipment {
    private final HashMap<String, Armor> equippedItems;

    public Equipment() {
        equippedItems = new HashMap<>();
        equipItemDev(GearSlots.head, new Unequipped());
        equipItemDev(GearSlots.body, new Unequipped());
        equipItemDev(GearSlots.arm, new Unequipped());
        equipItemDev(GearSlots.boot, new Unequipped());
    }

    private void equipItemDev(String slot, Armor armor) {
        equippedItems.put(slot, armor);
    }

    public void equipItem(String slot, Armor armor) {
        equippedItems.replace(slot, armor);
    }

    public Armor getEquippedItem(String slot) {
        return equippedItems.get(slot);
    }

    public String getEquippedItemString(String slot) {
        return equippedItems.get(slot).getArmorType();
    }
}

// this can and should be replaced by a db
// create db for inventory, equipped items including weapons and armor,
// weapons, armor, usable items, key items, enemies, attacks split by type,
/*
    show the set bonus and stats of each armor in the equip screen.
    use these numbers to show a preview of what the stats would be if this config was saved.
    save final number to file after equip screen is closed, implying equipping is saved.

     equip count can be tracked by comparing the number of each armor type the player has equipped
     when the equip menu is closed.
 */