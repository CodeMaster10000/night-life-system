package com.mile.nightlife.global.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public final class TypedCoordinates {

  private String type;

  private double latitude;

  private double longitude;

}
