class Point:
    def __init__(self, x, y):
        self._x = x
        self._y = y

    def display(self):
        print(f"[{self._x}, {self._y}]")


class ThreedPoint(Point):
    def __init__(self, x, y, z):
        super().__init__(x, y)
        self._z = z

    def display(self):
        print(f"[{self._x}, {self._y}, {self._z}]")


def main():
    # Create a Point object (2D point)
    point2d = Point(2, 3)
    point2d.display()

    # Create a ThreedPoint object (3D point)
    point3d = ThreedPoint(4, 5, 6)
    point3d.display()


if __name__ == "__main__":
    main()