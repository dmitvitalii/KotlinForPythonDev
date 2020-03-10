package ru.yandex.imposter._3_FunctionsAndEnums;

public class UtilJava {

    public static String getMonday(Case c) throws UnsupportedCaseException {
        switch (c) {
            case NOMINATIVE:
                return "Понедельник";
            case GENITIVE:
                return "Понедельника";
            case DATIVE:
                return "Понедельнику";
            default:
                throw new UnsupportedCaseException("Не знаю что ты хочешь");

        }
    }
}
