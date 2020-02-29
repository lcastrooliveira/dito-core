package dtos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Map;

@Data
public class EventDocumentDTO implements Serializable {

    private String id;

    @NotNull
    private String event;

    @NotNull
    private ZonedDateTime timestamp;

    private BigDecimal revenue;

    private Map<String, String> customData;
}
