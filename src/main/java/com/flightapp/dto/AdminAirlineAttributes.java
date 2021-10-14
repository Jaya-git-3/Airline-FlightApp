package com.flightapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;

@Data
public class AdminAirlineAttributes {

    @JsonProperty
    @NonNull
    private AirlineAttributes airlineAttributes;
    @JsonProperty
    @NonNull
    private boolean vegMeals;
    @JsonProperty
    @NonNull
    private boolean nonVegMeals;
}
