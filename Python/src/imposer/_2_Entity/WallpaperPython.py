



class Wallpaper:

    def __init__(self, name, images, size=()):
        self.name = name
        self.images = images
        self.size = size

    def __repr__(self) -> str:
        return 'Wallpaper<name=%s, covers=%s, images=%s>' % (
            self.name, self.size, self.images
        )

    def __hash__(self) -> int:
        return (self.name.__hash__()
                + self.size.__hash__()
                + self.images.__hash__())

    def __eq__(self, o: object) -> bool:
        return super().__eq__(o)
