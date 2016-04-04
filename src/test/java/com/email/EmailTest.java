package com.email;

import com.email.domain.Email;
import com.email.factories.EmailFactory;
import com.email.factories.EmailsFactory;
import com.email.factories.EmailsFactoryImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmailTest
{
    EmailsFactory factory;

    @BeforeMethod
    public void setUp() throws Exception {
        factory = EmailsFactoryImpl.getInstance();
    }

    @Test
    public void testEmailCreation() throws Exception {
        Email role = factory.createEmail("abcd@msn.com", "MSN account");
        Assert.assertEquals(role.getDescription(), "MSN account");
    }

    @Test
    public void testEmailUpdate() throws Exception {
        Email email = factory.createEmail("giantYetiMeme@aol.net", "System Administrator");
        Assert.assertEquals(email.getDescription(), "System Administrator");

        Email updateEmail = new Email.Builder()
                .copy(email)
                .description("Giant Yeti")
                .build();

        Assert.assertEquals(updateEmail.getDescription(),"Giant Yeti");
    }

    @Test
    public void testTestEmail() throws Exception {
        String email = EmailFactory.getEmail("private");
        System.out.println("The Address is " + email);

    }
}
