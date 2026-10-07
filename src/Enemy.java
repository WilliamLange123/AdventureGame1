public class Enemy {

        private String shortName;
        private String longName;
        private String description;
        private int health;
        private Weapon weapon;
        private Room room;

        public Enemy(String shortName, String longName, String description,
                     int health, Weapon weapon, Room room) {
            this.shortName = shortName;
            this.longName = longName;
            this.description = description;
            this.health = health;
            this.weapon = weapon;
            this.room = room;
        }

        public String getShortName() {
            return shortName;
        }
        public String getLongName() {
            return longName;
        }
        public String getDescription() {
            return description;
        }
        public int getHealth() {
            return health;
        }

        public Weapon getWeapon() {
            return weapon;
        }
            public int getDamage() {
                if (weapon == null) {
                    return 0;
                }
                return weapon.getDamage();
        }
        public Room getRoom() {
            return room;
        }
        public void setRoom(Room room) {this.room = room;
        }

        public void hit(int damage) {
            health -= damage;

            if (health <= 0) { //nyt, det havde vi ikke, så enemy droppede ikke deres våben efter de døde
                room.addItem(weapon);
                room.removeEnemy(this);
        }
    }

        public boolean idDead(){
            return health <=0;
        }

        public void attack(Player player) {
            if (weapon == null) {
                return;
            }

            if (!weapon.canUse()) {
                return;
            }

            int damage = weapon.getDamage();

            weapon.attack();
            System.out.println(getLongName() + " attacks you with "
                    + weapon.getDisplayName() + " and deals " + damage + " damage.");
            player.takeDamage(damage);
        }
}