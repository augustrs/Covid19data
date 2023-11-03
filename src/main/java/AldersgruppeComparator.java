import java.util.Comparator;

public class AldersgruppeComparator implements Comparator<Covid19Data> {

    @Override
    public int compare(Covid19Data o1, Covid19Data o2) {
        return o1.aldersgruppe.compareTo(o2.aldersgruppe);
    }
}
