package com.mason.wrapper;

import com.mason.wrapper.base.Girl;
import com.mason.wrapper.specific.AmericanGirl;
import com.mason.wrapper.wrapper.BlondeGirl;
import com.mason.wrapper.wrapper.GirlDecorator;

/**
 * Created by huang_sq on 2017/8/10.
 */
public class TestCase {



    public static void main(String[] args) {
        Girl girl = new AmericanGirl();
        System.out.println(girl.whatThisGirlLike());

        GirlDecorator blondGirl = new BlondeGirl(girl);
        System.out.println(blondGirl.whatIsThisGirlBeLike());

    }

}
