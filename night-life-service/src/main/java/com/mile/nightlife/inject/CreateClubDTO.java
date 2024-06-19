package com.mile.nightlife.inject;

record CreateClubDTO(
    String name,
    String email,
    String genre,
    int averageCost,
    String address,
    double latitude,
    double longitude,
    String type) {}
