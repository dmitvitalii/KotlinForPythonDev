package ru.yandex.imposter._2_Entity;

import java.util.List;
import java.util.Objects;

public class WallpaperJava {
    String name;
    Size size;
    List<String> images;

    public WallpaperJava(String name, Size size, List<String> images) {
        this.name = name;
        this.size = size;
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public List<String> getImages() {
        return images;
    }
}













class DataWallpaperJava {
    String name;
    Size size;
    List<String> images;

    public DataWallpaperJava(String name, Size size, List<String> images) {
        this.name = name;
        this.size = size;
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public List<String> getImages() {
        return images;
    }

    @Override
    public String toString() {
        return "DataWallpaperJava{" +
                "name='" + name + '\'' +
                ", covers=" + size +
                ", images=" + images +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataWallpaperJava that = (DataWallpaperJava) o;
        return Objects.equals(getName(), that.getName()) &&
                Objects.equals(getSize(), that.getSize()) &&
                Objects.equals(getImages(), that.getImages());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSize(), getImages());
    }
}



class Size {
    int width;
    int height;

    public Size(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

