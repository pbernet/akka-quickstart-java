package projectlombok;

import lombok.Data;
import lombok.experimental.Wither;

/**
 * To behave like (immutable) Scala case class: Fields must be final
 */
@Data
@Wither
public class Mountain {
    private final String name;
    private final Double latitude, longitude;
    private final String Country;
}