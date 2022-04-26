package student_aleksandrs_korsaks.ak_lesson_9.level_1;

class Man {
    String name;

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Man man)) return false;
        return getName().equals(man.getName());
    }
}
