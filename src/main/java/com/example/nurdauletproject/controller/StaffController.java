package com.example.nurdauletproject.controller;


import com.example.nurdauletproject.model.Staff;
import com.example.nurdauletproject.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @GetMapping("/{id}")
    public Staff findStaffById(@PathVariable int id) {
        Staff staff = staffService.findStaffById(id);
        if(staff == null){
            throw new RuntimeException("There is no this staff");
        }
        return staff;
    }

    @DeleteMapping
    public String deleteStaffById(@PathVariable int id) {
        staffService.removeStaffById(id);
        return "removed Staff with ID: " + id;
    }

    @PostMapping
    public Staff createStaff(@RequestBody Staff staff) {
        return staffService.createStaff(staff);
    }

    @GetMapping
    public List<Staff> getAllStaff() {
        return staffService.findAllStaff();
    }




}
