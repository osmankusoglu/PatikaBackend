public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int start;

    Fighter(String name, int damage, int health, int weight, int dodge, int start) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;

        // Başlama olasılığını %50 olarak ayarla
        this.start = (int) (Math.random() * 100) < 50 ? 50 : 0;
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
        if (foe.isDodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı!");
            System.out.println("--------------");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

    boolean isStart() {
        double randomStart = Math.random() * 100;
        return randomStart <= this.start;
    }
}