package Armors.Stats.Modifiers.Upgrade;

public class NoUpgrade implements IUpgradeLevel {

    private final int upLevel;

    public NoUpgrade() {
        this.upLevel = 0;
    }
    @Override
    public int getUpField() {
        return upLevel;
    }
}
