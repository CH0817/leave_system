package tw.com.rex.leave_system.util;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class EncryptUtils {

    private static PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    public static String encrypt(String password) {
        return passwordEncoder.encode(password);
    }

    public static boolean verify(String password, String encrypt) {
        return passwordEncoder.matches(password, encrypt);
    }

}
