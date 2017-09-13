package com.detaysoft.spec;

import java.time.LocalDate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Subquery;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;

import com.detaysoft.entity.Users;
import com.detaysoft.entity.Person;
import com.detaysoft.entity.Project;
import com.detaysoft.entity.User_;

public class UserSpecification{


    public static Specification<?> getPerson() {
    	
        return (root, query, cb) -> {
        	
            return cb.equal(root.get("name"), "2");
        };
    }
    
    
    public static Specification<Users> getPersonUser(final Long personId) {
    	return new Specification<Users>() {
		@Override
		public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//			final Subquery<Long> personQuery = query.subquery(Long.class);
//            final Root<Users> user = personQuery.from(Users.class);
            final Join<Users, Person> users = root.join("persons");
            final Join<Person, Project> project = root.join("projects");
//            personQuery.select(notes.<Long> get("id"));
//            query.where(cb.equal(root.<Long> get("name"), personId));
//            return cb.
            return cb.in(root.get("id")).value(users).value(project);
		}
    	};
    	}

}