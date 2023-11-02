import java.util.Date;

public class Covid19Data {
String region;
String aldersgruppe;
int bekræftedeTilfælde;
int døde;
int indlagtePåIntensiv;
int indlagte;

public Covid19Data (String region, String aldersgruppe, int bekræftedeTilfælde, int døde, int indlagtePåIntensiv, int indlagte) {
    this.region = region;
    this.aldersgruppe = aldersgruppe;
    this.bekræftedeTilfælde = bekræftedeTilfælde;
    this.døde = døde;
    this.indlagtePåIntensiv = indlagtePåIntensiv;
    this.indlagte = indlagte;
}

    @Override
    public String toString() {
        return "Covid19Data: " + "Region: "+region+" " + "Aldersgruppe "+aldersgruppe+" " +"Bekræftede tilfælde "+ bekræftedeTilfælde+" " +"Døde: " +døde+ " " +"Indlagte på intensiv: "+ indlagtePåIntensiv+ " Indlagte: "+indlagte;
    }
}
