package org.itstack.behavioralPattern.commandPattern;

import org.itstack.behavioralPattern.commandPattern.XiaoEr;
import org.itstack.behavioralPattern.commandPattern.cook.impl.GuangDongCook;
import org.itstack.behavioralPattern.commandPattern.cook.impl.JiangSuCook;
import org.itstack.behavioralPattern.commandPattern.cook.impl.ShanDongCook;
import org.itstack.behavioralPattern.commandPattern.cook.impl.SiChuanCook;
import org.itstack.behavioralPattern.commandPattern.cuisine.ICuisine;
import org.itstack.behavioralPattern.commandPattern.cuisine.impl.GuangDoneCuisine;
import org.itstack.behavioralPattern.commandPattern.cuisine.impl.JiangSuCuisine;
import org.itstack.behavioralPattern.commandPattern.cuisine.impl.ShanDongCuisine;
import org.itstack.behavioralPattern.commandPattern.cuisine.impl.SiChuanCuisine;
import org.junit.jupiter.api.Test;

public class test {
    @Test
    public void test(){
        ICuisine guangDoneCuisine = new GuangDoneCuisine(new GuangDongCook());
        JiangSuCuisine jiangSuCuisine = new JiangSuCuisine(new JiangSuCook());
        ShanDongCuisine shanDongCuisine = new ShanDongCuisine(new ShanDongCook());
        SiChuanCuisine siChuanCuisine = new SiChuanCuisine(new SiChuanCook());
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(guangDoneCuisine);
        xiaoEr.order(jiangSuCuisine);
        xiaoEr.order(shanDongCuisine);
        xiaoEr.order(siChuanCuisine);

        xiaoEr.placeOrder();
    }
}
