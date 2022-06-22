package at.technikum.slmexambrunnthaler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class DateTimeController {

    @GetMapping("/api/today")
    public LocalDate localDate(){
        return LocalDate.now();
    }
}