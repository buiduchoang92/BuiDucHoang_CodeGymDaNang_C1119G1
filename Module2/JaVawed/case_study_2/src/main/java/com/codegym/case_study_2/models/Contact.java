package com.codegym.case_study_2.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "contact_f")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContact;
    private String nameContact;
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private Date startDate;
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private Date endDate;
    private double downPayment;

    public Contact() {
    }

    private double totalMoney;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @ManyToOne
    @JoinColumn(name = "afk_employee_contact")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "afk_service_contact")
    private Services service;

    public Long getIdContact() {
        return idContact;
    }

    @OneToMany(mappedBy = "contact")
    private List<ContactDetails> contactDetails;

    public List<ContactDetails> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(List<ContactDetails> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public void setIdContact(Long idContact) {
        this.idContact = idContact;
    }

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }



    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }
    @ManyToOne
    @JoinColumn(name = "afk_contact_customer")
    private Customer customer;


}
