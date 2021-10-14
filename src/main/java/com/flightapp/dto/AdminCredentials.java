package com.flightapp.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class AdminCredentials {

    @NonNull
    private String username;
    @NonNull
    private String password;

}
