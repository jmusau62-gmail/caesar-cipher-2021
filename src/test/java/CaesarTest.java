import org.junit.*;
import static org.junit.Assert.*;

public class CaesarTest {

    @Test
    public void runCipher_returnStringPlainText_String(){
        Caesar testCipher = new Caesar("josh",2);
        testCipher.getPlainWord();
        assertEquals("josh", testCipher.getPlainWord());
    }

    @Test
    public void runCipher_returnIntShift_Integer(){
        Caesar testCipher2 = new Caesar("nevamindit", 2);
        testCipher2.getShift();
        assertEquals(2, testCipher2.getShift());

    }

    @Test
    public void encrypt_returnEncryptedText_String(){
        Caesar testCipher3 = new Caesar("tom", 2);
        testCipher3.encrypt("tom", 2);
        assertEquals("lquj", testCipher3.encrypt("josh", 2));
    }

    @Test
    public void decrypt_returnDecryptedText_String(){
        Caesar testCipher4 = new Caesar("rko", 2);
        testCipher4.decrypt("rko", 2);
        assertEquals("josh", testCipher4.decrypt("lquj",2));
    }

}