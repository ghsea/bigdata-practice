package ghsea.github.com.spark.hive;

import java.io.Serializable;

/**
 * description:
 *
 * @author skyhaigu
 *         date:   2022/4/6 11:26
 */
public class Record  implements Serializable {

    private int key;
    private String value;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
