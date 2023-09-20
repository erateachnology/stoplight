/*
package com.stoplight.highlevel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.stoplight.highlevel.dto.ContactResponse;
import com.stoplight.highlevel.service.Impl.ContactServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootTest
@ActiveProfiles("test")
public class ContactServiceImplTest {
    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private ContactServiceImpl contactService;

    @Autowired
    private Environment environment;


    @BeforeAll
    public static void setUp() {
        System.setProperty("ACCESS_TOKEN", "your_test_access_token");
        System.setProperty("VERSION", "version");
    }
    @Test
    public void testGetContacts() {
        String myProperty = environment.getProperty("contact.base.url");
        // Mock the response from restTemplate
        ContactResponse expectedResponse = new ContactResponse(
                new ContactResponse.Contact(
                        "12345",                 // id
                        "John Doe",              // name
                        "location123",          // locationId
                        "John",                  // firstName
                        "Doe",                   // lastName
                        "johndoe@example.com",   // email
                        "johndoe@example.com",   // emailLowerCase
                        "America/New_York",     // timezone
                        "ABC Company",           // companyName
                        "+1 123-456-7890",       // phone
                        true,                    // dnd
                        new ContactResponse.Contact.DndSettings(
                                new ContactResponse.Contact.DndSettings.CallSettings("active", "Call message", "Call code"),
                                new ContactResponse.Contact.DndSettings.EmailSettings("active", "Email message", "Email code"),
                                new ContactResponse.Contact.DndSettings.SMSSettings("active", "SMS message", "SMS code"),
                                new ContactResponse.Contact.DndSettings.WhatsAppSettings("active", "WhatsApp message", "WhatsApp code"),
                                new ContactResponse.Contact.DndSettings.GMBSettings("active", "GMB message", "GMB code"),
                                new ContactResponse.Contact.DndSettings.FBSettings("active", "FB message", "FB code")
                        ),
                        "customer",              // type
                        "website",               // source
                        "user123",               // assignedTo
                        "123 Main St",           // address1
                        "Cityville",             // city
                        "CA",                    // state
                        "US",                    // country
                        "12345",                 // postalCode
                        "https://www.example.com", // website
                        List.of("tag1", "tag2"), // tags
                        "1990-01-15",            // dateOfBirth
                        "2021-09-20T08:00:00Z",  // dateAdded
                        "2021-09-21T12:00:00Z",  // dateUpdated
                        "attachment123",         // attachments
                        "123-45-6789",           // ssn
                        "male",                  // gender
                        "keyword123",            // keyword
                        "john",                  // firstNameLowerCase
                        "john doe",              // fullNameLowerCase
                        "doe",                   // lastNameLowerCase
                        "2021-09-22T15:30:00Z",  // lastActivity
                        List.of(
                                new ContactResponse.Contact.CustomField("customField1", "value1"),
                                new ContactResponse.Contact.CustomField("customField2", "value2")
                        ),                        // customFields
                        "business123",            // businessId
                        new ContactResponse.Contact.AttributionSource(
                                "https://source.com", // url
                                "campaign123",        // campaign
                                "utm-source",         // utmSource
                                "utm-medium",         // utmMedium
                                "utm-content",        // utmContent
                                "referrer123",        // referrer
                                "campaign456",        // campaignId
                                "fbclid123",          // fbclid
                                "gclid123",           // gclid
                                "msclikid123",        // msclikid
                                "dclid123",           // dclid
                                "fbc123",             // fbc
                                "fbp123",             // fbp
                                "fbEventId123",       // fbEventId
                                "user-agent-123",     // userAgent
                                "192.168.1.1",        // ip
                                "medium123",          // medium
                                "mediumId123"         // mediumId
                        ),                        // attributionSource
                        new ContactResponse.Contact.LastAttributionSource(
                                "https://source.com/last", // url
                                "last-campaign",           // campaign
                                "last-utm-source",         // utmSource
                                "last-utm-medium",         // utmMedium
                                "last-utm-content",        // utmContent
                                "last-referrer",           // referrer
                                "last-campaign-id",        // campaignId
                                "last-fbclid",             // fbclid
                                "last-gclid",              // gclid
                                "last-msclikid",           // msclikid
                                "last-dclid",              // dclid
                                "last-fbc",                // fbc
                                "last-fbp",                // fbp
                                "last-fbEventId",          // fbEventId
                                "last-user-agent",         // userAgent
                                "192.168.1.2",             // ip
                                "last-medium",             // medium
                                "last-mediumId"            // mediumId
                        )                         // lastAttributionSource
                )
        );

        ResponseEntity<ContactResponse> responseEntity = new ResponseEntity<>(expectedResponse, HttpStatus.OK);
        when(restTemplate.exchange(
                any(RequestEntity.class),
                Mockito.eq(ContactResponse.class)
        )).thenReturn(responseEntity);

        // Call the getContacts method
        String contactId = "123";
        ContactResponse actualResponse = contactService.getContacts(contactId);

        // Verify that the restTemplate.exchange method was called with the expected arguments
        Mockito.verify(restTemplate).exchange(
                any(RequestEntity.class),
                Mockito.eq(ContactResponse.class)
        );

        // Verify that the actual response matches the expected response
        assertEquals(expectedResponse, actualResponse);
    }

    */
/*@Test
    void testGetContacts() {
        assertNull(contactServiceImpl.getContacts("42"));
    }*//*


    @Test
    public void testGetContacts_success() throws Exception {
        // Mock the response from the RestTemplate
        ResponseEntity<ContactResponse> responseEntity = mock(ResponseEntity.class);
        ContactResponse contactResponse = mock(ContactResponse.class);
        when(responseEntity.getBody()).thenReturn(contactResponse);
        when(restTemplate.exchange(any(), Mockito.eq(ContactResponse.class))).thenReturn(responseEntity);

        // Call the getContacts() method
        ContactResponse actualContactResponse = contactService.getContacts("1234567890");

        // Verify the results
        assertEquals(contactResponse, actualContactResponse);
    }
}
*/
