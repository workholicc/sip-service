package org.workholick.sip.service.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 05-03-2022
 **/
@Getter
@Setter
@Entity
public class Sip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String folioNumber;
}
