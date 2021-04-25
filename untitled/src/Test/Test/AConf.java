package Test;

public class AConf implements AFruitAndVegetables{
    @Override
    public Fruit CreateF() {
        Banana banana = new Banana();
        banana.name = "banana";
        return banana;
    }

    @Override
    public Vegetables CreatV() {

        return null;
    }
}

