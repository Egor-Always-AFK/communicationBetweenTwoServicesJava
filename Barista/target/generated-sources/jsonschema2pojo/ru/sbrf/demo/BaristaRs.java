
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
    "CupOfCoffee",
    ""
})
@Generated("jsonschema2pojo")
public class BaristaRs {

    @JsonProperty("CupOfCoffee")
    private CupOfCoffee cupOfCoffee;
    @JsonProperty("")
    private Object __EMPTY__;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("CupOfCoffee")
    public CupOfCoffee getCupOfCoffee() {
        return cupOfCoffee;
    }

    @JsonProperty("CupOfCoffee")
    public void setCupOfCoffee(CupOfCoffee cupOfCoffee) {
        this.cupOfCoffee = cupOfCoffee;
    }

    @JsonProperty("")
    public Object get() {
        return __EMPTY__;
    }

    @JsonProperty("")
    public void set(Object __EMPTY__) {
        this.__EMPTY__ = __EMPTY__;
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
        sb.append(BaristaRs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cupOfCoffee");
        sb.append('=');
        sb.append(((this.cupOfCoffee == null)?"<null>":this.cupOfCoffee));
        sb.append(',');
        sb.append("__EMPTY__");
        sb.append('=');
        sb.append(((this.__EMPTY__ == null)?"<null>":this.__EMPTY__));
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
        result = ((result* 31)+((this.cupOfCoffee == null)? 0 :this.cupOfCoffee.hashCode()));
        result = ((result* 31)+((this.__EMPTY__ == null)? 0 :this.__EMPTY__.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BaristaRs) == false) {
            return false;
        }
        BaristaRs rhs = ((BaristaRs) other);
        return ((((this.cupOfCoffee == rhs.cupOfCoffee)||((this.cupOfCoffee!= null)&&this.cupOfCoffee.equals(rhs.cupOfCoffee)))&&((this.__EMPTY__ == rhs.__EMPTY__)||((this.__EMPTY__!= null)&&this.__EMPTY__.equals(rhs.__EMPTY__))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
