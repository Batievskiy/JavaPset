import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.ArrayList;

public class InputStreamLvl16L2v0 {

    public static void main(String[] args) {

        // Various ways to read bytes from an input stream in Java

        // way 1:
        // to fill a byte array from a source,
        // from a randomly simulated data of 50 bytes
        byte[] simulatedSource = new byte[50];

        Random random = new Random();
        random.nextBytes(simulatedSource);
        InputStream inputStream = new ByteArrayInputStream(simulatedSource);

        // way 2:
        // At a basic level we can read each byte one by one from the input stream
        byte[] input = new byte[100];

        for (int i = 0; i < input.length; i++) {
            try {
                int byteRead = inputStream.read();
                if (byteRead == -1) {
                    break;
                }
                input[i] = (byte) byteRead;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // way 3:
        /*
        InputStream.read() returns an integer which must be converted into a byte.
        If the read method returns -1 then we know
        that there’s nothing else coming from the input stream
        hence we can break the loop.
         */
        byte[] inputTwo = new byte[20];
        List<Byte> byteList = new ArrayList<>();
        int result = 0;
        while (result > -1) {
            try {
                result = inputStream.read(inputTwo);
                if (result > -1) {
                    for (int i = 0; i < result; i++) {
                        byteList.add(inputTwo[i]);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // way 4:
        int bytesExtracted = 0;
        int bytesToExtract = 20;
        byte[] inputThree = new byte[bytesToExtract];
        List<Byte> byteList1 = new ArrayList<>();
        while (bytesExtracted < bytesToExtract) {
            try {
                int tempBytesReadCount = inputStream.read(inputThree, bytesExtracted, bytesToExtract - bytesExtracted);
                if (tempBytesReadCount == -1) {
                    break;
                }
                for (int i = 0; i < tempBytesReadCount; i++) {
                    byteList1.add(inputThree[i]);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
