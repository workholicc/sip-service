package org.workholick.sip.service.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 05-03-2022
 **/

@Getter
@Setter
@Entity
public class SipHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date dateOfHighReturn;

    private String nav;

    private String name;

}
