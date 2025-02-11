package com.example.task_manager.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TaskStatus {
    COMPLETED, 
    IN_PROGRESS, 
    PENDING;

    @JsonCreator
    public static TaskStatus fromString(String value) {
        return TaskStatus.valueOf(value.toUpperCase()); // Convert to uppercase
    }

    @JsonValue
    public String toValue() {
        return name(); // Keeps it uppercase when returning JSON
    }
}
