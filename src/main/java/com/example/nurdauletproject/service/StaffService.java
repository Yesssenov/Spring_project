package com.example.nurdauletproject.service;

import com.example.nurdauletproject.model.Staff;
import com.example.nurdauletproject.repository.StaffRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StaffService {

    private final StaffRepository staffRepository;

    public Staff findStaffById(int staffId) {
        return staffRepository.findById(staffId).get();
    }

    public List<Staff> findAllStaff() {
        return staffRepository.findAll();
    }

    public void removeStaffById(int staffId) {
        staffRepository.deleteById(staffId);
    }

    public Staff createStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    public void removeAllStaff() {
        staffRepository.deleteAll();
    }


}
