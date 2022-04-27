package org.incubyte.bank;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.incubyte.response.ResponseWrapper;

import java.util.Optional;

@Singleton
public class BankService {
    @Inject
    BranchRepository branchRepository;
    public String welcome() {
        return "Hello World!";
    }

    public Branch save(Branch branch) {
        return branchRepository.save(branch);
    }

    public ResponseWrapper getById(Long id) {

        Optional<Branch> branchMaybe = branchRepository.findById(id);
        if(branchMaybe.isPresent()){
            return new ResponseWrapper<Branch>(branchMaybe.get(),"Success");
        }else{
            return new ResponseWrapper<String>("","Branch not found");
        }

    }
}
