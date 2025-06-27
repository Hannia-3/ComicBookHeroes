public class Main {
    public static void main(String[] args) {
        HeroManager heroManager = new HeroManager();

        // adding the heroes
        System.out.println("---Adding Heroes---");
        heroManager.addHero(new Hero("Captain America", 75, "Avengers"));
        heroManager.addHero(new Hero("Superman", 97, "Justice League"));
        heroManager.addHero(new Hero("Quicksilver", 90, "X-Men"));
        heroManager.addHero(new Hero("Mister Fantastic", 85, "Fantastic Four"));

        System.out.println("\n Original List:");
        heroManager.displayHeroesAs2DArray();

        // sorting by their power level
        System.out.println("\n Bubble Sort:");
        heroManager.bubbleSortHeroesByPower();
        heroManager.displayHeroesAs2DArray();

        System.out.println("\n Insertion Sort:");
        heroManager.insertionSortHeroesByPower();
        heroManager.displayHeroesAs2DArray();

        // this is where i remove and add a hero
        System.out.println("\nRemoving Quicksilver...");
        System.out.println("Adding Superman...\n");
        heroManager.removeHero("Quicksilver");
        heroManager.addHero(new Hero("Superman", 97, "Justice League"));

        System.out.println("\n2D Array Display:");
        heroManager.displayHeroesAs2DArray();
    }
}
