import org.junit.Test;

import java.math.BigDecimal;

/**
 * @Author: wujing
 * @Description: BigDecimal 测试操作对象的值是否改变
 *
 * 源码
 *  public BigDecimal subtract(BigDecimal subtrahend) {
 *         if (this.intCompact != INFLATED) {
 *             if ((subtrahend.intCompact != INFLATED)) {
 *                 return add(this.intCompact, this.scale, -subtrahend.intCompact, subtrahend.scale);
 *             } else {
 *                 return add(this.intCompact, this.scale, subtrahend.intVal.negate(), subtrahend.scale);
 *             }
 *         } else {
 *             if ((subtrahend.intCompact != INFLATED)) {
 *                 // Pair of subtrahend values given before pair of
 *                 // values from this BigDecimal to avoid need for
 *                 // method overloading on the specialized add method
 *                 return add(-subtrahend.intCompact, subtrahend.scale, this.intVal, this.scale);
 *             } else {
 *                 return add(this.intVal, this.scale, subtrahend.intVal.negate(), subtrahend.scale);
 *             }
 *         }
 *     }

 * @Date: 2020/11/19 15:39
 * @Version: 1.0
 */
public class TestBigDecimal {

    @Test
    public void test(){
        BigDecimal a = new BigDecimal(10);
        BigDecimal b = new BigDecimal(2);
        a.subtract(b);

        System.out.println("++++ a:"+a);
        System.out.println("++++ b:"+b);

    }
}
