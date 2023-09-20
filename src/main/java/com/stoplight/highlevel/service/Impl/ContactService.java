package com.stoplight.highlevel.service.Impl;

import com.stoplight.highlevel.dto.ContactResponse;
import com.stoplight.highlevel.dto.CreateContactRequest;

public interface ContactService {

    ContactResponse getContacts(String contactId);

    ContactResponse createContact(CreateContactRequest request);
}
