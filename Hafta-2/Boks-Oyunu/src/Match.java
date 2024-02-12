import java.util.Random;
public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void run() {
        if (isCheck()) {
            // İlk dövüşçüyü belirle
            boolean isFirstFighterStarts = determineStartingPlayer();

            // İlk dövüşçü başlıyorsa
            if (isFirstFighterStarts) {
                System.out.println(this.f1.name + " maça başlıyor!");
                while (this.f1.health > 0 && this.f2.health > 0) {
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
                }
            }
            // İlk dövüşçü başlamıyorsa
            else {
                System.out.println(this.f2.name + " maça başlıyor!");
                while (this.f1.health > 0 && this.f2.health > 0) {
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
                }
            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
                && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean determineStartingPlayer() {
        boolean isFirstFighterStarts = false;
        boolean isF1Start = f1.isStart();
        boolean isF2Start = f2.isStart();

        if (isF1Start && !isF2Start) {
            isFirstFighterStarts = true;
        } else if (!isF1Start && isF2Start) {
            isFirstFighterStarts = false;
        } else {
            isFirstFighterStarts = new Random().nextBoolean();
        }

        // Hangi dövüşçünün başlayacağını konsola yazdır
        System.out.println("Maça başlayacak olan dövüşçü: " + (isFirstFighterStarts ? this.f1.name : this.f2.name));

        return isFirstFighterStarts;
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı !");
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı !");
            return true;
        }

        return false;
    }
}