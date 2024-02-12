public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("----------------------- MAĞAZAYA HOŞGELDİNİZ -----------------------");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("1 - Silahlar");
            System.out.println("2 - Zırhlar");
            System.out.println("3 - Çıkış yap.");
            System.out.print("Seçiminiz :");
            int selectCase = input.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.print("Geçersiz değer tekrar giriniz : ");
                selectCase = input.nextInt();
            }

            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;

                case 2:
                    printArmor();
                    buyArmor();
                    break;

                case 3:
                    System.out.println("Tekrar bekleriz!");
                    showMenu = false;
                    break;
            }

        }
        return true;
    }

    public void printWeapon() {

        System.out.println("----------------------------- SİLAHLAR -----------------------------");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + "- " + " Silah ismi : " + w.getName()  + " --> Ücret : " + w.getPrice() + " , Hasar : " + w.getDamage());

        }
        System.out.println("0 - Çıkış Yap");
    }

    public void buyWeapon() {
        System.out.print("Bir Silah Seçiniz : ");
        int selectWeaponID = input.nextInt();

        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Geçersiz değer tekrar giriniz : ");
            selectWeaponID = input.nextInt();
        }
        if (selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                } else {
                    System.out.println("Satın aldığınız silah : " + selectedWeapon.getName());
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
                    System.out.println("Önceki Silahınız : " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Yeni Silahınız : " + this.getPlayer().getInventory().getWeapon().getName());
                }
            }
        }
    }

    public void printArmor() {

        System.out.println("----------------------------- ZIRHLAR -----------------------------");

        for (Armor a : Armor.armors()) {

            System.out.println(a.getId() + "- " + "Zırh ismi : " + a.getName() + " --> Ücret : " + a.getPrice() + " , Block : " + a.getBlock());

        }
        System.out.println("0 - Çıkış Yap");


    }

    public void buyArmor() {

        System.out.print("Bir Zırh Seçiniz : ");
        int selectArmorID = input.nextInt();

        while (selectArmorID < 0 || selectArmorID > Weapon.weapons().length) {
            System.out.print("Geçersiz değer tekrar giriniz : ");
            selectArmorID = input.nextInt();
        }
        if (selectArmorID != 0) {
            Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);

            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                } else {
                    System.out.println("Satın aldığınız Zırh : " + selectedArmor.getName());
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Paranız : " + this.getPlayer().getMoney());
                    System.out.println("Önceki Zırhınız : " + this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Yeni Zırhınız : " + this.getPlayer().getInventory().getArmor().getName());
                }
            }

        }
    }
}