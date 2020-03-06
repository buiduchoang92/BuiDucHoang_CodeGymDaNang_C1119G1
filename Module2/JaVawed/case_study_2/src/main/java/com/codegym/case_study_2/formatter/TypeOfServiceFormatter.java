//package com.codegym.case_study_2.formatter;
//
//import com.codegym.case_study_2.models.TypeOfService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.format.Formatter;
//
//import java.text.ParseException;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.time.format.DateTimeParseException;
//import java.util.Locale;
//
//public class TypeOfServiceFormatter implements Formatter<TypeOfService> {
//
//    private TypeOfService typeOfService;
//    private String nameTypeOfService;
//    @Autowired
//    public TypeOfServiceFormatter(String nameTypeOfService) {
//        this.nameTypeOfService = nameTypeOfService;
//    }
//
//    public TypeOfServiceFormatter() {
//    }
//
//    @Override
//    public TypeOfService parse(String s, Locale locale) throws ParseException {
//        return TypeOfService;
//
//    }
//
//    @Override
//    public String print(TypeOfService typeOfService, Locale locale) {
//        return  "[" + typeOfService.getIdTypeOfService() + ", " +typeOfService.getNameTypeOfService() + "]";
//    }
//}
