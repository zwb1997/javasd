package demo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 *
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate ld = LocalDate.parse("2020/01/01", dtf);
        log.info("date is -> [{}]", ld);
        log.info("date is -> [{}]", ld.format(dtf));
        log.info("date timestamp is -> [{}]", ld.toEpochDay());

        DateTimeFormatter timingDTF = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime lt = LocalTime.parse("10:12:59",timingDTF);
        log.info("time is -> [{}]", lt);

        DateTimeFormatter timingMinEndDTF = DateTimeFormatter.ofPattern("HH:mm");
        String time1 = "09:00";
        String time2 = "00:00";
        String time3 = "14:00";

        String time4 = "09:00";

        LocalTime l1 = LocalTime.parse(time1, timingMinEndDTF);
        LocalTime l2 = LocalTime.parse(time2, timingMinEndDTF);
        LocalTime l3 = LocalTime.parse(time3, timingMinEndDTF);

        LocalTime l4 = LocalTime.parse(time4, timingMinEndDTF);
        if(l1.isAfter(l2) && l1.isBefore(l3)){
            log.info("l1 -> [{}] is after l2 -> [{}] and before l3 -> [{}]", l1,l2,l3);
        }

        if(l1.equals(l4)){
            log.info("l1 -> [{}] is equals l4 -> [{}]", l1,l4);
        }
    }
}
