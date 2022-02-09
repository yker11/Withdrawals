package com.MsWithdrawals.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Setter
@Getter
@Document(collation = "Withdrawals")
public class Withdrawals {

    @Id
    private String id;
    private int withdrawals;
    private Date fecha;

}