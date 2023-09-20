package com.stoplight.highlevel.dto;

public record InboundDndSettings(
        All all
) {
    public record All(
            String status,
            String message
    ) {
    }
}