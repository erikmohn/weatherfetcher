
package no.vindsiden.parser.impl.support.kystvaer;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class MessageAlarm {

    @SerializedName("Alarm")
    private Boolean mAlarm;
    @SerializedName("Name")
    private String mName;
    @SerializedName("No")
    private Long mNo;
    @SerializedName("Value")
    private Value mValue;

    public Boolean getAlarm() {
        return mAlarm;
    }

    public void setAlarm(Boolean alarm) {
        mAlarm = alarm;
    }

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

    public Value getValue() {
        return mValue;
    }

    public void setValue(Value value) {
        mValue = value;
    }

}
