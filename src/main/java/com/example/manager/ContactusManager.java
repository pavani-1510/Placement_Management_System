package com.example.manager;

import com.example.entity.ContactUs;
import com.example.repository.ContactusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactusManager {

    @Autowired
    private ContactusRepository contactUsRepository;

    public ContactUs saveContactUs(ContactUs contactUs) {
        return contactUsRepository.save(contactUs);
    }
}
