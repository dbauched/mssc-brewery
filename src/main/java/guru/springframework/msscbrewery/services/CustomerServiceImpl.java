package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerByID(UUID uuid) {
        return CustomerDto.builder()
                .uuid(UUID.randomUUID())
                .firstName("niven")
                .surName("lee")
                .build();
    }
}
