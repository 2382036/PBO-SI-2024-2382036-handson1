public class TipeDataCharacterDanBoolean {
    public static void main(String[] args) {

        short tipeDataSHort = 10;
        int tipeDataInt = tipeDataSHort;
        long tipeData = tipeDataInt;

        // Narrwing You, Moments ago
        int tipeDataInteger2 = 10;
        byte tipeDataByte = (byte) tipeDataInteger2;

        //Number overflow
        int tipeDataInteger = 128;
        byte tipeDataByteConverted = (byte) tipeDataInteger;
        System.out.println(tipeDataByteConverted);
    }
}
