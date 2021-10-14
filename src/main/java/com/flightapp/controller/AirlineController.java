package com.flightapp.controller;

import com.flightapp.constants.AirlineConstants;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirlineController {

    StringBuffer airlineEndpoints;

    /**
     * This method returns airline service endpoints.
     *
     * @return  airlineEndpoints - String
     */
    @GetMapping(AirlineConstants.HOMEPAGE)
    public ResponseEntity<?> homepage() {
        airlineEndpoints = new StringBuffer();
                airlineEndpoints
                .append("Airline Service - Home page - GET - " + AirlineConstants.HOMEPAGE)
                .append("\n")
                .append("Airline Service - Admin login page - POST - " + AirlineConstants.FLIGHT +  AirlineConstants.ADMIN_LOGIN)
                .append("\n")
                .append("Airline Service - Add/Modify Airline details - POST - " + AirlineConstants.FLIGHT + AirlineConstants.ADD_AIRLINES)
                .append("\n")
                .append("Airline Service - Admin logout page - GET - " + AirlineConstants.FLIGHT + AirlineConstants.ADMIN_LOGOUT)
                .append("\n")

                .append("Airline Service - Searches for flight - POST - " + AirlineConstants.FLIGHT + AirlineConstants.SEARCH)
                .append("\n")
                .append("Airline Service - Book Ticket - POST - " + AirlineConstants.FLIGHT + AirlineConstants.BOOK_TICKET)
                .append("\n")
                .append("Airline Service - Get Booked ticket details based on PNR - GET - " + AirlineConstants.FLIGHT + AirlineConstants.BOOKED_TICKET_BY_PNR)
                .append("\n")
                .append("Airline Service - Get booked tickets history based on Email ID - GET - " + AirlineConstants.FLIGHT + AirlineConstants.BOOKED_TICKET_BY_MAIL_ID)
                .append("\n")
                .append("Airline Service - Cancel a booked ticket by PNR - DELETE - " + AirlineConstants.FLIGHT + AirlineConstants.CANCEL_TICKET)
                .append("\n");

        return ResponseEntity.ok(airlineEndpoints.toString());
    }

}
/*
{
"airlineAttributes" :
{
"flightNumber":"A3 4562",
"airline_name":"AeroMexico",
"origin":"India",
"destination":"Mexico",
"departure":"2020-04-01T09:18:18Z",
"arrival":"2020-04-01T09:18:18Z"
},
"vegMeals": true,
"nonVegMeals": true
}

 */