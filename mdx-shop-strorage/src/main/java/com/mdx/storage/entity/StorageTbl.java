package com.mdx.storage.entity;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Classname StorageTbl
 * @Description TODO
 * @Date 2023/3/27 12:15
 * @Created by baiyang
 */

@Data
@Entity
public class StorageTbl {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Integer id;

 private String commodityCode;

 private Integer count;
}