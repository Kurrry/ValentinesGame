package Armors.Slots;

import Text.GearSlots;

public class BodySlot implements IGearSlot {
    private final String gearSlot;

    public BodySlot() {
        this.gearSlot = GearSlots.body;
    }
    @Override
    public String getGearField() {
        return gearSlot;
    }
}
