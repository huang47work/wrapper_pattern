package com.mason.wrapper.wrapper;

import com.mason.wrapper.base.Girl;

/**
 * Created by huang_sq on 2017/8/10.
 */
public class BlondeGirl extends GirlDecorator{

    private Girl girl;

    public BlondeGirl(Girl girl) {
        this.girl = girl;
    }

    public String whatIsThisGirlBeLike() {
        return girl.description + " and she is blonde";
    }
}
