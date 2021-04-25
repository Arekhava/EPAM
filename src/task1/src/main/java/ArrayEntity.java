package task1.src.main.java;

public class ArrayEntity {
    private Integer[] array;

    public ArrayEntity(Integer[] array) {
        this.array = array;
    }

    public Integer[] getArray() {
        return array;
    }

    @Override
    public String toString()
    {
        String result = "";
      if (array != null)
      {
          StringBuilder sb = new StringBuilder();
          for (Integer number : array)
          {
              sb.append(number);
              sb.append(",");
          }
          sb.deleteCharAt(sb.length() - 1);
          result = sb.toString();
      }
      return result;
    }
}