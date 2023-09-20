package com.stoplight.highlevel.service.Impl;

import com.stoplight.highlevel.dto.ContactResponse;

public interface ContactService {

    ContactResponse getContacts(String contactId);
}
