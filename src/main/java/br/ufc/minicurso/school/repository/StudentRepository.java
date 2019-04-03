package br.ufc.minicurso.school.repository;

import org.springframework.data.repository.CrudRepository;

import br.ufc.minicurso.school.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{

}
