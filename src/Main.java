public class Main {
    public static void main(String[] args) {

        Boss myBoss = new Boss();
        myBoss.setBossHealth(700);
        myBoss.setBossDamage(50);
        myBoss.setBossDefence("Kinetic");
        System.out.println("myBoss: " + " Boss health - " + myBoss.getBossHealth() + " Boss damage - " + myBoss.getBossDamage() + " Boss defence - " + myBoss.getBossDefence());
    }

    public String createHeroes () {
        Hero Thor = new Hero(300, 60);
        Hero Hulk = new Hero(350, 70);
        Hero Locky = new Hero(400, 80);
     return
    }


}