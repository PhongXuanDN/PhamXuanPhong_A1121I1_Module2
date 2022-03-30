package CaseStudy.utils;

import CaseStudy.Model.Booking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking> {

    @Override
    public int compare(Booking booking1, Booking booking2) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate1 = LocalDate.parse(booking1.getDateStart(),dateTimeFormatter);
        LocalDate startDate2 = LocalDate.parse(booking2.getDateStart(),dateTimeFormatter);
        LocalDate endDate1 = LocalDate.parse(booking1.getDateEnd(),dateTimeFormatter);
        LocalDate endDate2 = LocalDate.parse(booking2.getDateEnd(),dateTimeFormatter);
        if(startDate1.compareTo(startDate2)>0)
            return 1;
        else if (startDate1.compareTo(startDate2)>0)
                return -1;
        else {
            if (endDate1.compareTo(endDate2) > 0)
                return 1;
            else if(endDate1.compareTo(endDate2)<0)
                return -1;
        }
        return 0;
    }
}
