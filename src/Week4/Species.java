package Week4;

public class Species {
    private String name;
    private int population;
    private double growthRate;

    public void setSpecies(String newName, int newPopulation, double newGrowthRate) {
        name = newName;
        population = newPopulation;
        growthRate = newGrowthRate;

    }

    public boolean equals(Species otherObject) {


        return name.equals(otherObject.name);
    }
}
