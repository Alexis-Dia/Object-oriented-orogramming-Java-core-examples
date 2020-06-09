package by.bntu.fitr.povt.cryptography;

/**
 * @author Alexey Druzik on 09.06.2020
 */
public class Lab1 {

    /**
     * Для перевода сивольного типа в тип номер в таблице ASCII, можно использовать - (int)'A'
     * Для перевода из номера ASCII в сивольный тип, можно использовать - (char)65
     */
    public static void main(String[] args) {
        String fieldForEncryption = "JOE BARBORO";
        int k0 = 5;
        int k1 = 7;
        int mod = 26;

        String encryptResult = encrypt(k0, k1, mod, fieldForEncryption);
        String decryptResult = decrypt(k0, k1, mod, encryptResult);

        System.out.println("Original field for encryption = " + fieldForEncryption);
        System.out.println("Result of encryption = " + encryptResult);
        System.out.println("Result of decryption = " + decryptResult);
    }

    public static String encrypt(int k0, int k1, int mod, String text_in) {
        String text_out = "";
        for(int i = 0; i < text_in.length(); i++) {
            char i_decrypt =  text_in.charAt(i);
            if (i_decrypt == ' ') {
                text_out += " ";
            } else {
                int numberOfPositionInUpperCase = (int) Character.toUpperCase(i_decrypt);
                int i_encrypt = ((numberOfPositionInUpperCase - 65) * k1 + k0) % mod;
                text_out += (char)(i_encrypt + 65);
            }
        }
        return text_out;
    }

    public static String decrypt(int k0, int k1, int mod, String text_in) {
        String text_out = "";

        for(int i = 0; i < text_in.length(); i++) {
            if (text_in.charAt(i) == ' ') {
                text_out += " ";
            } else {
                int symbol = ((int) Character.toUpperCase(text_in.charAt(i)))- 65;
                int div = 0;

                while (true) {
                    int i_decrypt = div * mod + symbol - k0;
                    if (i_decrypt >= 0) {
                        if (i_decrypt % k1 == 0) {
                            i_decrypt /= k1;
                            char letter = (char)(i_decrypt + 65);
                            text_out += letter;
                            break;
                        } else {
                            div += 1;
                        }
                    } else {
                        div += 1;
                    }
                }
            }

        }

        String result = text_out.toUpperCase();
        return result;
    }
}
