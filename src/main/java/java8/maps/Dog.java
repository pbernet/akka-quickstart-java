package java8.maps;

class Dog implements Comparable<Dog> {
    String color;
    int size;

    Dog(String c, int s) {
        color = c;
        size = s;
    }
    public String toString(){
        return color + " dog" + " size " + size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return color != null ? color.equals(dog.color) : dog.color == null;
    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }


    @Override
    public int compareTo(Dog o) {
        return  this.size - o.size;
    }
}