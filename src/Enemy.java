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

            if (health <= 0) {

                if (weapon != null) {
                    room.addItem(weapon);

                    System.out.println(
                            getShortName() + " dead. " +
                                    weapon.getShortName() + " dropped.");
                } else {
                    System.out.println(
                            getShortName() + " dead.");
                }
                //room.removeEnemy(this); //rød nu, fordi vi skal tilføje removeEnemy i Room først.
            }
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
            player.takeDamage(damage);
        }
}

