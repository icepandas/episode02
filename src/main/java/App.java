/**
 * Created by panda on 2018/3/20.
 */
import org.nem.core.crypto.KeyPair;
public class App {

        public static void main(String[] args) {
            System.out.println("nem:");
            final KeyPair someKey = new KeyPair();
            System.out.println(String.format("Private key: %s", someKey.getPrivateKey()));
            System.out.println(String.format("Public key: %s", someKey.getPublicKey()));
        }
}
