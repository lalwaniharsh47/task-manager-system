package com.example.task_manager.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TaskPriority {
    HIGH, 
    MEDIUM, 
    LOW;

    @JsonCreator
    public static TaskPriority fromString(String value) {
        return TaskPriority.valueOf(value.toUpperCase()); // Convert to uppercase
    }

    @JsonValue
    public String toValue() {
        return name(); // Keeps it uppercase when returning JSON
    }
}
