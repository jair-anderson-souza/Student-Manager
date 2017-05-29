/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.studentmanager.utils.converters;

import java.time.LocalDate;
import java.sql.Date;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author <a href="https://github.com/jass2125">Anderson Souza</a>
 * @since Apr 21, 2017 1:40:22 AM
 */
@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

    @Override
    public Date convertToDatabaseColumn(LocalDate localDate) {
        try {
            return Date.valueOf(localDate) == null ? null : Date.valueOf(localDate);
        } catch (NullPointerException e) {
        }
        return null;
    }

    @Override
    public LocalDate convertToEntityAttribute(Date date) {
        try {
            return date.toLocalDate() == null ? null : date.toLocalDate();
        } catch (NullPointerException e) {
        }
        return null;
    }
}
