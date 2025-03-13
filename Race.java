import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Race {
    private String circuitName;
    private String countryRace;
    public static int[] pointsPerPosition = {25, 18, 15, 12, 10, 8, 6, 4, 2, 1};
    public static ArrayList<Pilot> pilots = new ArrayList<>();
    public static ArrayList<Race> circuits = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public Race(String circuitName, String countryRace) {
        this.circuitName = circuitName;
        this.countryRace = countryRace;
    }

    public Race() {
    }

    @Override
    public String toString() {
        return "Race{" +
                "\nCircuit Name:" + circuitName + '\'' +
                "\nCountry Race:" + countryRace + '\'' +
                '}';
    }

    public static void addCircuit() {
        System.out.println("Ingrese el nombre del circuito: ");
        String circuitName = sc.nextLine();
        System.out.println("Ingrese el país del circuito: ");
        String countryRace = sc.nextLine();

        Race race = new Race(circuitName, countryRace);
        circuits.add(race);
        String line = circuitName + "," + countryRace;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("./assets/files/circuits.txt", true))){
            bw.write(line);
            bw.newLine();
            System.out.println("Circuito añadido con éxito.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void loadCircuits() {
        try (BufferedReader br = new BufferedReader(new FileReader("./assets/files/circuits.txt"))){
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    String circuitName = data[0];
                    String countryRace = data[1];

                    Race race = new Race(circuitName, countryRace);
                    circuits.add(race);
                } else {
                    System.out.println("Error.");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void showCircuits() {
        for (Race circuit : circuits) {
            System.out.println(circuit.toString());
        }
    }

    public static void addPilot() {
        System.out.println("Ingrese el nombre del piloto: ");
        String name = sc.nextLine();

        System.out.println("Ingrese el pais del piloto: ");
        String country = sc.nextLine();

        String numberOfRaces = "0";
        String totalPoints = "0";

        Pilot pilot = new Pilot(name, country, 0, 0);
        pilots.add(pilot);

        String line = name + "," + country + "," + numberOfRaces + "," + totalPoints;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("./assets/files/pilots.txt", true)) ){
            bw.write(line);
            bw.newLine();
            System.out.println("Pilto agregado correctamente.");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void loadPilots() {
        try (BufferedReader br = new BufferedReader(new FileReader("./assets/files/pilots.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    String name = data[0];
                    String country = data[1];
                    int numberOfRaces = Integer.parseInt(data[2]);
                    int totalPoints = Integer.parseInt(data[3]);

                    Pilot pilot = new Pilot(name, country, numberOfRaces, totalPoints);
                    pilots.add(pilot);
                } else {
                    System.out.println("Error al guardar.");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void showPilots() {
        for (Pilot pilot : pilots) {
            System.out.println(pilot.showInfo());
        }
    }

}
