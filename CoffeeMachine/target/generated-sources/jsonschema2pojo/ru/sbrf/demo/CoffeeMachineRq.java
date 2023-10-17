
package ru.sbrf.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TypeOfCoffee",
    "Volume",
    "DegreeOfGrinding"
})
@Generated("jsonschema2pojo")
public class CoffeeMachineRq {

    @JsonProperty("TypeOfCoffee")
    private String typeOfCoffee;
    @JsonProperty("Volume")
    private Object volume;
    @JsonProperty("DegreeOfGrinding")
    private String degreeOfGrinding;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("TypeOfCoffee")
    public String getTypeOfCoffee() {
        return typeOfCoffee;
    }

    @JsonProperty("TypeOfCoffee")
    public void setTypeOfCoffee(String typeOfCoffee) {
        this.typeOfCoffee = typeOfCoffee;
    }

    @JsonProperty("Volume")
    public Object getVolume() {
        return volume;
    }

    @JsonProperty("Volume")
    public void setVolume(Object volume) {
        this.volume = volume;
    }

    @JsonProperty("DegreeOfGrinding")
    public String getDegreeOfGrinding() {
        return degreeOfGrinding;
    }

    @JsonProperty("DegreeOfGrinding")
    public void setDegreeOfGrinding(String degreeOfGrinding) {
        this.degreeOfGrinding = degreeOfGrinding;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CoffeeMachineRq.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("typeOfCoffee");
        sb.append('=');
        sb.append(((this.typeOfCoffee == null)?"<null>":this.typeOfCoffee));
        sb.append(',');
        sb.append("volume");
        sb.append('=');
        sb.append(((this.volume == null)?"<null>":this.volume));
        sb.append(',');
        sb.append("degreeOfGrinding");
        sb.append('=');
        sb.append(((this.degreeOfGrinding == null)?"<null>":this.degreeOfGrinding));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.volume == null)? 0 :this.volume.hashCode()));
        result = ((result* 31)+((this.degreeOfGrinding == null)? 0 :this.degreeOfGrinding.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.typeOfCoffee == null)? 0 :this.typeOfCoffee.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CoffeeMachineRq) == false) {
            return false;
        }
        CoffeeMachineRq rhs = ((CoffeeMachineRq) other);
        return (((((this.volume == rhs.volume)||((this.volume!= null)&&this.volume.equals(rhs.volume)))&&((this.degreeOfGrinding == rhs.degreeOfGrinding)||((this.degreeOfGrinding!= null)&&this.degreeOfGrinding.equals(rhs.degreeOfGrinding))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.typeOfCoffee == rhs.typeOfCoffee)||((this.typeOfCoffee!= null)&&this.typeOfCoffee.equals(rhs.typeOfCoffee))));
    }

}
