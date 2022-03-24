package com.springbatchexample.component;

import com.springbatchexample.entity.Student;
import org.springframework.batch.item.validator.ValidationException;
import org.springframework.batch.item.validator.Validator;

public class StudentValidator implements Validator<Student> {

    @Override
    public void validate(Student student) throws ValidationException {

        if (student.getId() == null) {

            throw new ValidationException("id must not be null");
        }
        if (student.getName() == null) {
            throw new ValidationException("name must not be null");
        }
    }
}
