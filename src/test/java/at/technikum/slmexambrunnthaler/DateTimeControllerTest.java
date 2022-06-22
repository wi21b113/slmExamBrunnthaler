package at.technikum.slmexambrunnthaler;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DateTimeControllerTest {

    @Test
    public void dateNotNull() {
        Assert.assertNotNull(LocalDate.now());
    }

}