package Armors.Stats.Modifiers.Upgrade;

public class SecondUpgrade implements IUpgradeLevel {
    private final int upLevel;

    public SecondUpgrade() {
        this.upLevel = 2;
    }


    @Override
    public int getUpField() {
        return upLevel;
    }
}
