package app.server.converter;

import app.server.bean.RatingDetail;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class RatingDetainsConverter implements AttributeConverter<RatingDetail,String> {
    @Override
    public String convertToDatabaseColumn(RatingDetail attribute) {
        return JSON.toJSONString(attribute);
    }

    @Override
    public RatingDetail convertToEntityAttribute(String dbData) {
        return JSONObject.parseObject(dbData, RatingDetail.class);
    }
}
