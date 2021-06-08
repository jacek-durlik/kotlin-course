package pl.anril;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Bicycle {
    private int speed;
    private int gear;
    private int cadence;
}
