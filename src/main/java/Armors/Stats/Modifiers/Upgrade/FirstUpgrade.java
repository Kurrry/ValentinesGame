package Armors.Stats.Modifiers.Upgrade;

public class FirstUpgrade implements IUpgradeLevel {
    private final int upLevel;

    public FirstUpgrade() {
        this.upLevel = 1;
    }


    @Override
    public int getUpField() {
        return upLevel;
    }
}
