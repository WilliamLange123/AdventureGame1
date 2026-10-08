public class Enemy {

        private String shortName;
        private String longName;
        private String description;
        private int health;
        private Weapon weapon;
        private Room room;
        private Room finalBossRoom;
        private boolean finalboss = false;

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
        public int getDamage() {
            if (weapon == null) {
                return 0;
            }
            return weapon.getDamage();
        }
public boolean isFinalboss() {
            return finalboss;

}
        public void setRoom(Room room) {
        this.room = room;
        }

    public Room getFinalBossRoom() {
        return finalBossRoom;
    }
    public void setFinalBossRoom(Room finalBossRoom){
            this.finalBossRoom = finalBossRoom;
    }
     public Room getFinalboos(){return finalBossRoom;}
    public void setFinalBoss(boolean finalboss){this.finalboss = finalboss;}
    //hit()
        public void hit(int damage) {
            health -= damage;

            if (health <= 0) {
                if (this == GamesItems.demonLord && !finalboss){
                    finalboss = true;
                health = 250;
                room.removeEnemy(this);
                setRoom(finalBossRoom);
                finalBossRoom.addEnemy(this);
                System.out.println("The demon lord escapes and retreats to the final chamber !");
                return;
            }
                if (weapon != null) {
                    room.addItem(weapon);

                    System.out.println(
                            getShortName() + " dead. " +
                                    weapon.getShortName() + " dropped.");
                } else {
                    System.out.println(
                            getShortName() + " dead.");
                }

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

