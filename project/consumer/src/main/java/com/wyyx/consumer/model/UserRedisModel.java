package com.wyyx.consumer.model;

import lombok.Data;

import java.io.Serializable;

/**
 * **********************************************************
 *
 * @Project:  缓存专用的用户对象
 * @Author : Gavincoder
 * @Mail : xunyegege@gmail.com
 * @Github : https://github.com/xunyegege
 * @ver : version 1.0
 * @Date : 2019-10-17 11:51
 * @description:
 ************************************************************/
@Data
public class UserRedisModel  implements Serializable {

    private static final long serialVersionUID = -567136965701406919L;

    private long userID;
    private String userName;
    private String phone;


}