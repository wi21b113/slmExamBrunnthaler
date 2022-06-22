package at.technikum.slmexambrunnthaler;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

public class DateTimeControllerTest {

    @Test
    public void dateNotNull() {
        Assert.assertNotNull(LocalDate.now());
    }


    @Test
    public void timeNotNull() {
        Assert.assertNotNull(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }



    @Test
    public void timeFormatNotNull() {
        Assert.assertNotNull(LocalTime.now().format(DateTimeFormatter.ofPattern(10 + ":" + 22 + ":" + 12)));
    }

}