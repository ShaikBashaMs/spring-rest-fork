package io.shaik.sprrest.models;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AppModelTest {

    static AppModel appModel = null;

    @BeforeEach
    public void setUp() {
        appModel = new AppModel();
        appModel.setId(100);
        appModel.setName("Shaik");
        appModel.setCity("Hyd");
    }

    @Test
    public void testShouldValidateNameAndCity() {
        Assertions.assertEquals("Shaik",appModel.getName());
        Assertions.assertEquals("Hyd",appModel.getCity());
    }

    @AfterEach
    public void tearDown() {
        appModel = null;
    }

    @AfterAll
    public static void tearAllDown2() {
        appModel = new AppModel();
    }
}