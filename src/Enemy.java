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
        public Room getRoom() {
            return room;
        }
        public void setRoom(Room room) {
        this.room = room;
        }
        //hit()
        public void hit(int damage) {
            health -= damage;
        }
        public boolean idDead(){
            return health <=0;
        }

        //attack player
        public void attack(Player player) {
            if (weapon == null) {
                return;
            }

            if (!weapon.canUse()) {
                return;
            }

            int damage = weapon.getDamage();

            weapon.attack();
            System.out.println(shortName + " attacks you with " + weapon.getShortName() + " and deals " + damage + " damage.");
            player.takeDamage(damage);
        }
}

