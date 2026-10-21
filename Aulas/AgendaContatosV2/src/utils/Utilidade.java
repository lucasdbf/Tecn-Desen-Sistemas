package utils;

public class Utilidade {

    public static Long converterLong(String dado) {
        try {
            return Long.parseLong(dado);
        } catch (Exception e) {
            return null;
        }
    }

    public static Integer converterInteger(String dado) {
        try {
            return Integer.parseInt(dado);
        } catch (Exception e) {
            return null;
        }
    }

    public static Double converterDouble(String dado) {
        try {
            return Double.parseDouble(dado);
        } catch (Exception e) {
            return null;
        }
    }

}
