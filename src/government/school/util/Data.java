package government.school.util;
import java.io.*;


public final class Data {

    public static void serializeToFile(Object obj, String filename) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            // Serialize the object into a byte array
            oos.writeObject(obj);
            oos.flush();
            byte[] serializedData = baos.toByteArray();
            // Encrypt the serialized data with a simple XOR-based encryption
            byte[] encryptedData = xorEncrypt(serializedData);
            // Write the encrypted data to the file
            try (FileOutputStream fos = new FileOutputStream(filename)) {
                fos.write(encryptedData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object deserializeFromFile(String filename) {
        try (FileInputStream fis = new FileInputStream(filename)) {
            // Read the entire encrypted file content into a byte array
            byte[] encryptedData = fis.readAllBytes();
            // Decrypt the data (same XOR method works for decryption)
            byte[] decryptedData = xorEncrypt(encryptedData);
            // Deserialize the object from the decrypted byte array
            try (ByteArrayInputStream bais = new ByteArrayInputStream(decryptedData);
                 ObjectInputStream ois = new ObjectInputStream(bais)) {
                return ois.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Simple XOR encryption/decryption helper method
    private static byte[] xorEncrypt(byte[] data) {
        // A constant key string. For a 256-bit key, the key should be 32 bytes.
        // Here we use a hard-coded key; in production, this should be securely managed.
        final String key = "1234567890abcdef1234567890abcdef"; // 32 characters = 256 bits if each char is one byte
        byte[] keyBytes = key.getBytes();
        byte[] output = new byte[data.length];
        for (int i = 0; i < data.length; i++) {
            output[i] = (byte) (data[i] ^ keyBytes[i % keyBytes.length]);
        }
        return output;
    }


}
