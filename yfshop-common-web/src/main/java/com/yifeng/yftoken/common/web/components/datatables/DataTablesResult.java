package com.yifeng.yfshop.common.web.components.datatables;

import com.yifeng.yfshop.common.dto.BaseResult;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * Bootstrap Datatables 结果街
 * <p>Title: DatatablesResult</p>
 * <p>Description: </p>
 *
 * @author YiFeng
 * @version 1.0.0
 * @date 2018/8/12 13:33
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class DataTablesResult extends BaseResult implements Serializable {
    private int draw;
    private int recordsTotal;
    private int recordsFiltered;
    private String error;
}
