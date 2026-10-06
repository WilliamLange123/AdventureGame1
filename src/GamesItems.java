public class GamesItems {

    // "Vigtige items", med længere beskrivelse.
    public static Item lantern = new Item("lantern", "A shiny red [lantern].");
    static Item ember = new Item("ember", "A glowing ember from the eternal fires of Hell. It radiates intense heat and never seems to burn out");
    static Item skull = new Item("skull", "A cracked human skull with glowing red eyes. It seems to watch your every move");
    static Item chain = new Item("chain", "A heavy iron chain stained with soot and blood. It was likely used to punish lost souls");
    static Item pitchfork = new Item("pitchfork", "A sharp demonic pitchfork with a dark red handle. It looks surprisingly well maintained");
    static Item horn = new Item("horn", "A broken demon horn. The surface is blackened as if it has survived countless battles");
    static Item gem = new Item("gem", "A blood-red gemstone that glows faintly in the darkness. Strange energy flows within it");
    static Item key = new Item("key", "A rusty iron key forged in Hellfire. It looks like it could unlock an ancient gate");
    static Item scroll = new Item("scroll", "A burnt scroll covered in strange demonic symbols. Most of the writing is impossible to read");
    static Item crown = new Item("crown", "A ruined crown made of black metal. It is said to have belonged to a powerful ruler of Hell");

    // "Fylde-items, med korte beskrivelser
    static Item fang = new Item("fang", "A sharp demon fang");
    static Item claw = new Item("claw", "A blackened claw");
    static Item coal = new Item("coal", "A glowing piece of coal");
    static Item mask = new Item("mask", "A cracked ritual mask");
    static Item rune = new Item("rune", "A stone carved with runes");
    static Item feather = new Item("feather", "A burnt black feather");
    static Item shard = new Item("shard", "A jagged obsidian shard");
    static Item bell = new Item("bell", "A small bronze bell");
    static Item torch = new Item("torch", "A wooden torch still burning");

    // "Food-items", med længere beskrivelse.
    static Food mushroom = new Food("mushroom", "A suspicious looking [mushroom] with a bright red cap and white spots.", -20);
    static Food dragonEgg = new Food("egg", "A very large blackened [egg] covered in red cracks. It radiates an intense heat, as if something is still alive inside.", +50);
    static Food emberFruit = new Food("fruit", "A strange red [fruit} that glows like a hot coal. Despite its burning skin, it feels surprisingly cool inside.", +40);
    static Food mysteryMeat = new Food("meat", "A charred piece of [meat] covered in strange black markings. It smells awful, but something about it looks strangely appetizing.", 10);
    static Food devilsCake = new Food("cake", "A dark chocolate [cake] covered in black icing. It smells strangely warm, as if it was baked in Hell itself.", 25);

    // Simple foods
    static Food apple = new Food("apple", "A fresh red apple", 5);
    static Food bread = new Food("bread", "A piece of warm bread", 8);
    static Food cheese = new Food("cheese", "A small block of cheese", 6);
    static Food berries = new Food("berries", "A handful of sweet berries", 4);
    static Food meat = new Food("meat", "A piece of cooked meat", 10);
    static Food moldBread = new Food("mold bread", "A moldy piece of bread", -5);
    static Food rottenApple = new Food("rotten apple", "A rotten green apple", -8);
    static Food spoiledMeat = new Food("spoiled meat", "A foul-smelling piece of spoiled meat", -12);
    static Food dirtyWater = new Food("dirty water", "A bottle of dirty water", -6);

    // Specielle foods
    static Food hellFruit = new Food("hell fruit", "A glowing fruit found deep within Hell. Despite its fiery appearance, it restores energy and strength", 20);
    static Food phoenixMeat = new Food("phoenix meat", "Meat from a legendary phoenix. Warm to the touch and filled with life-giving power", 25);
    static Food goldenApple = new Food("golden apple", "A rare golden apple said to be treasured by ancient rulers. It greatly restores vitality", 30);
    static Food soulSoup = new Food("soul soup", "A mysterious soup brewed from magical ingredients. It heals wounds almost instantly", 35);
    static Food cursedFruit = new Food("cursed fruit", "A dark fruit covered in strange markings. It looks tempting, but a terrible curse lingers within", -20);
    static Food poisonBrew = new Food("poison brew", "A bubbling drink that smells of sulfur and decay. Drinking it causes intense pain", -25);
    static Food demonMeat = new Food("demon meat", "Meat taken from a fallen demon. It is toxic to humans despite its appetizing smell", -30);
    static Food soulRot = new Food("soul rot", "A blackened lump of food corrupted by dark magic. Consuming it drains both body and spirit", -35);

    // Test-våben, kan fjernes senere
    static Weapon demonsBranch = new MeleeWeapon("branch", "A thick, twisted [branch] covered in black ash. It looks like it was torn from a dead tree.", 10);
    static Weapon ashSling = new RangedWeapon("sling", "A crude [sling] made from leather and a forked piece of wood. It is loaded with small chunks of volcanic rock.", 5, 3);

    // Våben
    static Weapon frostFang = new MeleeWeapon("sword", "A [sword] forged from ancient glacial ice. Its freezing edge is said to pierce even the toughest dragon scales.", 45);
    static Weapon dragonPiercer = new RangedWeapon("crossbow", "A heavy [crossbow] designed to penetrate thick dragon scales. Its silver-tipped bolts are difficult to replace.", 30, 4);
    static Weapon rustyClaws = new MeleeWeapon("claws", "Sharp [claws] covered in ash and soot.", 5);
    static Weapon flamingFangs = new MeleeWeapon("fangs", "Burning [fangs] capable of tearing through flesh.", 7);
    static Weapon soulChain = new RangedWeapon("chain", "A cursed [chain] launched to capture wandering souls.", 8, 5);
    static Weapon hellSpear = new MeleeWeapon("spear", "A long [spear] forged in demonic fire.", 10);
    static Weapon fireBolts = new RangedWeapon("bolts", "Concentrated [bolts] of fire hurled from a burning spirit.", 12, 8);
    static Weapon brokenGreatsword = new MeleeWeapon("greatsword", "A shattered [greatsword] still capable of deadly strikes.", 13);
    static Weapon giantFlamingAxe = new MeleeWeapon("axe", "A massive [axe] engulfed in eternal fire.", 15);
    static Weapon shadowKnives = new RangedWeapon("knives", "Multiple [knives] of darkness thrown from the shadows.", 16, 10);
    static Weapon hellFire = new RangedWeapon("hellfire", "A devastating projectile of [hellfire].", 25, 15);

    //Enemy
    static Enemy emberling = new Enemy("emberling", "small emberling","A small [emberling] born from the flames of Hell. Its body is covered in black scales, glowing with cracks of molten red beneath them. It attacks with razor-sharp claws.", 20, rustyClaws, null);
    static Enemy lesserDemon = new Enemy("demon", "lesser demon", "A small red [demon] with glowing yellow eyes. It snarls constantly and leaves scorch marks wherever it walks.", 30, rustyClaws, null);
    static Enemy hellHound = new Enemy("hound", "hell hound", "A massive black [hound] with burning fur and smoke pouring from its mouth.", 40, flamingFangs, null);
    static Enemy soulCollector = new Enemy("collector", "soul collector", "A hooded soul [collector] carrying a lantern filled with trapped souls. Faint cries can be heard from within.", 50, soulChain, null);
    static Enemy infernalGuard = new Enemy("knight", "infernal knight", "A heavily armored [knight] guarding the deeper regions of Hell. Its armor glows with molten cracks.", 60, hellSpear, null);
    static Enemy demonLord = new Enemy("ruler", "demon ruler", "The [ruler] of this region of Hell. Horns crown its head, and molten lava flows through the cracks in its skin.", 200, hellFire, null);
    static Enemy fireWraith = new Enemy("wraith", "fire wraith", "A ghostly [wraith] made entirely of flames. It floats above the ground and leaves trails of fire behind.", 70, fireBolts, null);
    static Enemy torturedWarrior = new Enemy("warrior", "tortured warrior", "The remains of a fallen [warrior] cursed to wander Hell forever. Pieces of charred armor cling to its body.", 80, brokenGreatsword, null);
    static Enemy executioner = new Enemy("executioner", "the executioner", "A towering [executioner] with burning chains wrapped around its body. It relentlessly hunts intruders.", 100, giantFlamingAxe, null);
    static Enemy abyssStalker = new Enemy("stalker", "abyss stalker", "A shadowy [stalker] lurking in the darkness. Only its glowing red eyes reveal its presence.", 120, shadowKnives, null);
}