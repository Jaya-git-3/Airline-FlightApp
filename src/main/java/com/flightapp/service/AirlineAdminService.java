package com.flightapp.service;

import com.flightapp.dto.AdminAirlineAttributes;
import com.flightapp.dto.AdminCredentials;
import org.springframework.stereotype.Service;

@Service
public class AirlineAdminService {

    public boolean validateAdmin(AdminCredentials adminCredentials) {
        if (adminCredentials.getUsername().equals("admin") && adminCredentials.getPassword().equals("pass")) {
            return true;
        } else
            return false;
    }

    public void addOrUpdateAirlines(AdminAirlineAttributes adminAirlineAttributes) {

    }
}
