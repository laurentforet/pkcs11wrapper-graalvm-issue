
import java.io.File;

public class Pkcs11WrapperLoader {

    public static final String WRAPPER = "pkcs11wrapper.dll";

    public static void main(String[] args) {

        final String wrapper = args.length == 0 ? WRAPPER : args[0];
        System.out.println("WRAPPER = " + wrapper);
        System.load(new File(wrapper).getAbsolutePath());
        System.out.println("Loaded");

    }

}
