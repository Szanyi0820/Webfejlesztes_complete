package cars;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
enum Color {
	BLUE( "Kék" ), RED( "Piros" ), GREEN( "Zöld" );

	private final String colorName;

}
