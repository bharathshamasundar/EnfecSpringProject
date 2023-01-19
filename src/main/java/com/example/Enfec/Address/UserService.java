package com.example.Enfec.Address;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<DisplayFields> getRequiredFields(User [] users){
        List<DisplayFields> displayFields = new ArrayList<>();
        for(User individialUser: users){
            displayFields.add(new DisplayFields(individialUser.getEmail(),individialUser.getUsername(),individialUser.getAddress().getZipCode()));
        }

        return displayFields;

    }
}
