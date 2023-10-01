package com.example.nurdauletproject.service;

import com.example.nurdauletproject.model.Organization;
import com.example.nurdauletproject.repository.OrganizationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrganizationService {

    private final OrganizationRepository organizationRepository;

    public Organization findOrganizationById(int id) {
        return organizationRepository.findById(id).get();
    }

    public List<Organization> findAllOrganizations() {
        return organizationRepository.findAll();
    }

    public void removeOrganizationById(int id) {
        organizationRepository.deleteById(id);
    }

    public Organization createOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }
}
