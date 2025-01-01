package BrassAmber.com.brass_geodes.datagen.recipes;

public enum BGRecipeCategory {
    BRASS_GEODES("brass_geodes"),
    BUILDING_BLOCKS("building_blocks"),
    DECORATIONS("decorations"),
    REDSTONE("redstone"),
    TRANSPORTATION("transportation"),
    TOOLS("tools"),
    COMBAT("combat"),
    FOOD("food"),
    BREWING("brewing"),
    MISC("misc");

    private final String recipeFolderName;

    private BGRecipeCategory(String pRecipeFolderName) {
        this.recipeFolderName = pRecipeFolderName;
    }

    public String getFolderName() {
        return this.recipeFolderName;
    }
}