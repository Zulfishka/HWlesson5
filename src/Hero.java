public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String heroSuperPower;

    public int getHeroHealth (){
        return this.heroHealth;
    };
    public int getHeroDamage (){
        return this.heroDamage;
    }
    public String getHeroSuperPower (){
        return this.heroSuperPower;
    }
    public Hero (int heroHealth, int heroDamage, String heroSuperPower){
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroSuperPower = heroSuperPower;
    }

    public Hero (int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }
}
