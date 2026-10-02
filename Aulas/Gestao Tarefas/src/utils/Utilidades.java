package utils;

public class Utilidades {
    public static Long converterLong(String dado) {
        try {
            return Long.parseLong(dado.trim());
        } catch (Exception e) {
            return null;
        }
    }

    public static Integer converterInteger(String dado) {
        try {
            return Integer.parseInt(dado.trim()); /* esse .trim() é so pra evitar que id inserido com espaço funcione
                                                  * como por exemplo "5  ". */
        } catch (Exception e) {
            return null;
        }
    }
}
