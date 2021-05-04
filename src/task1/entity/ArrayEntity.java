package task1.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayEntity {
    static Logger logger=LogManager.getLogger();

    private Integer[] array;

    public ArrayEntity(Integer[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array should not be null!");
        }
        this.array = array;
    }

    public Integer[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        String result = "";
        if (array != null) {
            StringBuilder sb = new StringBuilder();
            for (Integer number : array) {
                sb.append(number);
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            result = sb.toString();
        } else {
            logger.info("Array=null");
        }
        return result;
    }
}