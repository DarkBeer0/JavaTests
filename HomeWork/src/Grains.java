import java.math.BigInteger;
import java.util.stream.IntStream;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        return BigInteger.valueOf(IntStream.rangeClosed(1, square)
                .reduce(0, (acc, n) -> (acc + n) * 2));
    }

    BigInteger grainsOnBoard() {
        return BigInteger.valueOf(IntStream.rangeClosed(1, 64)
                .reduce(0, (acc, n) -> (acc + n) * 2));
    }

}
