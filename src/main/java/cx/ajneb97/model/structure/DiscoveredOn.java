package cx.ajneb97.model.structure;

public class DiscoveredOn {

    private DiscoveredOnType type;
    private String mobType;
    private String mobName;
    private String regionName;
    private String fishType;

    public DiscoveredOn(DiscoveredOnType type) {
        this.type = type;
    }

    public DiscoveredOnType getType() {
        return type;
    }

    public void setType(DiscoveredOnType type) {
        this.type = type;
    }

    public String getMobType() {
        return mobType;
    }

    public void setMobType(String mobType) {
        this.mobType = mobType;
    }

    public String getMobName() {
        return mobName;
    }

    public void setMobName(String mobName) {
        this.mobName = mobName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getFishType() {
        return fishType;
    }

    public void setFishType(String fishType) {
        this.fishType = fishType;
    }

    public enum DiscoveredOnType{
        MOB_KILL,
        MYTHIC_MOB_KILL,
        ELITE_MOB_KILL,
        WORLDGUARD_REGION,
        RESIDENCE_REGION,
        CUSTOM_FISHING
    }
}
