package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public record Location(
        @JsonProperty("post code") String postCode,
        @JsonProperty("country") String country,
        @JsonProperty("country abbreviation") String countryAbbreviation,
        @JsonProperty("places") List<Places>places) { }
