package IC;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
@Data
@JsonIgnoreProperties(value={"exactEndTime", "exactStartTime","imagelinks"})
public class EventObject {
    String title;
    String description;
    String imagelinks;
    String keywords;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    LocalDate eventdate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    LocalDate enddate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH.mm")
    LocalTime eventtime;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH.mm")
    LocalTime endtime;
    String eventcalendar;
    Integer eventid;
    String location; //either placeKey, lat,long or postcode
    @JsonSerialize(using = CustomLocalDateTimeSerializer.class)
    public LocalDateTime exactStartTime;
    @JsonSerialize(using = CustomLocalDateTimeSerializer.class)
    public LocalDateTime exactEndTime;
}
