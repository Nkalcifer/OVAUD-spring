package com.ovaud.app.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.core.serializer.support.SerializingConverter;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Rol implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "natinve")
    //@GenericGenerator(name="native", strategy="native")
    private long id;
    
    @Column
    private String name;

    @Column
    private String description;
    

    public Rol() {
    }

    @Override
    public String toString() {
        return "Rol []";
    }

    
}
