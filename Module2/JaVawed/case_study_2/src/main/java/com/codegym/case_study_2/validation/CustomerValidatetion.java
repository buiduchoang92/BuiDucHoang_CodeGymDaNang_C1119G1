package com.codegym.case_study_2.validation;

import com.codegym.case_study_2.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class CustomerValidatetion implements Validator {



    @Override
    public boolean supports(Class<?> aClass) {
        return Customer.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Customer customer = (Customer)o;
         String phoneCustomer = customer.getPhoneNumberCustomer();
        ValidationUtils.rejectIfEmpty(errors,"phoneCustomer","phoneCustomer.empty");
        if (!phoneCustomer.matches("(09[0|1])+([0-9]{8})")){
            errors.rejectValue("phoneCustomer","phoneCustomer.matches");
        }

//         [KH-\d]{4}
//            [0-9]{9}
//            (09[0|1])+([0-9]{8})\b
//            "(^$|[0-9]*$)"
    }
}
