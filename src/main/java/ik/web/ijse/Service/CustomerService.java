package ik.web.ijse.Service;

import ik.web.ijse.Dto.CustomerDto;
import ik.web.ijse.Entity.Customer;

import java.util.List;

public interface CustomerService  {
    String saveCustomer(CustomerDto customerDto);

    String updateCustomer(CustomerDto customerDto);

    void deleteCustomer(Integer id);

    Customer searchCustomer(Integer id);

    List<CustomerDto> getAllCustomers();
}
