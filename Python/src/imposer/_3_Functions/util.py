class UnsupportedCaseException(Exception):
    pass


def get_monday(case):
    if case == 1:
        return "Понедельник"
    if case == 2:
        return "Понедельника"
    if case == 3:
        return "Понедельнику"
    else:
        raise UnsupportedCaseException("Не знаю что ты хочешь")


def deep_thought():
    return 42


class UtilClass:

    @staticmethod
    def get_monday(case):
        if case == 1:
            return "Понедельник"
        if case == 2:
            return "Понедельника"
        if case == 3:
            return "Понедельнику"
        else:
            raise UnsupportedCaseException("Не знаю что ты хочешь")

    @staticmethod
    def deep_thought():
        return 42
