public class Pilot {
    private String name;
    private String country;
    private int numberOfRaces;
    private int totalPoints;

    public Pilot(String name, String country, int numberOfRaces, int totalPoints) {
        this.name = name;
        this.country = country;
        this.numberOfRaces = numberOfRaces;
        this.totalPoints = totalPoints;
    }

    public Pilot() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumberOfRaces() {
        return numberOfRaces;
    }

    public void setNumberOfRaces(int numberOfRaces) {
        this.numberOfRaces = numberOfRaces;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    @Override
    public String toString() {
        return name + "," + country + "," + numberOfRaces + "," + totalPoints;
    }

    public String showInfo() {
        return "Pilot{" +
                "\nName: " + name + '\'' +
                "\nCountry='" + country + '\'' +
                "\nNumber Of Races='" + numberOfRaces + '\'' +
                "\nTotal of Points=" + totalPoints +
                '}';
    }

    public void addPoints(int points) {
        this.totalPoints += points;
    }
}
