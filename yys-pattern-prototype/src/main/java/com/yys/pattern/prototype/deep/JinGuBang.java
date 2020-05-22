package com.yys.pattern.prototype.deep;

import lombok.Data;

import java.io.Serializable;

/**
 * 深克隆
 *      金箍棒
 * @author yys
 */
@Data
public class JinGuBang implements Serializable {

    private float h = 100;

    private float w = 10;

    public void big() {
        this.h *= 10;
        this.w *= 10;
    }

    public void small() {
        this.h /= 2;
        this.w /= 2;
    }

}
