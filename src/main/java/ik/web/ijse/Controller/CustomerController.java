package ik.web.ijse.Controller;

import ik.web.ijse.Dto.CustomerDto;
import ik.web.ijse.Entity.Customer;
import ik.web.ijse.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/customer")

public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping(consumes = MediaType.APPLICATION_ATOM_XML_VALUE,produces = MediaType.APPLICATION_ATOM_XML_VALUE)
    public String addCustomer(@RequestBody CustomerDto customerDto) {
        return customerService.saveCustomer(customerDto);
    }

    @PutMapping
    public String updateCustomer(@RequestBody CustomerDto customerDto){
        return customerService.updateCustomer(customerDto);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        System.out.println(id);
        customerService.deleteCustomer(id);

    }
    @GetMapping(value = "/findById/{id}")
    public Customer searchCustomer(@PathVariable Integer id){

        return customerService.searchCustomer(id);

    }@GetMapping()
    public List<CustomerDto> getAllCustomer(){
        System.out.println("BBB"+this.customerService.getAllCustomers());
        return customerService.getAllCustomers();

    }



}
