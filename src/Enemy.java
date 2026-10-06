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

            if (health <=0) {
                room.addItem(weapon);
                //room.removeEnemy(this); //tilføj removeEnemy() til Room, ellers rød.
                System.out.println(getShortName() + " dead. " +     weapon.getShortName() + " dropped.");
            }
        }
        //ikke færdig endnu
}

