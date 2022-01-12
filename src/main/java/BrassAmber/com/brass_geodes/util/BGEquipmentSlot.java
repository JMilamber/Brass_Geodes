package BrassAmber.com.brass_geodes.util;

public enum BGEquipmentSlot {
    RING(Type.EXTRA, 0, 6, "ring"),
    AMULET(Type.EXTRA, 1, 6, "amulet");

    private final BGEquipmentSlot.Type type;
    private final int index;
    private final int filterFlag;
    private final String name;

    BGEquipmentSlot(BGEquipmentSlot.Type type, int index, int filterFlag, String name) {
        this.type = type;
        this.index = index;
        this.filterFlag = filterFlag;
        this.name = name;
    }

    public BGEquipmentSlot.Type getType() {
        return this.type;
    }

    public int getIndex() {
        return this.index;
    }

    public int getIndex(int p_147069_) {
        return p_147069_ + this.index;
    }

    public int getFilterFlag() {
        return this.filterFlag;
    }

    public String getName() {
        return this.name;
    }

    public static BGEquipmentSlot byName(String p_20748_) {
        for(BGEquipmentSlot equipmentslot : values()) {
            if (equipmentslot.getName().equals(p_20748_)) {
                return equipmentslot;
            }
        }

        throw new IllegalArgumentException("Invalid slot '" + p_20748_ + "'");
    }

    public static BGEquipmentSlot byTypeAndIndex(BGEquipmentSlot.Type type, int id) {
        for(BGEquipmentSlot equipmentslot : values()) {
            if (equipmentslot.getType() == type && equipmentslot.getIndex() == id) {
                return equipmentslot;
            }
        }

        throw new IllegalArgumentException("Invalid slot '" + type + "': " + id);
    }

    public static enum Type {
        EXTRA
    }
}
