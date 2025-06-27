public class Main {
    public static void main(String[] args) {
        HeroManager manager = new HeroManager();

        // adding the heroes
        manager.addHero(new Hero("Captain America", 75, "Avengers"));
        manager.addHero(new Hero("Superman", 97, "Justice League"));
        manager.addHero(new Hero("Quicksilver", 90, "X-Men"));
        manager.addHero(new Hero("Mister Fantastic", 85, "Fantastic Four"));

        System.out.println("\n Original List:");
        manager.displayHeroes();

        // sorting by their power level
        manager.bubbleSortByPowerLevel();
        manager.insertionSortByPowerLevel();

        // this is where i remove and add a hero
        System.out.println("\nRemoving Quicksilver...");
        System.out.println("Adding Superman...\n");
        manager.removeHero("Quicksilver");
        manager.addHero(new Hero("Superman", 97, "Justice League"));

        System.out.println("\nwD Array Display:");
        manager.displayHeroesIn2DArrayFormat();
    }
}
