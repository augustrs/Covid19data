import java.util.Date;

public class Covid19Data {
String region;
String aldersgruppe;
int bekræftedeTilfælde;
int døde;
int indlagtePåIntensiv;

public Covid19Data (String region, String aldersgruppe, int bekræftedeTilfælde, int døde, int indlagtePåIntensiv) {
    this.region = region;
    this.aldersgruppe = aldersgruppe;
    this.bekræftedeTilfælde = bekræftedeTilfælde;
    this.døde = døde;
    this.indlagtePåIntensiv = indlagtePåIntensiv;
}

    @Override
    public String toString() {
        return "Covid19Data: " + "Region: "+region+" " + "Aldersgruppe "+aldersgruppe+" " +"Bekræftede tilfælde "+ bekræftedeTilfælde+" " +"Døde: " +døde+ " " +"Indlagte på intensiv: "+ indlagtePåIntensiv;
    }
}
