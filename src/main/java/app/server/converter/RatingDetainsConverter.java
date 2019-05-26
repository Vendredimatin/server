package app.server.converter;

import app.server.bean.RatingDetails;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class RatingDetainsConverter implements AttributeConverter<RatingDetails,String> {
    @Override
    public String convertToDatabaseColumn(RatingDetails attribute) {
        return JSON.toJSONString(attribute);
    }

    @Override
    public RatingDetails convertToEntityAttribute(String dbData) {
        return JSONObject.parseObject(dbData,RatingDetails.class);
    }
}
