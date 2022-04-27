package org.incubyte.bank;

import io.micronaut.data.annotation.*;
import io.micronaut.data.model.*;
import io.micronaut.data.repository.CrudRepository;

@Repository
interface BranchRepository extends CrudRepository<Branch, Long> {

}