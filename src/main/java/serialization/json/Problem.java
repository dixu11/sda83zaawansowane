package serialization.json;

import com.fasterxml.jackson.annotation.JsonProperty;

class Problem {

    //sposób na skorygowanie niezgodności w nazwie

    //@JsonProperty(value = "snake_case_field")
    private String snakeCaseField;
    //@JsonProperty(value = "dont_map_me")
  //  private String dontMapMe;
    

    public Problem() {

    }

   public String getSnakeCaseField() {
        return snakeCaseField;
    }



    @Override
    public String toString() {
        return "Problem{" +
                "snakeCaseField='" + snakeCaseField + '\'' +
                '}';
    }
}
