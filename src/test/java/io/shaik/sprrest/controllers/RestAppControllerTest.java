package io.shaik.sprrest.controllers;

import io.shaik.sprrest.models.AppModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RestAppControllerTest {

    @Autowired
    private RestAppController restAppController;

    List<AppModel> list = new ArrayList<>();

    AppModel appModel = new AppModel(1,"Shaik", "Bang");

    @BeforeEach
    public void setUp() {
        restAppController.modelData(appModel);
        List<AppModel> appModelList = Arrays.asList(appModel);

    }

    @Test
    public void testValida() {
        Assertions.assertEquals("Shaik",restAppController.modelData(appModel).getName());
        Assertions.assertNotEquals("Shaiks",restAppController.modelData(appModel).getName());
  //      Assertions.assertEquals(1,appModelL);
    }

    @Test
    public void testShouldValidate() {

    }
}