package com.stoplight.highlevel.dto;

import java.util.List;

public record CreateContactRequest(
        String firstName,
        String lastName,
        String name,
        String email,
        String locationId,
        String gender,
        String phone,
        String address1,
        String city,
        String state,
        String postalCode,
        String website,
        String timezone,
        boolean dnd,
        DndSettings dndSettings,
        InboundDndSettings inboundDndSettings,
        List<String> tags,
        List<CustomField> customFields,
        String source,
        String country,
        String companyName
) {
    public record DndSettings(
            Call call,
            Email email,
            SMS sms,
            WhatsApp whatsapp,
            GMB gmb,
            FB fb
    ) {
    }

    public record Call(
            String status,
            String message,
            String code
    ) {
    }

    public record Email(
            String status,
            String message,
            String code
    ) {
    }

    public record SMS(
            String status,
            String message,
            String code
    ) {
    }

    public record WhatsApp(
            String status,
            String message,
            String code
    ) {
    }

    public record GMB(
            String status,
            String message,
            String code
    ) {
    }

    public record FB(
            String status,
            String message,
            String code
    ) {
    }
}

