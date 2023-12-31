package com.stoplight.highlevel.controller;

import com.stoplight.highlevel.dto.ContactResponse;
import com.stoplight.highlevel.dto.CreateContactRequest;
import com.stoplight.highlevel.service.Impl.ContactService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/marketplace/gohighlevel")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contacts/{contactId}")
    public ResponseEntity<ContactResponse> getContact(@PathVariable String contactId){
       return ResponseEntity.ok(contactService.getContacts(contactId));
    }

    @PostMapping("/contacts")
    public ResponseEntity<ContactResponse> createContact(@RequestBody CreateContactRequest request){
        return ResponseEntity.ok(contactService.createContact(request));

    }
}
