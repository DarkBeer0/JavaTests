public class Hamming {
    public char[] leftArray;
    public char[] rightArray;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() > rightStrand.length() && rightStrand.length() != 0)
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        if (leftStrand.length() < rightStrand.length() && leftStrand.length() != 0)
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

        if (leftStrand.isEmpty() && !rightStrand.isEmpty())
            throw new IllegalArgumentException("left strand must not be empty.");
        if (rightStrand.isEmpty() && !leftStrand.isEmpty())
            throw new IllegalArgumentException("right strand must not be empty.");
        leftArray = leftStrand.toCharArray();
        rightArray = rightStrand.toCharArray();
    }

    public int getHammingDistance() {
        int result = 0;
        for (int i = 0; i < Math.max(leftArray.length, rightArray.length); i++){
            if (i > leftArray.length - 1 || i > rightArray.length - 1)
            {
                result++;
                continue;
            }
            if (leftArray[i] != rightArray[i])
                result++;
        }

        return result;
    }
}
