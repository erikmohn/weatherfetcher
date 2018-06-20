
package no.vindsiden.parser.impl.support.kystvaer;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class FreeInterval {

    @SerializedName("Name")
    private String mName;
    @SerializedName("No")
    private Long mNo;
    @SerializedName("Unit")
    private String mUnit;
    @SerializedName("Value")
    private Value mValue;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Long getNo() {
        return mNo;
    }

    public void setNo(Long no) {
        mNo = no;
    }

    public String getUnit() {
        return mUnit;
    }

    public void setUnit(String unit) {
        mUnit = unit;
    }

    public Value getValue() {
        return mValue;
    }

    public void setValue(Value value) {
        mValue = value;
    }

}
