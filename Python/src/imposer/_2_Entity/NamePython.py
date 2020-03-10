class Name:

    def __init__(self):
        self._title = "Mr"
        self._name = "John"

    @property
    def name(self):
        return self._title + " " + self._name

    @name.setter
    def name(self, value):
        print("setName says: %s", value)
        self._name = value

    @property
    def title(self):
        return self._title

    @title.setter
    def title(self, value):
        print("setTitle says: %s", value)
        self._title = value


def main():
    name = Name()
    print(name.title)
    print(name.name)
    name.title = "Mrs"


if __name__ == '__main__':
    main()
