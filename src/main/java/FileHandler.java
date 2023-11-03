import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Scanner sc = new Scanner(f, StandardCharsets.ISO_8859_1);
public class FileHandler {
    private File f;
    ArrayList<Covid19Data> covid19DataList = new ArrayList<>();

    public boolean validateLine(String[] line) {
        if (!line[0].equals("Hovedstaden") && (!line[0].equals("Midtjylland")) && (!line[0].equals("Nordjylland")) && (!line[0].equals("Sjælland")) && (!line[0].equals("Syddanmark"))) {
            return false;
        }
        return true;
    }

    public FileHandler() {
        f = new File("11_noegletal_pr_region_pr_aldersgruppe.csv");
    }

    public void parseData() {

        try (Scanner scanner = new Scanner(f, StandardCharsets.ISO_8859_1)) {
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(";");
                if (values.length == 6) {
                    String region = values[0];
                    String aldersgruppe = values[1];
                    int beKræftedeTilfælde = Integer.parseInt(values[2].trim());
                    int døde = Integer.parseInt(values[3].trim());
                    int indlagtePåIntensiv = Integer.parseInt(values[4].trim());
                    int indlagte = Integer.parseInt(values[5].trim());

                    if (validateLine(values)) {
                        Covid19Data covid19Data = new Covid19Data(region, aldersgruppe, beKræftedeTilfælde, døde, indlagtePåIntensiv, indlagte);
                        covid19DataList.add(covid19Data);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        /*for (Covid19Data covid19Data : covid19DataList) {
            System.out.println(covid19Data);
*/

    }

    public void compareforRegion() {
        Collections.sort(covid19DataList, new RegionComparator());

    }

    public void compareForAlder() {
        Collections.sort(covid19DataList, new AldersgruppeComparator());
    }
    public void compareForAlderRegion() {
        Collections.sort(covid19DataList,new RegionComparator().thenComparing(new AldersgruppeComparator()));
    }
    public void compareForRegionAlder() {
        Collections.sort(covid19DataList,new AldersgruppeComparator().thenComparing(new RegionComparator()));
    }

    public void printData() {
        for (Covid19Data covid19Data : covid19DataList) {
            System.out.println(covid19Data);
        }


    }


}
