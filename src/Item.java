public class Item {

    private String shortName;
    private String longName;

    public Item (String shortName, String longName) {
        this.shortName = shortName;
        this.longName = longName;
    }
        // "Vigtige items", med længere beskrivelse.
        public static Item lantern = new Item("lantern", "A shiny red lantern");
        Item ember = new Item("ember", "A glowing ember from the eternal fires of Hell. It radiates intense heat and never seems to burn out");
        Item skull = new Item("skull", "A cracked human skull with glowing red eyes. It seems to watch your every move");
        Item chain = new Item("chain", "A heavy iron chain stained with soot and blood. It was likely used to punish lost souls");
        Item pitchfork = new Item("pitchfork", "A sharp demonic pitchfork with a dark red handle. It looks surprisingly well maintained");
        Item horn = new Item("horn", "A broken demon horn. The surface is blackened as if it has survived countless battles");
        Item gem = new Item("gem", "A blood-red gemstone that glows faintly in the darkness. Strange energy flows within it");
        Item key = new Item("key", "A rusty iron key forged in Hellfire. It looks like it could unlock an ancient gate");
        Item scroll = new Item("scroll", "A burnt scroll covered in strange demonic symbols. Most of the writing is impossible to read");
        Item crown = new Item("crown", "A ruined crown made of black metal. It is said to have belonged to a powerful ruler of Hell");

        // "Fylde-items, med korte beskrivelser
        Item fang = new Item("fang", "A sharp demon fang");
        Item claw = new Item("claw", "A blackened claw");
        Item coal = new Item("coal", "A glowing piece of coal");
        Item mask = new Item("mask", "A cracked ritual mask");
        Item rune = new Item("rune", "A stone carved with runes");
        Item feather = new Item("feather", "A burnt black feather");
        Item shard = new Item("shard", "A jagged obsidian shard");
        Item bell = new Item("bell", "A small bronze bell");
        Item torch = new Item("torch", "A wooden torch still burning");

    }



