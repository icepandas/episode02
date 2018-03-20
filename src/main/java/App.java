/**
 * Created by panda on 2018/3/20.
 */
import org.nem.core.crypto.KeyPair;
import org.nem.core.model.Address;
import org.nem.core.model.NetworkInfos;

public class App {

        public static void main(String[] args) {
            System.out.println("nem:");
            final KeyPair someKey = new KeyPair();
            final Address anaddress=Address.fromPublicKey(NetworkInfos.getMainNetworkInfo().getVersion(), someKey.getPublicKey());

            PrintKey(someKey,anaddress);

            return;

        }


    private static void PrintKey(KeyPair someKey, Address anaddress) {

        System.out.println(String.format("Private key: %s", someKey.getPrivateKey()));
        System.out.println(String.format("Public key: %s", someKey.getPublicKey()));
        System.out.println(String.format("Address: %s",anaddress ));

    }
}
