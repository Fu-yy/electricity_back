package com.fuy.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 行业表    三大行业  多个小行业
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manufacts {

    private Integer manuId;
    private String manuName;
    private String owner;

}
