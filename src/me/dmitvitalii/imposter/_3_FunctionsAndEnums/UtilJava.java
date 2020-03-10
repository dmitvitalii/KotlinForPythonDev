package me.dmitvitalii.imposter._3_FunctionsAndEnums;

public class UtilJava {

    public static String getMonday(Case aCase) throws UnsupportedCaseException {
        switch (aCase) {
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
