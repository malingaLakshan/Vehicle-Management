package ik.web.ijse.Service.ServiceImpl;

import ik.web.ijse.Dto.CustomerDto;
import ik.web.ijse.Entity.Customer;
import ik.web.ijse.Repositories.CustomerRepo;
import ik.web.ijse.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public String saveCustomer(CustomerDto customerDto) {
        Customer customer = new Customer(customerDto.getId(), customerDto.getNic(),
                customerDto.getName(), customerDto.getTp(), customerDto.getAddress());

        customerRepo.save(customer);
        System.out.println("malinga lakshan");
        return "DaTA sAVED";
    }

    @Override
    public String updateCustomer(CustomerDto customerDto) {
        String message = null;
        Customer customerEntity = new Customer(customerDto.getId(), customerDto.getNic(), customerDto.getName(),
                customerDto.getTp(), customerDto.getAddress());
        if (customerEntity.getId()!= null){
            customerRepo.save(customerEntity);
            return message = "Update Success";
        }
        return message = "update fail";
    }


    @Override
    public void deleteCustomer(Integer cusId) {

        customerRepo.deleteById(cusId);
    }

    @Override
    public Customer searchCustomer(Integer id) {

        Optional<Customer> customerEntity=this.customerRepo.findById(id);
        if(customerEntity.isPresent()){
            return customerEntity.get();

        }



        return null;


    }

    @Override
    public List<CustomerDto> getAllCustomers() {
        List<CustomerDto>list=new ArrayList<>();
        List<Customer> getAll=customerRepo.findAll();


        for(Customer c:getAll){
            list.add(new CustomerDto(c.getId(), c.getNic(), c.getName(),
                    c.getTp(), c.getAddress()));

        }

        return list;
    }
}

