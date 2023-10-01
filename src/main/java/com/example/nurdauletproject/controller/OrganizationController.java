package com.example.nurdauletproject.controller;


import com.example.nurdauletproject.model.Organization;
import com.example.nurdauletproject.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/organization")
@AllArgsConstructor
public class OrganizationController {

    private final OrganizationService organizationService;

    @RequestMapping("/{id}")
    public Organization findOrganizationById(@PathVariable int id) {
        Optional<Organization> optional = Optional.of(organizationService.findOrganizationById(id));
        return optional.orElse(null);

    }

    @GetMapping
    public List<Organization> findAllOrganizations(){
        return organizationService.findAllOrganizations();
    }


    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        organizationService.removeOrganizationById(id);
        return "Organization deleted with id: " + id;
    }


}
