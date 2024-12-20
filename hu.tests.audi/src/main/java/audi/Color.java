package audi;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString
public enum Color {
    BLUE("Kék");

    private final String colorName;
}

