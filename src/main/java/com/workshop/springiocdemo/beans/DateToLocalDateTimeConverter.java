package com.workshop.springiocdemo.beans;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateToLocalDateTimeConverter implements Converter<Date, LocalDateTime> {

    @Override
    public LocalDateTime convert (Date source) {
        return LocalDateTime.ofInstant(source.toInstant(),
                            ZoneId.systemDefault());
    }
}
