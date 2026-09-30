package utils;

public class Utilidade {

    public static converterLong(String dado){
        try {
            return Long.parseLong(dado);
        } catch (Exception e) {
            return null;
        }
    }
}
