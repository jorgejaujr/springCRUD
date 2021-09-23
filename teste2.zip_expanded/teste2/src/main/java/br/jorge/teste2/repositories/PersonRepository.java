package br.jorge.teste2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.jorge.teste2.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
