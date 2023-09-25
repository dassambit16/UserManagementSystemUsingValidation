package com.assgnment.UserManagementSystemWithValidation.Repo;

import com.assgnment.UserManagementSystemWithValidation.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User, Long> {
}
