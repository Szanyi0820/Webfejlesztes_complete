package audi;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString
public enum FuelType {
    DIESEL("Dízel");

    private final String name;
}

