package com.stoplight.highlevel.dto;

import java.util.List;
public record ContactResponse(
        Contact contact
) {
    public static record Contact(
            String id,
            String name,
            String locationId,
            String firstName,
            String lastName,
            String email,
            String emailLowerCase,
            String timezone,
            String companyName,
            String phone,
            boolean dnd,
            DndSettings dndSettings,
            String type,
            String source,
            String assignedTo,
            String address1,
            String city,
            String state,
            String country,
            String postalCode,
            String website,
            List<String> tags,
            String dateOfBirth,
            String dateAdded,
            String dateUpdated,
            String attachments,
            String ssn,
            String gender,
            String keyword,
            String firstNameLowerCase,
            String fullNameLowerCase,
            String lastNameLowerCase,
            String lastActivity,
            List<CustomField> customFields,
            String businessId,
            AttributionSource attributionSource,
            LastAttributionSource lastAttributionSource
    ) {
        public static record DndSettings(
                CallSettings Call,
                EmailSettings Email,
                SMSSettings SMS,
                WhatsAppSettings WhatsApp,
                GMBSettings GMB,
                FBSettings FB
        ) {
            public static record CallSettings(
                    String status,
                    String message,
                    String code
            ) {
            }

            public static record EmailSettings(
                    String status,
                    String message,
                    String code
            ) {
            }

            public static record SMSSettings(
                    String status,
                    String message,
                    String code
            ) {
            }

            public static record WhatsAppSettings(
                    String status,
                    String message,
                    String code
            ) {
            }

            public static record GMBSettings(
                    String status,
                    String message,
                    String code
            ) {
            }

            public static record FBSettings(
                    String status,
                    String message,
                    String code
            ) {
            }
        }

        public static record CustomField(
                String id,
                String value
        ) {
        }

        public static record AttributionSource(
                String url,
                String campaign,
                String utmSource,
                String utmMedium,
                String utmContent,
                String referrer,
                String campaignId,
                String fbclid,
                String gclid,
                String msclikid,
                String dclid,
                String fbc,
                String fbp,
                String fbEventId,
                String userAgent,
                String ip,
                String medium,
                String mediumId
        ) {
        }

        public static record LastAttributionSource(
                String url,
                String campaign,
                String utmSource,
                String utmMedium,
                String utmContent,
                String referrer,
                String campaignId,
                String fbclid,
                String gclid,
                String msclikid,
                String dclid,
                String fbc,
                String fbp,
                String fbEventId,
                String userAgent,
                String ip,
                String medium,
                String mediumId
        ) {
        }
    }
}

