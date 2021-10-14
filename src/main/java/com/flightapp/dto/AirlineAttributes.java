package com.flightapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;

@Data

public class AirlineAttributes {

    @JsonProperty
    @NonNull
    private String flightNumber;
    @JsonProperty
    @NonNull
    private String airline_name;
    @JsonProperty
    @NonNull
    private String origin;
    @JsonProperty
    @NonNull
    private String destination;
    @JsonProperty
    @NonNull
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Timestamp departure;
    @JsonProperty
    @NonNull
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Timestamp arrival;

}
