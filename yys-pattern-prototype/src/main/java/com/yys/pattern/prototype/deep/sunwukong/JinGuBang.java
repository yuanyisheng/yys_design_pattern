package com.yys.pattern.prototype.deep.sunwukong;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 深克隆
 *      金箍棒
 * @author yys
 */
@Getter
@Setter
public class JinGuBang implements Serializable {

    private float h = 99;

    private float w = 9;

    public void big() {
        this.h *= 10;
        this.w *= 10;
    }

    public void small() {
        this.h /= 2;
        this.w /= 2;
    }

}
