package com.flightapp.controller;

import com.flightapp.constants.AirlineConstants;
import com.flightapp.dto.AdminAirlineAttributes;
import com.flightapp.dto.AdminCredentials;
import com.flightapp.service.AirlineAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(AirlineConstants.FLIGHT)
public class AirlineAdminController {
    public boolean isAdmin = false;
    public AirlineAdminService airlineAdminService;
    @Autowired
    public AirlineAdminController(AirlineAdminService adminService) {
        this.airlineAdminService = adminService;

    }

    @PostMapping(AirlineConstants.ADMIN_LOGIN)
    public ResponseEntity<?> adminLogin(@RequestParam String userName, @RequestParam String password) {
        this.isAdmin = airlineAdminService.validateAdmin(new AdminCredentials(userName, password));
        if(isAdmin) {
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body("Login success");
        } else {
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body("Incorrect credentials");
        }
    }

    @PostMapping(AirlineConstants.ADD_AIRLINES)
    public ResponseEntity<?> addUpdateAirlines(@RequestBody AdminAirlineAttributes adminAirlineAttributes) {
        if(!isAdmin) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN)
                    .body("You are not Authorized. Please login as Admin to perform this action.");
        } else {
            try {
                airlineAdminService.addOrUpdateAirlines(adminAirlineAttributes);
            } catch (Exception e){}
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body("Incorrect credentials");
        }
    }

    @GetMapping(AirlineConstants.ADMIN_LOGOUT)
    public ResponseEntity<?> adminLogout() {

        this.isAdmin = false;

        return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body("Logged out successfully..!");
    }
}
