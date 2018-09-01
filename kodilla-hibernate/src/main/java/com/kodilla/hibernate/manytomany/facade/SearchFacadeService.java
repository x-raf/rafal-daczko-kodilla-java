package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchFacadeService {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacadeService.class);

    public List<Company> findCompany(final String companyPartName) {
        try {
            LOGGER.info("Companies search finished");
            return companyDao.findCompanyContainsChars(companyPartName);
        } catch (Exception e) {
            LOGGER.error("Nothing to display, error." + e.getMessage());
            return new ArrayList<>();
        }
    }

    public List<Employee> findEmployee(final String employeePartName) {
        try {
            LOGGER.info("Employees search finished");
            return employeeDao.findEmployeeContainsChars(employeePartName);
        } catch (Exception e) {
            LOGGER.error("Nothing to display, error." + e.getMessage());
            return new ArrayList<>();
        }
    }
}
