package ru.mtuci.labwork1.repository;

import ru.mtuci.labwork1.model.Student;

public class StudentsRepository extends AbstractRepository<Student> {
    public StudentsRepository() {
        super(Student.class);
    }
}
