package org.workholick.sip.service.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Anish Singh(workholicc@gmail.com)
 * <p>
 * 05-03-2022
 **/
@Getter
@Setter
@Entity
public class UserSip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id",referencedColumnName = "id")
    private Login user;

    @OneToOne
    @JoinColumn(name = "id",referencedColumnName = "id")
    private SipDetails sipDetails;
}
