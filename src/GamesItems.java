public class GamesItems {

    // "Vigtige items", med længere beskrivelse.
    public static Item lantern = new Item("lantern", "A shiny red [lantern].");
    static Item ember = new Item("ember", "A glowing [ember] from the eternal fires of Hell. It radiates intense heat and never seems to burn out.");
    static Item skull = new Item("skull", "A cracked human [skull] with glowing red eyes. It seems to watch your every move.");
    static Item chain = new Item("chain", "A heavy iron [chain] stained with soot and blood. It was likely used to punish lost souls.");
    static Item horn = new Item("horn", "A broken demon [horn]. The surface is blackened as if it has survived countless battles.");
    static Item gem = new Item("gem", "A blood-red [gem] that glows faintly in the darkness. Strange energy flows within it.");
    static Item key = new Item("key", "A rusty iron [key] forged in Hellfire. It looks like it could unlock an ancient gate.");
    static Item scroll = new Item("scroll", "A burnt [scroll] covered in strange demonic symbols. Most of the writing is impossible to read.");
    static Item crown = new Item("crown", "A ruined [crown] made of black metal. It is said to have belonged to a powerful ruler of Hell.");

    // "Fylde-items, med korte beskrivelser
    static Item fang = new Item("fang", "A sharp demon [fang].");
    static Item claw = new Item("claw", "A blackened [claw].");
    static Item coal = new Item("coal", "A glowing piece of [coal].");
    static Item mask = new Item("mask", "A cracked ritual [mask].");
    static Item torch = new Item("torch", "A wooden [torch] still burning.");

    // "Food-items", med længere beskrivelse.
    static Food mushroom = new Food("mushroom", "A suspicious looking [mushroom] with a bright red cap and white spots", -20);
    static Food dragonEgg = new Food("egg", "A very large blackened [egg] covered in red cracks. It radiates an intense heat, as if something is still alive inside", +50);
    static Food emberFruit = new Food("fruit", "A strange red [fruit} that glows like a hot coal. Despite its burning skin, it feels surprisingly cool inside", +40);
    static Food mysteryMeat = new Food("meat", "A charred piece of [meat] covered in strange black markings. It smells awful, but something about it looks strangely appetizing", 10);
    static Food devilsCake = new Food("cake", "A dark chocolate [cake] covered in black icing. It smells strangely warm, as if it was baked in Hell itself", 25);

    // Specielle foods
    static Food hellFruit = new Food("hell fruit", "A glowing fruit found deep within Hell. Despite its fiery appearance, it restores energy and strength", 20);

    // Våben i Rooms
    static Weapon demonsBranch = new MeleeWeapon("branch", "A thick, twisted [branch] covered in black ash. It looks like it was torn from a dead tree.", 10);
    static Weapon ashSling = new RangedWeapon("sling", "A crude [sling] made from leather and a forked piece of wood. It is loaded with small chunks of volcanic rock.", 10, 3);
    static Weapon pitchfork = new MeleeWeapon("pitchfork", "A sharp demonic [pitchfork] with a dark red handle. It looks surprisingly well maintained.", 25);

    // Våben
    static Weapon frostFang = new MeleeWeapon("sword", "A [sword] forged from ancient glacial ice. Its freezing edge is said to pierce even the toughest dragon scales", 45);
    static Weapon dragonPiercer = new RangedWeapon("crossbow", "A heavy [crossbow] designed to penetrate thick dragon scales. Its silver-tipped bolts are difficult to replace", 30, 4);
    static Weapon rustyClaws = new MeleeWeapon("claws", "Sharp [claws] covered in ash and soot", 5);
    static Weapon flamingFangs = new MeleeWeapon("fangs", "Burning [fangs] capable of tearing through flesh", 7);
    static Weapon soulChain = new RangedWeapon("chain", "A cursed [chain] launched to capture wandering souls", 8, 5);
    static Weapon hellSpear = new MeleeWeapon("spear", "A long [spear] forged in demonic fire", 10);
    static Weapon fireBolts = new RangedWeapon("bolts", "Concentrated [bolts] of fire hurled from a burning spirit", 12, 8);
    static Weapon brokenGreatsword = new MeleeWeapon("greatsword", "A shattered [greatsword] still capable of deadly strikes", 13);
    static Weapon giantFlamingAxe = new MeleeWeapon("axe", "A massive [axe] engulfed in eternal fire.", 15);
    static Weapon hellFire = new RangedWeapon("hellfire", "A devastating projectile of [hellfire]", 25, 15);

    //Enemies
    static Enemy lesserDemon = new Enemy("demon", "Lesser Demon", "A small red [demon] with glowing yellow eyes. It snarls constantly and leaves scorch marks wherever it walks.", 30, rustyClaws, null);
    static Enemy hellHound = new Enemy("hound", "Hell Hound", "A massive black [hound] with burning fur and smoke pouring from its mouth.", 40, flamingFangs, null);
    static Enemy soulCollector = new Enemy("collector", "Soul Collector", "A hooded soul [collector] carrying a lantern filled with trapped souls. Faint cries can be heard from within.", 50, soulChain, null);
    static Enemy infernalGuard = new Enemy("knight", "Infernal Knight", "A heavily armored [knight] guarding the deeper regions of Hell. Its armor glows with molten cracks.", 60, hellSpear, null);
    static Enemy demonLord = new Enemy("ruler", "Demon Ruler", "The [ruler] of this region of Hell. Horns crown its head, and molten lava flows through the cracks in its skin.", 30, hellFire, null);
    static Enemy fireWraith = new Enemy("wraith", "Fire Wraith", "A ghostly [wraith] made entirely of flames. It floats above the ground and leaves trails of fire behind.", 70, fireBolts, null);
    static Enemy torturedWarrior = new Enemy("warrior", "Tortured Warrior", "The remains of a fallen [warrior] cursed to wander Hell forever. Pieces of charred armor cling to its body.", 80, brokenGreatsword, null);
    static Enemy executioner = new Enemy("executioner", "The Executioner", "A towering [executioner] with burning chains wrapped around its body. It relentlessly hunts intruders.", 100, giantFlamingAxe, null);

}