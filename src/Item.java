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

    //Ændrer første bogstav til stort bogstav, fx sling -> Sling, sword -> Sword osv.
    public String getDisplayName() {
        String name = shortName;
        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }public String getItemInfo() {
        return "";
    }
}