package at.technikum.slmexambrunnthaler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
//test
@RestController
public class DateTimeController {

    @GetMapping("/api/today")
    public LocalDate localDate(){
        return LocalDate.now();
    }

    @GetMapping("/api/now")
    public String timeNow(){
        return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
