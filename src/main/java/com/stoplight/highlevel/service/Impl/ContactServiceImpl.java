package com.stoplight.highlevel.service.Impl;

import com.stoplight.highlevel.dto.ContactResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
@Slf4j
public class ContactServiceImpl implements ContactService{

    private final RestTemplate restTemplate;
    @Value("${ACCESS_TOKEN}")
    private String accessToken;

    @Value("${VERSION}")
    private String version;

    @Value("${contact.base.url}")
    private String contactBaseUrl;

    public ContactServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ContactResponse getContacts(String contactId) {
        ContactResponse contactResponse = null;
        try{
            // Build the full URL using UriComponentsBuilder
            UriComponents builder = UriComponentsBuilder.fromHttpUrl(contactBaseUrl)
                    .path("/{contactId}")
                    .buildAndExpand(contactId);

            HttpHeaders headers = setUpHeaders();
            HttpEntity<String> entity = new HttpEntity<>(headers);

            // Create a request entity with GET method and the constructed URL
            RequestEntity<?> requestEntity = new RequestEntity<>(entity, HttpMethod.GET, builder.toUri());
            // Make the GET request using exchange
            ResponseEntity<ContactResponse> responseEntity = restTemplate.exchange(requestEntity, ContactResponse.class);
            contactResponse =  responseEntity.getBody();
        }catch (Exception exception){
            log.error(exception.getMessage());
        }
        return contactResponse;
    }

    private HttpHeaders setUpHeaders(){
        // Set up request headers
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        headers.add("Authorization", accessToken);
        headers.add("Version",version);
        return headers;
    }
}
