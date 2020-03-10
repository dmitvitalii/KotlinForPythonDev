def procedural_style():
    numbers = range(1, 100)
    result = []
    for i in numbers:
        if i % 16 == 0:
            result.append("0x$i")
    return result


def pythonic_style():
    numbers = range(1, 100)
    result = ['0x%d' % i for i in numbers if i % 16 == 0]
    return result


def function_style():
    numbers = range(1, 100)
    result = map(lambda i: '0x%d' % i, filter(lambda i: i % 16 == 0, numbers))
    return result
