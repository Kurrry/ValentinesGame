package Armors.Slots.Factory;

import Armors.Slots.*;
import Text.GearSlots;

public class SlotFactory implements ISlotFactory {

    @Override
    public IGearSlot createGearSlot(String slot) {
        if (slot == null) {
            return null;
        }

        switch (slot) {
            case GearSlots.head -> {
                return new HeadSlot();
            }
            case GearSlots.arm -> {
                return new ArmSlot();
            }
            case GearSlots.body -> {
                return new BodySlot();
            }
            case GearSlots.boot -> {
                return new BootSlot();
            }
        }

        return null;
    }
}
