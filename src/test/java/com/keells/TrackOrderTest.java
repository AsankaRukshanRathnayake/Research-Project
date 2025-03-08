package com.keells;

import Constants.LabelConstants;
import functions.MainFunctions;
import functions.homeFunctions;
import functions.trackOrder;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static functions.MainFunctions.driver1;

public class TrackOrderTest {
    @BeforeMethod
    public void setup(){
        MainFunctions.setup();
        driver1.get("https://www.keellssuper.com/");
        homeFunctions.closeHelloPopup();
        homeFunctions.clickOnTrackMyOrder();
    }

    @AfterMethod
    public void close(){
        driver1.close();
        driver1.quit();
    }

    @Test(description = "RPKE-TC-05 - Verify Track My Order Link is working", alwaysRun = true)
    public void verifyTrackMyOrderLink(){
        Assert.assertEquals(trackOrder.getTrackOrderLabelText(), LabelConstants.TRACK_ORDER);
    }

    @Test(description = "RPKE-TC-100 - Verfiy Track My Order Contect", alwaysRun = true)
    public void verifyTrackMyOrderContenct(){
        Assert.assertTrue(trackOrder.isKeellsLogoDisplayed());
        Assert.assertEquals(trackOrder.getTrackOrderLabelText(), LabelConstants.TRACK_ORDER);
        Assert.assertEquals(trackOrder.getOrderNumberLabelText(), LabelConstants.ORDER_NUMBER_LABEL);
        Assert.assertEquals(trackOrder.getContactNumberLabelText(), LabelConstants.CONTACT_EMAIL_LABEL);
        Assert.assertTrue(trackOrder.isOrderNumberFieldDisplayed());
        Assert.assertTrue(trackOrder.isContactNumberFieldDisplayed());
        Assert.assertEquals(trackOrder.getSubmitButtonText(), LabelConstants.SUBMIT);
        Assert.assertEquals(trackOrder.getInstructionText(), LabelConstants.TRACK_ORDER_INSTRUCTION);
        Assert.assertEquals(trackOrder.getOrderNumberInstructionText(), LabelConstants.ORDER_NUMBER_INSTRUCTION);
    }

    @Test(description = "RPKE-TC-101 - Verify Track Order Submit with empty values", alwaysRun = true)
    public void verifyTrackMyOrderWithEmptyValues(){
        trackOrder.clickOnSubmit();
        Assert.assertEquals(trackOrder.getError1(), LabelConstants.REQUIRED);
        Assert.assertEquals(trackOrder.getError2(),LabelConstants.REQUIRED);
    }

    @Test(description = "RPKE-TC-102 - Verify Track Order only with Order number", alwaysRun = true)
    public void verifyTrackMyOrderOnlyWithOrderNumber(){
        trackOrder.enterOrderNumber("123456");
        trackOrder.clickOnSubmit();
        Assert.assertEquals(trackOrder.getError2(),LabelConstants.REQUIRED);
    }

    @Test(description = "RPKE-TC-103 - Verify Track Order only with phone number", alwaysRun = true)
    public void verifyTrackMyOrderOnlyWithPhoneNumber(){
        trackOrder.enterContactNumber("0712345678");
        trackOrder.clickOnSubmit();
        Assert.assertEquals(trackOrder.getError1(), LabelConstants.REQUIRED);
    }

    @Test(description = "RPKE-TC-104 - Verify Track Order with invalid phone number", alwaysRun = true)
    public void verifyTrackMyOrderWithInvalidPhoneNumber(){
        trackOrder.enterOrderNumber("123456");
        trackOrder.enterContactNumber("1234567890");
        trackOrder.clickOnSubmit();
        Assert.assertEquals(trackOrder.getError2(), LabelConstants.NUMBER_FORMAT_ERROR);
    }

    @Test(description = "RPKE-TC-105 - Verify Track Order with Contact with Characters", alwaysRun = true)
    public void verifyTrackMyOrderWithContactWithCharacters(){
        trackOrder.enterOrderNumber("123456");
        trackOrder.enterContactNumber("abcde");
        trackOrder.clickOnSubmit();
        Assert.assertEquals(trackOrder.getError2(), LabelConstants.INVALID_INPUT);
    }

    @Test(description = "RPKE-TC-106 - Verify Track Order with invalid order number and contact number", alwaysRun = true)
    public void verifyTrackMyOrderWithEmptyInvalidOrderNumberAndContactNumber(){
        trackOrder.enterOrderNumber("123456");
        trackOrder.enterContactNumber("0712345678");
        trackOrder.clickOnSubmit();
        Assert.assertEquals(trackOrder.getInvalidOrderErrorPopupText(), LabelConstants.INVALID_ORDER_ERROR);
    }

    @Test(description = "RPKE-TC-107 - Verify Track Order with invalid order number and email", alwaysRun = true)
    public void verifyTrackMyOrderWithEmptyInvalidOrderNumberAndEmail(){
        trackOrder.enterOrderNumber("123456");
        trackOrder.enterContactNumber("abc@gmail.com");
        trackOrder.clickOnSubmit();
        Assert.assertEquals(trackOrder.getInvalidOrderErrorPopupText(), LabelConstants.INVALID_ORDER_ERROR);
    }
}
