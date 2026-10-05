public class Item {


    private String shortName;
    private String longName;

    public Item(String shortName, String longName) {
        this.shortName = shortName;
        this.longName = longName;
    }

    public String getShortName() {
        return shortName;
    }

    public String getLongName() {
        return longName;
    }
    public boolean canEquip(){
        return false;
    }
}

